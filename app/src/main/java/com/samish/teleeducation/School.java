package com.samish.teleeducation;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class School extends ActionBarActivity {

    ArrayAdapter<String> adapter;
    String vname;
    String tname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        Intent intent = getIntent();
        vname = intent.getStringExtra("Vname");
        tname = intent.getStringExtra("Tname");
        ab.setTitle(vname);
        Resources res=getResources();


        switch (vname) {
            case "Bijjavara":
                ListView listview = (ListView) findViewById(R.id.school);
                String[] school=res.getStringArray(R.array.bij_school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);
                        Intent SchoolListActivity = new Intent(getApplicationContext(), Ques.class);
                        SchoolListActivity.putExtra("Sname", b);
                        SchoolListActivity.putExtra("Vname", vname);
                        SchoolListActivity.putExtra("Tname", tname);
                        startActivity(SchoolListActivity);


                    }
                });
            break;

            case "Sathanuru":
                ListView listview1 = (ListView) findViewById(R.id.school);
                String[] school1=res.getStringArray(R.array.sathanuru_school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school1));
                listview1.setAdapter(adapter);
                listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);

                        Intent SchoolListActivity = new Intent(getApplicationContext(), Ques.class);
                        SchoolListActivity.putExtra("Sname", b);
                        SchoolListActivity.putExtra("Vname", vname);
                        SchoolListActivity.putExtra("Tname", tname);
                        startActivity(SchoolListActivity);


                    }
                });
                break;


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_school, menu);
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
            Intent intent1 = new Intent(this, MainActivity.class);
            intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent1.putExtra("Exit", true);
            startActivity(intent1);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
