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


public class Ques_Taluk extends ActionBarActivity {

String foname;
    String tiname;
    int t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        Resources res=getResources();
        ab.setTitle(name);

        FragmentManager mFragmentManager = getFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        SettingsFragment mPrefsFragment1 = new SettingsFragment();
        mFragmentTransaction.replace(android.R.id.content, mPrefsFragment1);
        mFragmentTransaction.commit();







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
        menu.findItem(R.id.action_settings).setTitle("Display Values");
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
            boolean t2=sharedPref.getBoolean("pref_key_t1", false);
            String t2a = (t2) ? "Yes" : "No";






            Toast.makeText(getApplicationContext(), t2a, Toast.LENGTH_LONG).show();
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
