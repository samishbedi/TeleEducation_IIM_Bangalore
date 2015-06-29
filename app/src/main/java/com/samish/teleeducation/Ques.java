package com.samish.teleeducation;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
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


public class Ques extends ActionBarActivity {

    SharedPreferences sharedPref;

    String vname;
    String tname;
    String fo_name_school;
    String bc;
    String laptop;
    String proj;
    String modem;
    String hugh;
    String mob;
    String ant;
    String sol;
    String ups;
    String classcond;
    String crowd;
    String strt;
    String prnt;
    String notes;
    String prop;
    String atten;
    String clr;
    String dbt;
    String teacher;
    String vsc;
    String vsc1;
    String rsn;
    String scomment;


    boolean bcb,laptopb,projb,modemb,hughb,mobb,antb,solb,upsb,classcondb,crowdb,notesb,propb,attenb,clrb,dbtb,teacherb,vscb,vsc1b;
    DatabaseHandler db;
    String name;
    String imei;
    ProgressDialog progress;
    String m_Text="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        Intent intent = getIntent();
        name = intent.getStringExtra("Sname");
        vname = intent.getStringExtra("Vname");
        tname = intent.getStringExtra("Tname");
        Resources res=getResources();
        ab.setTitle(name);

        FragmentManager mFragmentManager = getFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        SettingsFragment mPrefsFragment = new SettingsFragment();
        mFragmentTransaction.replace(android.R.id.content, mPrefsFragment);
        mFragmentTransaction.commit();
        db = new DatabaseHandler(this);

        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        imei=telephonyManager.getDeviceId();





    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ques, menu);
        return true;
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
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.save_and_continue:
                sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                fo_name_school = sharedPref.getString("pref_key_fo_name1", " ");
                bcb = sharedPref.getBoolean("pref_key_bc", false);
                bc = (bcb) ? "Yes" : "No";
                laptopb = sharedPref.getBoolean("pref_key_laptop", false);
                laptop = (laptopb) ? "Yes" : "No";
                projb = sharedPref.getBoolean("pref_key_proj", false);
                proj = (projb) ? "Yes" : "No";
                modemb = sharedPref.getBoolean("pref_key_mod", false);
                modem = (modemb) ? "Yes" : "No";
                hughb = sharedPref.getBoolean("pref_key_hugh", false);
                hugh = (hughb) ? "Yes" : "No";
                antb = sharedPref.getBoolean("pref_key_ant", false);
                ant = (antb) ? "Yes" : "No";
                solb = sharedPref.getBoolean("pref_key_sol", false);
                sol = (solb) ? "Yes" : "No";
                mobb = sharedPref.getBoolean("pref_key_mob", false);
                mob = (mobb) ? "Yes" : "No";
                upsb = sharedPref.getBoolean("pref_key_ups", false);
                ups = (upsb) ? "Yes" : "No";
                classcondb = sharedPref.getBoolean("pref_key_classcond", false);
                classcond = (classcondb) ? "Yes" : "No";
                crowdb = sharedPref.getBoolean("pref_key_crowd", false);
                crowd = (crowdb) ? "Yes" : "No";
                notesb = sharedPref.getBoolean("pref_key_notes", false);
                notes = (notesb) ? "Yes" : "No";
                propb = sharedPref.getBoolean("pref_key_prop", false);
                prop = (propb) ? "Yes" : "No";
                attenb = sharedPref.getBoolean("pref_key_atten", false);
                atten = (attenb) ? "Yes" : "No";
                clrb = sharedPref.getBoolean("pref_key_clr", false);
                clr = (clrb) ? "Yes" : "No";
                dbtb = sharedPref.getBoolean("pref_key_dbt", false);
                dbt = (dbtb) ? "Yes" : "No";
                teacherb = sharedPref.getBoolean("pref_key_teacher", false);
                teacher = (teacherb) ? "Yes" : "No";
                vscb = sharedPref.getBoolean("pref_key_vsc", false);
                vsc = (vscb) ? "Yes" : "No";
                vsc1b = sharedPref.getBoolean("pref_key_vsc_1", false);
                vsc1 = (vsc1b) ? "Yes" : "No";

                strt = sharedPref.getString("pref_key_strt", "0");
                prnt = sharedPref.getString("pref_key_prnt", "0");
                rsn = sharedPref.getString("pref_rsn", " ");
                scomment = sharedPref.getString("pref_comment", " ");

                if ((fo_name_school.equals(" ")) || fo_name_school.length() == 0) {
                    Toast.makeText(this, "ENTER A VALID FIELD OFFICER'S NAME", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(prnt) > Integer.parseInt(strt)) {
                    Toast.makeText(this, "ENTER VALID VALUES FOR STRENTH AND PRESENCE OF STUDENTS", Toast.LENGTH_SHORT).show();
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


                                db.insert_school(tname, vname, name, fo_name_school, bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment);
                                // bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment
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
                fo_name_school = sharedPref.getString("pref_key_fo_name1", " ");
                bcb = sharedPref.getBoolean("pref_key_bc", false);
                bc = (bcb) ? "Yes" : "No";
                laptopb = sharedPref.getBoolean("pref_key_laptop", false);
                laptop = (laptopb) ? "Yes" : "No";
                projb = sharedPref.getBoolean("pref_key_proj", false);
                proj = (projb) ? "Yes" : "No";
                modemb = sharedPref.getBoolean("pref_key_mod", false);
                modem = (modemb) ? "Yes" : "No";
                hughb = sharedPref.getBoolean("pref_key_hugh", false);
                hugh = (hughb) ? "Yes" : "No";
                antb = sharedPref.getBoolean("pref_key_ant", false);
                ant = (antb) ? "Yes" : "No";
                solb = sharedPref.getBoolean("pref_key_sol", false);
                sol = (solb) ? "Yes" : "No";
                mobb = sharedPref.getBoolean("pref_key_mob", false);
                mob = (mobb) ? "Yes" : "No";
                upsb = sharedPref.getBoolean("pref_key_ups", false);
                ups = (upsb) ? "Yes" : "No";
                classcondb = sharedPref.getBoolean("pref_key_classcond", false);
                classcond = (classcondb) ? "Yes" : "No";
                crowdb = sharedPref.getBoolean("pref_key_crowd", false);
                crowd = (crowdb) ? "Yes" : "No";
                notesb = sharedPref.getBoolean("pref_key_notes", false);
                notes = (notesb) ? "Yes" : "No";
                propb = sharedPref.getBoolean("pref_key_prop", false);
                prop = (propb) ? "Yes" : "No";
                attenb = sharedPref.getBoolean("pref_key_atten", false);
                atten = (attenb) ? "Yes" : "No";
                clrb = sharedPref.getBoolean("pref_key_clr", false);
                clr = (clrb) ? "Yes" : "No";
                dbtb = sharedPref.getBoolean("pref_key_dbt", false);
                dbt = (dbtb) ? "Yes" : "No";
                teacherb = sharedPref.getBoolean("pref_key_teacher", false);
                teacher = (teacherb) ? "Yes" : "No";
                vscb = sharedPref.getBoolean("pref_key_vsc", false);
                vsc = (vscb) ? "Yes" : "No";
                vsc1b = sharedPref.getBoolean("pref_key_vsc_1", false);
                vsc1 = (vsc1b) ? "Yes" : "No";

                strt = sharedPref.getString("pref_key_strt", "0");
                prnt = sharedPref.getString("pref_key_prnt", "0");
                rsn = sharedPref.getString("pref_rsn", " ");
                scomment = sharedPref.getString("pref_comment", " ");

                if ((fo_name_school.equals(" ")) || fo_name_school.length() == 0) {
                    Toast.makeText(this, "ENTER A VALID FIELD OFFICER'S NAME", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(prnt) > Integer.parseInt(strt)) {
                    Toast.makeText(this, "ENTER VALID VALUES FOR STRENGTH AND PRESENCE OF STUDENTS IN CLASS", Toast.LENGTH_SHORT).show();
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


                                db.insert_school(tname, vname, name, fo_name_school, bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment);
                                // bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment
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
                ok_exit();

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
                Intent ref = new Intent(getApplicationContext(), Ques.class);
                ref.putExtra("Sname", name);
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
                fo_name_school = sharedPref.getString("pref_key_fo_name1", " ");
                bcb = sharedPref.getBoolean("pref_key_bc", false);
                bc = (bcb) ? "Yes" : "No";
                laptopb = sharedPref.getBoolean("pref_key_laptop", false);
                laptop = (laptopb) ? "Yes" : "No";
                projb = sharedPref.getBoolean("pref_key_proj", false);
                proj = (projb) ? "Yes" : "No";
                modemb = sharedPref.getBoolean("pref_key_mod", false);
                modem = (modemb) ? "Yes" : "No";
                hughb = sharedPref.getBoolean("pref_key_hugh", false);
                hugh = (hughb) ? "Yes" : "No";
                antb = sharedPref.getBoolean("pref_key_ant", false);
                ant = (antb) ? "Yes" : "No";
                solb = sharedPref.getBoolean("pref_key_sol", false);
                sol = (solb) ? "Yes" : "No";
                mobb = sharedPref.getBoolean("pref_key_mob", false);
                mob = (mobb) ? "Yes" : "No";
                upsb = sharedPref.getBoolean("pref_key_ups", false);
                ups = (upsb) ? "Yes" : "No";
                classcondb = sharedPref.getBoolean("pref_key_classcond", false);
                classcond = (classcondb) ? "Yes" : "No";
                crowdb = sharedPref.getBoolean("pref_key_crowd", false);
                crowd = (crowdb) ? "Yes" : "No";
                notesb = sharedPref.getBoolean("pref_key_notes", false);
                notes = (notesb) ? "Yes" : "No";
                propb = sharedPref.getBoolean("pref_key_prop", false);
                prop = (propb) ? "Yes" : "No";
                attenb = sharedPref.getBoolean("pref_key_atten", false);
                atten = (attenb) ? "Yes" : "No";
                clrb = sharedPref.getBoolean("pref_key_clr", false);
                clr = (clrb) ? "Yes" : "No";
                dbtb = sharedPref.getBoolean("pref_key_dbt", false);
                dbt = (dbtb) ? "Yes" : "No";
                teacherb = sharedPref.getBoolean("pref_key_teacher", false);
                teacher = (teacherb) ? "Yes" : "No";
                vscb = sharedPref.getBoolean("pref_key_vsc", false);
                vsc = (vscb) ? "Yes" : "No";
                vsc1b = sharedPref.getBoolean("pref_key_vsc_1", false);
                vsc1 = (vsc1b) ? "Yes" : "No";

                strt = sharedPref.getString("pref_key_strt", "0");
                prnt = sharedPref.getString("pref_key_prnt", "0");
                rsn = sharedPref.getString("pref_rsn", " ");
                scomment = sharedPref.getString("pref_comment", " ");

                if ((fo_name_school.equals(" ")) || fo_name_school.length() == 0) {
                    Toast.makeText(this, "ENTER A VALID FIELD OFFICER'S NAME", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(prnt) > Integer.parseInt(strt)) {
                    Toast.makeText(this, "ENTER VALID VALUES FOR STRENTH AND PRESENCE OF STUDENTS", Toast.LENGTH_SHORT).show();
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
                                progress.show();

                                db.insert_school(tname, vname, name, fo_name_school, bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment);
                                // bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment
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


                                            uploadSchool();
                                        }


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

                }





                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
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


    void uploadSchool() {

        try {
            List<String> name = db.values_school();
            // Toast.makeText(this, name.get(0)+name.get(1)+name.get(28), Toast.LENGTH_SHORT).show();

            Iterator<String> itr=name.iterator();
               while(itr.hasNext()) {

            int id = Integer.parseInt(itr.next());
            CALLWSDOTNET objWS = new CALLWSDOTNET("http://203.129.241.19/is/Service.asmx");
            objWS.AddPropertyInfo("PASSWORD", "ii@m_s_urv@y@eg@", CALLWSDOTNET.datatype.STRING);
            objWS.AddPropertyInfo("IMEI", imei, CALLWSDOTNET.datatype.STRING);
            objWS.AddPropertyInfo("ID", id, CALLWSDOTNET.datatype.INTEGER);
            objWS.AddPropertyInfo("Taluk_Name", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Village_Name", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("School_Name", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Field_Officer_Name", itr.next(), CALLWSDOTNET.datatype.STRING);
             objWS.AddPropertyInfo("IS_barcode_labelled", itr.next(), CALLWSDOTNET.datatype.STRING);
                 objWS.AddPropertyInfo("Laptop", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Projector", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Modem", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Hughes_Modem",itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Mobile", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Antennae", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Solar", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("UPS_Battery", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Class_Condition", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Class_Over_Crowded", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Class_Strength", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Class_Presence", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Student_Notes", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Class_Running_properly", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Students_attentive", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Audio_Clarity", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Student_clarify_doubts_Through_Mobile", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Teacher_Providing_Assistance", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("VSC_Present", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("VSC_Updated", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Reason_for_class_running_late", itr.next(), CALLWSDOTNET.datatype.STRING);
                objWS.AddPropertyInfo("Comments", itr.next(), CALLWSDOTNET.datatype.STRING);


                if(itr.next().equals("0")) {
                    objWS.invokeWebService("UpdateSchoolSurvey");
                    db.markUpload_s(id);
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
            addPreferencesFromResource(R.xml.preferences_ques);




        }
    }
}
