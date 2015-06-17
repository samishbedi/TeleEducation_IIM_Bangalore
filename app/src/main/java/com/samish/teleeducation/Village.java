package com.samish.teleeducation;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;


public class Village extends ActionBarActivity {

    ArrayAdapter<String> adapter;
    EditText inputSearch;

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_village);

        android.support.v7.app.ActionBar ab = getSupportActionBar(); //supportActionBar s vaid for all apis
        ab.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        Resources res=getResources();
        ab.setTitle(name);  //set title of action bar to taluk
        inputSearch = (EditText) findViewById(R.id.inputSearch);



        switch (name) {
            case "Devanahalli":
                ListView listview = (ListView) findViewById(R.id.village);
                String[] school=res.getStringArray(R.array.devan_vill);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Bijjavara":
                                Intent SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                startActivity(SchoolListActivity);
                                break;

                        }
                    }
                });
                break;

            case "Kanakpura":
                ListView listview1 = (ListView) findViewById(R.id.village);
                String[] school1=res.getStringArray(R.array.kanak_vill);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school1));
                listview1.setAdapter(adapter);
                listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Sathanuru":
                                Intent SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                startActivity(SchoolListActivity);
                                break;

                        }
                    }
                });
                break;
        }

        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Village.this.adapter.getFilter().filter(cs);
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
        getMenuInflater().inflate(R.menu.menu_village, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
