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
                bcb=sharedPref.getBoolean("pref_key_bc", false);
                bc = (bcb) ? "Yes" : "No";
                laptopb=sharedPref.getBoolean("pref_key_laptop", false);
                laptop = (laptopb) ? "Yes" : "No";
                projb=sharedPref.getBoolean("pref_key_proj", false);
                proj= (projb) ? "Yes" : "No";
                modemb=sharedPref.getBoolean("pref_key_mod", false);
                modem = (modemb) ? "Yes" : "No";
                hughb=sharedPref.getBoolean("pref_key_hugh", false);
                hugh = (hughb) ? "Yes" : "No";
                antb=sharedPref.getBoolean("pref_key_ant", false);
                ant = (antb) ? "Yes" : "No";
                solb=sharedPref.getBoolean("pref_key_sol", false);
                sol = (solb) ? "Yes" : "No";
                mobb=sharedPref.getBoolean("pref_key_mob", false);
                mob = (mobb) ? "Yes" : "No";
                upsb=sharedPref.getBoolean("pref_key_ups", false);
                ups = (upsb) ? "Yes" : "No";
                classcondb=sharedPref.getBoolean("pref_key_classcond", false);
                classcond= (classcondb) ? "Yes" : "No";
                crowdb=sharedPref.getBoolean("pref_key_crowd", false);
                crowd= (crowdb) ? "Yes" : "No";
                notesb=sharedPref.getBoolean("pref_key_notes", false);
                notes= (notesb) ? "Yes" : "No";
                propb=sharedPref.getBoolean("pref_key_prop", false);
                prop= (propb) ? "Yes" : "No";
                attenb=sharedPref.getBoolean("pref_key_atten", false);
                atten= (attenb) ? "Yes" : "No";
                clrb=sharedPref.getBoolean("pref_key_clr", false);
                clr= (clrb) ? "Yes" : "No";
                dbtb=sharedPref.getBoolean("pref_key_dbt", false);
                dbt= (dbtb) ? "Yes" : "No";
                teacherb=sharedPref.getBoolean("pref_key_teacher", false);
                teacher= (teacherb) ? "Yes" : "No";
                vscb=sharedPref.getBoolean("pref_key_vsc", false);
                vsc= (vscb) ? "Yes" : "No";
                vsc1b=sharedPref.getBoolean("pref_key_vsc_1", false);
                vsc1= (vsc1b) ? "Yes" : "No";

                strt = sharedPref.getString("pref_key_strt", "0");
                prnt = sharedPref.getString("pref_key_prnt","0");
                rsn = sharedPref.getString("pref_rsn", " ");
                scomment = sharedPref.getString("pref_comment", " ");

                if((fo_name_school.equals(" "))||fo_name_school.length()==0){
                    Toast.makeText(this, "ENTER A VALID FIELD OFFICER'S NAME", Toast.LENGTH_SHORT).show();
                }
                else if(Integer.parseInt(prnt)>Integer.parseInt(strt)){
                    Toast.makeText(this, "ENTER VALID VALUES FOR STRENTH AND PRESENCE OF STUDENTS", Toast.LENGTH_SHORT).show();
                }else {

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
                bcb=sharedPref.getBoolean("pref_key_bc", false);
                bc = (bcb) ? "Yes" : "No";
                laptopb=sharedPref.getBoolean("pref_key_laptop", false);
                laptop = (laptopb) ? "Yes" : "No";
                projb=sharedPref.getBoolean("pref_key_proj", false);
                proj= (projb) ? "Yes" : "No";
                modemb=sharedPref.getBoolean("pref_key_mod", false);
                modem = (modemb) ? "Yes" : "No";
                hughb=sharedPref.getBoolean("pref_key_hugh", false);
                hugh = (hughb) ? "Yes" : "No";
                antb=sharedPref.getBoolean("pref_key_ant", false);
                ant = (antb) ? "Yes" : "No";
                solb=sharedPref.getBoolean("pref_key_sol", false);
                sol = (solb) ? "Yes" : "No";
                mobb=sharedPref.getBoolean("pref_key_mob", false);
                mob = (mobb) ? "Yes" : "No";
                upsb=sharedPref.getBoolean("pref_key_ups", false);
                ups = (upsb) ? "Yes" : "No";
                classcondb=sharedPref.getBoolean("pref_key_classcond", false);
                classcond= (classcondb) ? "Yes" : "No";
                crowdb=sharedPref.getBoolean("pref_key_crowd", false);
                crowd= (crowdb) ? "Yes" : "No";
                notesb=sharedPref.getBoolean("pref_key_notes", false);
                notes= (notesb) ? "Yes" : "No";
                propb=sharedPref.getBoolean("pref_key_prop", false);
                prop= (propb) ? "Yes" : "No";
                attenb=sharedPref.getBoolean("pref_key_atten", false);
                atten= (attenb) ? "Yes" : "No";
                clrb=sharedPref.getBoolean("pref_key_clr", false);
                clr= (clrb) ? "Yes" : "No";
                dbtb=sharedPref.getBoolean("pref_key_dbt", false);
                dbt= (dbtb) ? "Yes" : "No";
                teacherb=sharedPref.getBoolean("pref_key_teacher", false);
                teacher= (teacherb) ? "Yes" : "No";
                vscb=sharedPref.getBoolean("pref_key_vsc", false);
                vsc= (vscb) ? "Yes" : "No";
                vsc1b=sharedPref.getBoolean("pref_key_vsc_1", false);
                vsc1= (vsc1b) ? "Yes" : "No";

                strt = sharedPref.getString("pref_key_strt", "0");
                prnt = sharedPref.getString("pref_key_prnt","0");
                rsn = sharedPref.getString("pref_rsn", " ");
                scomment = sharedPref.getString("pref_comment", " ");

                if((fo_name_school.equals(" "))||fo_name_school.length()==0){
                    Toast.makeText(this, "ENTER A VALID FIELD OFFICER'S NAME", Toast.LENGTH_SHORT).show();
                }
                else if(Integer.parseInt(prnt)>Integer.parseInt(strt)){
                    Toast.makeText(this, "ENTER VALID VALUES FOR STRENGTH AND PRESENCE OF STUDENTS IN CLASS", Toast.LENGTH_SHORT).show();
                }else {
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
                Intent ref = new Intent(getApplicationContext(),Ques.class);
                ref.putExtra("Sname",name);
                startActivity(ref);

                return true;

            default:
                return super.onOptionsItemSelected(item);
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
