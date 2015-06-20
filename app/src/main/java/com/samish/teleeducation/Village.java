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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_village);

        android.support.v7.app.ActionBar ab = getSupportActionBar(); //supportActionBar s vaid for all apis
        ab.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        Resources res=getResources();
        a=name;
        ab.setTitle(name);  //set title of action bar to taluk
        inputSearch = (EditText) findViewById(R.id.inputSearch);



        switch (name) {
            case "Devanahalli":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.devan_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Bijjavara":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Vishwanathpura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Channarayapatna":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Jalige":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Channahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kundana":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Bidaluru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Avathi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Boodigere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Karahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Sadahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;


                        }
                    }
                });
                break;

            case "Kanakpura":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.kanak_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Kaggalahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Harohalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Dyagavasandra":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Tungani":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Shivanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Atthihalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Honniganahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Hukunda":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Uyyamballi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Herindyapanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kottanoor":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Dodda Alahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case " Harohalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case " Sathanuru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case " Doddamaralavadi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case " Kallanakuppe":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case " Achalu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case " Goravinapura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case " Thigalarahosahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case " Kabbalu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case " Kodihalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                        }
                    }
                });
                break;

                case "Challakere":
                    listview = (ListView) findViewById(R.id.village);
                    school=res.getStringArray(R.array.challakere_vill);
                    Arrays.sort(school);
                    adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                    listview.setAdapter(adapter);
                    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            // Then you start a new Activity via Intent
                            String b = (String) parent.getItemAtPosition(position);


                            switch (b) {
                                case "N.Devarahally":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Gowrasamudra":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Thalak":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Obalapura":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;
                                case "Torekolammanahalli":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;
                                case "Mahaddevapura":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Ramjogihally":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "B.N Pura":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "T.N.Kote":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Mallurahatty":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Nayakanahatty":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;


                                case "Narayanapura":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Renukapura":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Meerasabhihally":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Balaenahally":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Parasharampura":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;

                                case "Gopanahalli":
                                    SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                    SchoolListActivity.putExtra("Vname", b);
                                    SchoolListActivity.putExtra("Tname", a);
                                    startActivity(SchoolListActivity);
                                    break;



                            }
                        }
                    });
                    break;

            case "Chitradurga":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.chitradurga_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Muddapur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "D.S.Hally":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kurabarahally":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Thuruvanuru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Chitradurga":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Annehal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "J.N.Kote":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Chavalihalli Gollarahatti":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Godabanal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Sondekola":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Janukonda":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;


                            case "Madanayakanahally":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Siriger":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Hireguntanur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Managangi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Siddapura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Madakaripura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bhimasamudra":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Dyamavvanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Baramasagara":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bahuduragatta":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Guddadarangvanahally":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Guthinadu G.Hatti":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Maragatta":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Lakshmisagar":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Vijapura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Yellagodu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Konabevu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kolahala":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Sulthanipura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Belagatta":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Alagavadi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kalagere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kogunde":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kurubarahally":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Guddadarangavanahally":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;



                        }
                    }
                });
                break;

            case "Channagiri":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.channagiri_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Nidigere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Belalagere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Chiradoni":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "G K Halli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Joladahal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kagaturu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kanchagaranahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kanchiganahal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kanivebilachi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Chikkanguru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Karekatte":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kariganuru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nalkudure":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Santhebennuru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Thavarekere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Thyavanige":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Yalodahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Ajji Halli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Channeshpura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hirekogaluru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Durvigere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nalluru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Basavapattana":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Daginakatte":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Doddabbagere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Goppenahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Gullehalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hodigere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kakanur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kerebilachi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kondadahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Mavina Hole":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;


                            case "Navile Hal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;



                            case "Thanigere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;



                            case "Devarahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Doddaghatta":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Hebbalagere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Medugondanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;



                        }
                    }
                });
                break;
            case "Honalli":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.devan_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Lingapura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Arabagatte":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kenchikoppa":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kathige":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hiregonigere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kundur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Sasavehalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Govinkovi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Marigondanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Tavaragopagondanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Sowlanga":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Belaguthi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Tharaganahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Rampura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nyamathi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Benakanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Chilur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kumblur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kulagatte":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kyasainakere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;




                        }
                    }
                });
                break;

            case "Chikkaballapur":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.devan_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Avalagurki":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Dibbur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hosahudya":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Mandikal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Muddenahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nandi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Peresandra":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Reddy Gollavarahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Angarkanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hale Peresandra":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Manchanabele":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;




                        }
                    }
                });
                break;

            case "Srinivasapur":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.devan_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {

                            case "Addagal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Alavatta":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Arikunte":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Byraganapalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Dalasanur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Gownipalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;


                            case "Lakshmipura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Mastenahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Mudimadudu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Muthakapalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nambihalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Rayalpadu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Ronur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Somayajilapalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Thadigol":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kurigepalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Puligurkote":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Yeldur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;


                        }
                    }
                });
                break;

            case "Soraba":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.devan_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Anavatti":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Chikkashakuna":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Harishi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kadasuru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kotipura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kamaruru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Ulavi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Jade":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Shakunavalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Thavanandi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kuppagadde":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Chandraguthi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Mavali":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nisarani":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bharangi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hosabale":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Udri Vaddigere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Tattur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                        }
                    }
                });
                break;

            case "Thirthahalli":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.devan_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {


                            case "Humchadakatte":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Konandur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Guddekoppa":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kannangi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kudumallige":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Thuduru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kodlu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Melige":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Megaravalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bavikaisaru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Guddekeri":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kattehakklu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kondlur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Mandagadde":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nonaburu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Araga":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Basavani":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Mattigaru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Ramakrishnapura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kammaradi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Agumbe":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Melinakuruvalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                        }
                    }
                });
                break;
            case "Pavgada":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.pavgada_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Venkatapura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Gangasagara":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Arasikere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kotagudda":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nagalamadike":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Y.N.Hoskote":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Thirumani":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Dommathamari":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Ponnasamudra":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bellibattlu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "J.Hosahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kilarlahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Mangalawada":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Sasalakunte":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Veerlagondi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Vallur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;



                        }
                    }
                });
                break;
            case "Tumkur":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.tumkur_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Hebburu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bellavi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Heggere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Thippadasarahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kestooru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bugudanahalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Yellapura (Belagumba)":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hirehalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kesaramadu":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Beladhara":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Obalapura":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Chikkaseebi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kora":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Oorukere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Gulur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Mallasandra":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nagavalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Guleharavi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Siddaganga Mata":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Byatha":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Haralooru":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Areyur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Arakere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "C.T.Kere":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                        }
                    }
                });
                break;

            case "Bilagi":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.billagi_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Rolli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Siddapur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Budihal (Sa)":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hanchinal (Inam)":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Herakal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Teggi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kolur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Girisagar":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Bilagi Cross":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Chikalgundi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Katarki":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Galagali":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kundargi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Heggur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                        }
                    }
                });
                break;

            case "Hunagund":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.hunagund_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Chittargi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Dhannur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Ganjihal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bevinamatti":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hire Kodagali":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hire Magi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hire Singanagutti":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Karadi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Marol":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nagur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nandawadgi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Sangam":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Sulebhavi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kandagal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Ingalgi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Aiholli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Aminagad":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kamatgi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                        }
                    }
                });
                break;

            case "Bailhongal":
                listview = (ListView) findViewById(R.id.village);
                school=res.getStringArray(R.array.bailhongal_vill);
                Arrays.sort(school);
                adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school));
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        // Then you start a new Activity via Intent
                        String b = (String) parent.getItemAtPosition(position);


                        switch (b) {
                            case "Amatur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bailwad":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Belavadi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Devalapur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hunasikatti":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Kadaravalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Lakkundi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Nesargi":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Turamari":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Anigol":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bhavihal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Ghs Mallapur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Sanikopp":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Vannur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Naganur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Holihosur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Dodwad":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Neginhal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Bailhongal":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Hoolikatti":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Turakarshigehalli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Khodanapur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;

                            case "Kittur":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Sangolli":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
                                startActivity(SchoolListActivity);
                                break;
                            case "Marikatti":
                                SchoolListActivity = new Intent(getApplicationContext(), School.class);
                                SchoolListActivity.putExtra("Vname", b);
                                SchoolListActivity.putExtra("Tname", a);
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
