package com.samish.teleeducation;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.telephony.TelephonyManager;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Iterator;
import java.util.List;


public class Ques_Taluk extends ActionBarActivity {

    String imei;
    String t;
    String foname;
    String tiname;
    String t1;
    String t2;
    String t3;
    String t4;
    String t5;
    String t5_moderator;
    String t6;
    String t7;
    String t8;
    String t9;
    String t10;
    String t5_comment;
    boolean t1b,t2b,t3b,t4b,t5b,t6b,t7b,t8b,t9b,t10b;
    SharedPreferences sharedPref;

    DatabaseHandler db;
    ProgressDialog progress;
    String m_Text="";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        Resources res=getResources();
        ab.setTitle(name);
        t=name;

        FragmentManager mFragmentManager = getFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        SettingsFragment mPrefsFragment1 = new SettingsFragment();
        mFragmentTransaction.replace(android.R.id.content, mPrefsFragment1);
        mFragmentTransaction.commit();
        db = new DatabaseHandler(this);
        //SQLiteDatabase db1 = this.getWritableDatabase();
        //db.onCreate(db1);

        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        imei=telephonyManager.getDeviceId();



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.clear();
        editor.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ques, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.save_and_continue:



                sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                foname = sharedPref.getString("pref_key_fo_name", " ");
                tiname = sharedPref.getString("pref_key_ti_name", " ");
                t1b = sharedPref.getBoolean("pref_key_t1", false);
                t1 = (t1b) ? "Yes" : "No";
                t2b = sharedPref.getBoolean("pref_key_t2", false);
                t2 = (t2b) ? "Yes" : "No";
                t3b = sharedPref.getBoolean("pref_key_t3", false);
                t3 = (t3b) ? "Yes" : "No";
                t4b = sharedPref.getBoolean("pref_key_t4", false);
                t4 = (t4b) ? "Yes" : "No";
                t5b = sharedPref.getBoolean("pref_key_t5", false);
                t5 = (t5b) ? "Yes" : "No";
                t5_moderator = sharedPref.getString("pref_t5_moderator", " ");
                t6b = sharedPref.getBoolean("pref_key_t6", false);
                t6 = (t6b) ? "Yes" : "No";
                t7b = sharedPref.getBoolean("pref_key_t7", false);
                t7 = (t7b) ? "Yes" : "No";
                t8b = sharedPref.getBoolean("pref_key_t8", false);
                t8 = (t8b) ? "Yes" : "No";
                t9b = sharedPref.getBoolean("pref_key_t9", false);
                t9 = (t9b) ? "Yes" : "No";
                t10b = sharedPref.getBoolean("pref_key_t10", false);
                t10 = (t10b) ? "Yes" : "No";
                t5_comment = sharedPref.getString("pref_tcomment", " ");

