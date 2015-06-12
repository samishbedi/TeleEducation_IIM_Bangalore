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

import java.util.Arrays;


public class MainActivity extends ActionBarActivity{  //Activity for Taluk

    EditText inputSearch;                             //For Search
//    ArrayList<HashMap<String, String>> productList;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

                // Then you start a new Activity via Intent
                String a = (String) parent.getItemAtPosition(position);

                Intent VillageListActivity = new Intent(getApplicationContext(), Village.class);
                switch (a) {
                    case "Devanahalli":

                        VillageListActivity.putExtra("Name", a);
                        startActivity(VillageListActivity);
                        break;


                    case "Kanakpura":
                        VillageListActivity.putExtra("Name", a);
                        startActivity(VillageListActivity);
                        break;

                }
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
