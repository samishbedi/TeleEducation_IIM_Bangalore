package com.samish.teleeducation;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
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

                    db.insert_school(tname, vname, name, fo_name_school, bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment);
                    // bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment
                    Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
                    sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor editor3 = sharedPref.edit();
                    editor3.clear();
                    editor3.commit();

                    Intent main = new Intent(getApplicationContext(), MainActivity.class);

                    startActivity(main);
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
                    db.insert_school(tname, vname, name, fo_name_school, bc, laptop, proj, modem, hugh, mob, ant, sol, ups, classcond, crowd, strt, prnt, notes, prop, atten, clr, dbt, teacher, vsc, vsc1, rsn, scomment);
                    Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
                    sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor editor2 = sharedPref.edit();
                    editor2.clear();
                    editor2.commit();
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("Exit", true);
                    startActivity(intent);
                    finish();
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
                Intent ref = new Intent(getApplicationContext(), Ques.class);
                ref.putExtra("Sname", name);
                startActivity(ref);

                return true;

            case R.id.upload:

                uploadSchool();
                sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor5 = sharedPref.edit();
                editor5.clear();
                editor5.commit();


                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    void uploadSchool()
    {

      //  try
        //{
            List<String> name=db.values_school();
            Toast.makeText(this, name.get(0)+name.get(1)+name.get(28), Toast.LENGTH_SHORT).show();

           /*  Iterator<String> itr=name.iterator();
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
            }*/


      //  }
        //catch(Exception ex)
       // {
          //  String strEx=ex.getMessage();
         //   strEx="";

        //}
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
