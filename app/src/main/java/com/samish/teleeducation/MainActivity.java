package com.samish.teleeducation;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class MainActivity extends ActionBarActivity{  //Activity for Taluk

    EditText inputSearch;                             //For Search
//    ArrayList<HashMap<String, String>> productList;
    ArrayAdapter<String> adapter;
    DatabaseHandler db;
    String imei;
    ProgressDialog progress;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHandler(this);

        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        imei=telephonyManager.getDeviceId();


        if( getIntent().getBooleanExtra("Exit", false)){
            finish();
            return; // add this to prevent from doing unnecessary stuffs
        }

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //setContentView(R.layout.activity_main);
        Resources res=getResources();                           //XML resoureces
        String[] talukArr=res.getStringArray(R.array.taluk);   //Array of Taluks
        Arrays.sort(talukArr);
        ListView listview = (ListView) findViewById(R.id.listtaluk);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,talukArr));
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String a = (String) parent.getItemAtPosition(position);
                showSurvey(a);

            }
        });



        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                MainActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {

            //noinspection SimplifiableIfStatement
           case R.id.action_settings:
                Intent intent1 = new Intent(this, MainActivity.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent1.putExtra("Exit", true);
                startActivity(intent1);
                finish();
                return true;

            case R.id.upload:

                progress=new ProgressDialog(this);
                progress.setMessage("Uploading Data");
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.setIndeterminate(true);
                progress.setProgress(0);
                progress.show();

                final int totalProgressTime = 100;

                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub

                        runOnUiThread(new Runnable() {
                            public void run() {





                            }
                        });
                        int jumpTime = 0;


                        while (jumpTime < totalProgressTime) {
                            jumpTime += 3;
                            progress.setProgress(jumpTime);

                        }
                        uploadTaluk();
                        progress.dismiss();
                        //db.uploadOldData();





                    }
                }).start();

            default:
                return super.onOptionsItemSelected(item);

        }


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


    public void showSurvey(final String a){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        // Setting Dialog Title
        alertDialog.setTitle(R.string.title_dia_survey);

        alertDialog.setItems(R.array.survey_choice, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0) {
                    Intent TalukSurveyActivity = new Intent(getApplicationContext(), Ques_Taluk.class);
                    TalukSurveyActivity.putExtra("Name", a);
                    startActivity(TalukSurveyActivity);
                } else if (which == 1) {

                    Intent VillageListActivity = new Intent(getApplicationContext(), Village.class);
                    VillageListActivity.putExtra("Name", a);
                    startActivity(VillageListActivity);

                }

            }
        });

        // Showing Alert Message
        alertDialog.create().show();
    }


}
