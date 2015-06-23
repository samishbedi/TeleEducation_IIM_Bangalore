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


public class Village extends ActionBarActivity {

    ArrayAdapter<String> adapter;
    EditText inputSearch;

    ListView listview;
    String[] school;
    String a;
    Intent SchoolListActivity;
    android.support.v7.app.ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_village);

        //supportActionBar s vaid for all apis
        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        Resources res=getResources();
        a=name;
        ab.setTitle(name);  //set title of action bar to taluk
        inputSearch = (EditText) findViewById(R.id.inputSearch);



        switch (name) {
            case "Devanahalli":
                school=res.getStringArray(R.array.devan_vill);
                break;

            case "Kanakpura":
                school=res.getStringArray(R.array.kanak_vill);
                break;

            case "Challakere":
                school=res.getStringArray(R.array.challakere_vill);
                break;

            case "Chitradurga":
                school=res.getStringArray(R.array.chitradurga_vill);
                break;

            case "Channagiri":
                school=res.getStringArray(R.array.channagiri_vill);
                break;

            case "Honnali":
                school=res.getStringArray(R.array.honalli_vill);
                break;

            case "Chikkaballapur":
                school=res.getStringArray(R.array.chikkaballapur_vill);
                break;

            case "Srinivasapur":
                school=res.getStringArray(R.array.srinivaspur_vill);
                break;

            case "Soraba":
                school=res.getStringArray(R.array.soraba_vill);
                break;

            case "Thirthahalli":
                school=res.getStringArray(R.array.thirthahalli_vill);
                break;

            case "Pavgada":
                school=res.getStringArray(R.array.pavgada_vill);
                break;

            case "Tumkur":
                school=res.getStringArray(R.array.tumkur_vill);
                break;

            case "Bilagi":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.billagi_vill);
                break;

            case "Hunagund":
                school=res.getStringArray(R.array.hunagund_vill);
                break;

            case "Bailhongal":
                school=res.getStringArray(R.array.bailhongal_vill);
                break;

            case "Soundatti":
                school=res.getStringArray(R.array.soundatti_vill);
                break;

            case "Basavana Bagewadi":
                school=res.getStringArray(R.array.basavana_bagewadi_vill);
                break;

            case "Sindagi":
                school=res.getStringArray(R.array.sindagi_vill);
                break;

            case "Byadagi":
                school=res.getStringArray(R.array.byadagi_vill);
                break;

            case "Haveri":
                school=res.getStringArray(R.array.haveri_vill);
                break;

            case "Haliyal":
                school=res.getStringArray(R.array.haliyal_vill);
                break;

            case "Honnavar":
            school=res.getStringArray(R.array.honnavar_vill);
            break;

            case "Kudligi":
            school=res.getStringArray(R.array.kudligi_vill);
            break;

            case "Sandur":
            school=res.getStringArray(R.array.sandur_vill);
            break;

            case "Aurad":
            school=res.getStringArray(R.array.aurad_vill);
            break;

            case "Basavakalyan":
            school=res.getStringArray(R.array.basavakalyan_vill);
            break;

            case "Chittapur":
            school=res.getStringArray(R.array.chittapur_vill);
            break;

            case "Shorapur":
                school=res.getStringArray(R.array.shorapur_vill);
                break;

            case "Koppal":
                school=res.getStringArray(R.array.koppal_vill);
                break;

            case "Yelburga":
                school=res.getStringArray(R.array.yelburga_vill);
                break;

            case "Devadurga":
                school=res.getStringArray(R.array.devadurga_vill);
                break;

            case "Lingasagur":
                school=res.getStringArray(R.array.lingasagur_vill);
                break;

            case "Chamaraja Nagar":
                school=res.getStringArray(R.array.chamaraja_nagar_vill);
                break;

            case "Yelandur":
                school=res.getStringArray(R.array.yelandur_vill);
                break;

            case "H.D.Kote":
                school=res.getStringArray(R.array.h_d_kote_vill);
                break;

            case "T.N. Pura":
                school=res.getStringArray(R.array.t_n_pura_vill);
                break;

        }

        listview = (ListView) findViewById(R.id.village);
        Arrays.sort(school);
        adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Then you start a new Activity via Intent
                String b = (String) parent.getItemAtPosition(position);
                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                SchoolListActivity.putExtra("Vname", b);
                SchoolListActivity.putExtra("Tname", a);
                startActivity(SchoolListActivity);


            }
        });

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
        if (id == R.id.action_settings) {               //Exit
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