                if ((foname.equals(" ")) || foname.length() == 0) {
                    Toast.makeText(this, "ENTER A VALID FIELD OFFICER'S NAME", Toast.LENGTH_SHORT).show();
                }
                if (tiname.equals(" ") || tiname.length() == 0) {
                    Toast.makeText(this, "ENTER A VALID TALUK INCHARGE'S NAME", Toast.LENGTH_SHORT).show();
                } else {

                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Enter the validation code");

                    final EditText input = new EditText(this);

                    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    builder.setView(input);

                    builder.setPositiveButton("Enter", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            m_Text = input.getText().toString();
                            if (m_Text.equals("tele")) {


                                db.insert_taluk(t, foname, tiname, t1, t2, t3, t4, t5, t5_moderator, t6, t7, t8, t9, t10, t5_comment);
                                Toast.makeText(getApplicationContext(), "Data Saved", Toast.LENGTH_SHORT).show();

                                ok();


                            } else if (!m_Text.equals("tele")) {
                                Toast.makeText(getApplicationContext(), "Validation failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });


                    builder.show();

                }

                return true;
            case R.id.save_and_exit:
                sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                foname = sharedPref.getString("pref_key_fo_name", " ");
                tiname = sharedPref.getString("pref_key_ti_name", " ");
                t1b = sharedPref.getBoolean("pref_key_t1", false);
                t1 = (t1b) ? "Yes" : "No";
                t2b = sharedPref.getBoolean("pref_key_t2", false);
                t2 = (t2b) ? "Yes" : "No";
                t3b = sharedPref.getBoolean("pref_key_t3", false);
                t3 = (t3b) ? "Yes" : "No";
                t4b = sharedPref.getBoolean("pref_key_t4", false);
                t4 = (t4b) ? "Yes" : "No";
                t5b = sharedPref.getBoolean("pref_key_t5", false);
                t5 = (t5b) ? "Yes" : "No";
                t5_moderator = sharedPref.getString("pref_t5_moderator", " ");
                t6b = sharedPref.getBoolean("pref_key_t6", false);
                t6 = (t6b) ? "Yes" : "No";
                t7b = sharedPref.getBoolean("pref_key_t7", false);
                t7 = (t7b) ? "Yes" : "No";
                t8b = sharedPref.getBoolean("pref_key_t8", false);
                t8 = (t8b) ? "Yes" : "No";
                t9b = sharedPref.getBoolean("pref_key_t9", false);
                t9 = (t9b) ? "Yes" : "No";
                t10b = sharedPref.getBoolean("pref_key_t10", false);
                t10 = (t10b) ? "Yes" : "No";
                t5_comment = sharedPref.getString("pref_tcomment", " ");

                if ((foname.equals(" ")) || foname.length() == 0) {
                    Toast.makeText(this, "ENTER A VALID FIELD OFFICER'S NAME", Toast.LENGTH_SHORT).show();
                }
                if (tiname.equals(" ") || tiname.length() == 0) {
                    Toast.makeText(this, "ENTER A VALID TALUK INCHARGE'S NAME", Toast.LENGTH_SHORT).show();
                } else {

                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Enter the validation code");

                    final EditText input = new EditText(this);

                    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    builder.setView(input);

                    builder.setPositiveButton("Enter", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            m_Text = input.getText().toString();
                            if (m_Text.equals("tele")) {


                                db.insert_taluk(t, foname, tiname, t1, t2, t3, t4, t5, t5_moderator, t6, t7, t8, t9, t10, t5_comment);
                                Toast.makeText(getApplicationContext(), "Data Saved", Toast.LENGTH_SHORT).show();

                                ok_exit();


                            } else if (!m_Text.equals("tele")) {
                                Toast.makeText(getApplicationContext(), "Validation failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });


                    builder.show();


                }
                return true;


            case R.id.exit:
                sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor1 = sharedPref.edit();
                editor1.clear();
                editor1.commit();
                Intent intent1 = new Intent(this, MainActivity.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent1.putExtra("Exit", true);
                startActivity(intent1);
                finish();

                return true;
            case R.id.continue_nosave:
                sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.clear();
                editor.commit();

                Intent main1 = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(main1);


                return true;

            case R.id.refresh:
                sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor4 = sharedPref.edit();
                editor4.clear();
                editor4.commit();
                finish();
                Intent ref = new Intent(getApplicationContext(), Ques_Taluk.class);
                ref.putExtra("Name", t);
                startActivity(ref);


                return true;

            case R.id.upload:

                progress = new ProgressDialog(this);
                progress.setMessage("Uploading Data");
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.setIndeterminate(true);
                progress.setProgress(0);


                final int totalProgressTime = 100;

                sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                foname = sharedPref.getString("pref_key_fo_name", " ");
                tiname = sharedPref.getString("pref_key_ti_name", " ");
                t1b = sharedPref.getBoolean("pref_key_t1", false);
                t1 = (t1b) ? "Yes" : "No";
                t2b = sharedPref.getBoolean("pref_key_t2", false);
                t2 = (t2b) ? "Yes" : "No";
                t3b = sharedPref.getBoolean("pref_key_t3", false);
                t3 = (t3b) ? "Yes" : "No";
                t4b = sharedPref.getBoolean("pref_key_t4", false);
                t4 = (t4b) ? "Yes" : "No";
                t5b = sharedPref.getBoolean("pref_key_t5", false);
                t5 = (t5b) ? "Yes" : "No";
                t5_moderator = sharedPref.getString("pref_t5_moderator", " ");
                t6b = sharedPref.getBoolean("pref_key_t6", false);
                t6 = (t6b) ? "Yes" : "No";
                t7b = sharedPref.getBoolean("pref_key_t7", false);
                t7 = (t7b) ? "Yes" : "No";
                t8b = sharedPref.getBoolean("pref_key_t8", false);
                t8 = (t8b) ? "Yes" : "No";
                t9b = sharedPref.getBoolean("pref_key_t9", false);
                t9 = (t9b) ? "Yes" : "No";
                t10b = sharedPref.getBoolean("pref_key_t10", false);
                t10 = (t10b) ? "Yes" : "No";
                t5_comment = sharedPref.getString("pref_tcomment", " ");

                if ((foname.equals(" ")) || foname.length() == 0) {
                    progress.hide();
                    Toast.makeText(this, "ENTER A VALID FIELD OFFICER'S NAME", Toast.LENGTH_SHORT).show();

                }
                if (tiname.equals(" ") || tiname.length() == 0) {
                    progress.hide();
                    Toast.makeText(this, "ENTER A VALID TALUK INCHARGE'S NAME", Toast.LENGTH_SHORT).show();
                } else {

                    if(isOnline(getApplicationContext()) && checkInternetConnection()) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("Enter the validation code");

                        final EditText input = new EditText(this);

                        input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        builder.setView(input);


                        builder.setPositiveButton("Enter", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                m_Text = input.getText().toString();
                                if (m_Text.equals("tele")) {
                                    progress.show();

                                    db.insert_taluk(t, foname, tiname, t1, t2, t3, t4, t5, t5_moderator, t6, t7, t8, t9, t10, t5_comment);

                                    new Thread(new Runnable() {


                                        @Override
                                        public void run() {
                                            // TODO Auto-generated method stub


                                            runOnUiThread(new Runnable() {
                                                public void run() {
                                                    // messageText.setText("uploading started.....");


                                                }

                                            });

                                            int jumpTime = 0;


                                            while (jumpTime < totalProgressTime) {
                                                jumpTime += 3;
                                                progress.setProgress(jumpTime);

                                            }

                                            //db.uploadOldData();
                                            uploadTaluk();

                                            progress.dismiss();


                                        }
                                    }).start();

                                    Toast.makeText(getApplicationContext(), "Data Saved and Uploaded", Toast.LENGTH_SHORT).show();
                                    ok();


                                } else if (!m_Text.equals("tele")) {
                                    Toast.makeText(getApplicationContext(), "Validation failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });


                        builder.show();
                    }else{
                        Toast.makeText(getApplicationContext(), "No internet access", Toast.LENGTH_SHORT).show();

                    }



                    }




            default:
                return super.onOptionsItemSelected(item);
        }




    }

    public static boolean isOnline(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public boolean checkInternetConnection()
    {

        ConnectivityManager connectivity = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivity != null)
        {
            NetworkInfo[] inf = connectivity.getAllNetworkInfo();
            if (inf != null)
                for (int i = 0; i < inf.length; i++)
                    if (inf[i].getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }

        }
        return false;
    }


    void ok(){
        sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor5 = sharedPref.edit();
        editor5.clear();
        editor5.commit();
        Intent main2 = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(main2);
    }

    void ok_exit(){
        sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor1 = sharedPref.edit();
        editor1.clear();
        editor1.commit();
        Intent intent1 = new Intent(this, MainActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent1.putExtra("Exit", true);
        startActivity(intent1);
        finish();
    }



    void uploadTaluk()
    {

        try
        {
            List<String> name=db.values();
            Iterator<String> itr=name.iterator();
            while(itr.hasNext()) {
                int id=Integer.parseInt(itr.next());
                CALLWSDOTNET objWS = new CALLWSDOTNET("http://203.129.241.19/is/Service.asmx");
                objWS.AddPropertyInfo("PASSWORD", "ii@m_s_urv@y@eg@", CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("IMEI", imei, CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("ID", id, CALLWSDOTNET.datatype.INTEGER);
                objWS.AddPropertyInfo("Taluk_Name", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Field_Officer_Name", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Taluk_Incharge_Name", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Is_TI_given_proper_training_to_update_OMS", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Does_TI_understand_the_OMS_tool", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Is_The_TI_able_to_make_daily_updates_in_OMS", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Is_TI_able_to_solve_the_problem_in_school_if_any_complaint_is_received",itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Does_ti_have_a_panel_of_moderators", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Moderator_details_Name_School_Class_Sbject_Date", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Whether_Moderator_has_been_trained", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Whether_ti_have_adetailed_plan_for_3_days", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Is_the_detailed_plan_put_oms_tool", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("is_ti_cooperative", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Are_spare_parts_available_in_location", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Comments", itr.next(), CALLWSDOTNET.datatype.STRING);

                if(itr.next().equals("0")) {
                    objWS.invokeWebService("UpdateTalukSurvey");
                    db.markUpload(id);
                }
            }


        }
        catch(Exception ex)
        {
            String strEx=ex.getMessage();
            strEx="";

        }
    }



    public static class SettingsFragment extends PreferenceFragment  {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.pref_ques_taluk);




        }
    }
}
