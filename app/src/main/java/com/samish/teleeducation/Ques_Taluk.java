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
import android.widget.Toast;
import android.database.sqlite.*;


public class Ques_Taluk extends ActionBarActivity {
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
    ;

    DatabaseHandler db;


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
        menu.findItem(R.id.action_settings).setTitle("Save the survey");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
            foname = sharedPref.getString("pref_key_fo_name", " ");
            tiname  = sharedPref.getString("pref_key_ti_name", " ");
            boolean t1b=sharedPref.getBoolean("pref_key_t1", false);
            t1 = (t1b) ? "Yes" : "No";
            boolean t2b=sharedPref.getBoolean("pref_key_t2", false);
            t2 = (t2b) ? "Yes" : "No";
            boolean t3b=sharedPref.getBoolean("pref_key_t3", false);
            t3 = (t3b) ? "Yes" : "No";
            boolean t4b=sharedPref.getBoolean("pref_key_t4", false);
            t4 = (t4b) ? "Yes" : "No";
            boolean t5b=sharedPref.getBoolean("pref_key_t5", false);
            t5 = (t5b) ? "Yes" : "No";
            t5_moderator = sharedPref.getString("pref_t5_moderator", " ");
            boolean t6b=sharedPref.getBoolean("pref_key_t6", false);
            t6 = (t6b) ? "Yes" : "No";
            boolean t7b=sharedPref.getBoolean("pref_key_t7", false);
            t7 = (t7b) ? "Yes" : "No";
            boolean t8b=sharedPref.getBoolean("pref_key_t8", false);
            t8 = (t8b) ? "Yes" : "No";
            boolean t9b=sharedPref.getBoolean("pref_key_t9", false);
            t9 = (t9b) ? "Yes" : "No";
            boolean t10b=sharedPref.getBoolean("pref_key_t10", false);
            t10 = (t10b) ? "Yes" : "No";
            t5_comment = sharedPref.getString("pref_tcomment", " ");


           db.insert(t,foname,tiname,t1,t2,t3,t4,t5,t5_moderator,t6,t7,t8,t9,t10,t5_comment);
           // ,t1,t2,t3,t4,t5,t5_moderator,t6,t7,t8,t9,t10,t5_comment

           // Toast.makeText(getApplicationContext(), foname+tiname+t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t5_moderator+t5_comment, Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
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
