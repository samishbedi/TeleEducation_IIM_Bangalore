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
    ListView listview;
    String[] school;

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
                school=res.getStringArray(R.array.bij_school);
                break;

            case "Sathanuru":
                school=res.getStringArray(R.array.sathanuru_school);
                break;

            case "Vishwanathapura":
                school=res.getStringArray(R.array.vishwanathapura_school);
                break;

            case "Channarayapatna":
                school=res.getStringArray(R.array.channarayapatna_school);
                break;

            case "Jalige":
                school=res.getStringArray(R.array.jalige_school);
                break;

            case "Channahalli":
                school=res.getStringArray(R.array.channahalli_school);
                break;

            case "Kundana":
                school=res.getStringArray(R.array.kundana_school);
                break;

            case "Bidaluru":
                school=res.getStringArray(R.array.bidaluru_school);
                break;

            case "Avathi":
                school=res.getStringArray(R.array.avathi_school);
                break;

            case "Boodigere":
                school=res.getStringArray(R.array.boodigere_school);
                break;

            case "Karahalli":
                school=res.getStringArray(R.array.karahalli_school);
                break;

            case "Sadahalli":
                school=res.getStringArray(R.array.sadahalli_school);
                break;

            case "Kaggalahalli":
                school=res.getStringArray(R.array.kaggalahalli_school);

                break;

            case "Harohalli":
                school=res.getStringArray(R.array.harohalli_school);
                break;

            case "Dyavasandra":
                school=res.getStringArray(R.array.dyavasandra_school);
                break;

            case "Tungani":
                school=res.getStringArray(R.array.tungani_school);
                break;

            case "Shivanahalli":
                school=res.getStringArray(R.array.shivanahalli_school);
                break;

            case "Atthihalli":
                school=res.getStringArray(R.array.atthihalli_school);
                break;

            case "Honniganahalli":
                school=res.getStringArray(R.array.honniganahalli_school);
                break;

            case "Hukunda":
                school=res.getStringArray(R.array.hukunda_school);
                break;

            case "Uyyamballi":
                school=res.getStringArray(R.array.uyyamballi_school);
                break;

            case "Herindyapanahalli":
                school=res.getStringArray(R.array.herindyapanahalli_school);
                break;

            case "Kottanoor":
                school=res.getStringArray(R.array.kottanoor_school);
                break;

            case "Dodda Alahalli":
                school=res.getStringArray(R.array.dodda_alahalli_school);
                break;

            case "Doddamaralavadi":
                school=res.getStringArray(R.array.doddamaralavadi_school);
                break;

            case "Kallanakuppe":
                school=res.getStringArray(R.array.kallanakuppe_school);
                break;

            case "Achalu":
                school=res.getStringArray(R.array.achalu_school);
                break;
            case "Kabbalu":
                school=res.getStringArray(R.array.kabbalu_school);
                break;

            case "Kodihalli":
                school=res.getStringArray(R.array.kodihalli_school);
                break;
            case "Thigalarahosahalli":
                school=res.getStringArray(R.array.thigalarahosahalli_school);
                break;

            case "Goravinapura":
                school=res.getStringArray(R.array.goravinapura_school);
                break;

            case "Harobele":
                school=res.getStringArray(R.array.harobele_school);
                break;

        /*    case "Nidigere":
                school=res.getStringArray(R.array.Nidigere_school);
                break;

            case "Belalagere":
                school=res.getStringArray(R.array.Belalagere_school);
                break;

            case "Chiradoni":
                school=res.getStringArray(R.array.Chiradoni_school);
                break;
            case "G K Halli":
                school=res.getStringArray(R.array.GKHalli_school);
                break;
            case "Joladahal":
                school=res.getStringArray(R.array.Joladahal_school);
                break;
            case "Kagaturu":
                school=res.getStringArray(R.array.Kagaturu_school);
                break;
            case "Kanchagaranahalli":
                school=res.getStringArray(R.array.Kanchagaranahalli_school);
                break;
            case "Kanchiganahal":
                school=res.getStringArray(R.array.Kanchiganahal_school);
                break;
            case "Kanivebilachi":
                school=res.getStringArray(R.array.Kanivebilachi_school);
                break;
            case "Chikkanguru":
                school=res.getStringArray(R.array.Chikkanguru_school);
                break;
            case "Karekatte":
                school=res.getStringArray(R.array.Karekatte_school);
                break;
            case "Kariganuru":
                school=res.getStringArray(R.array.Kariganuru_school);
                break;

            case "Thavarekere":
                school=res.getStringArray(R.array.Thavarekere_school);
                break;
            case "Thyavanige":
                school=res.getStringArray(R.array.Thyavanige_school);
                break;
            case "Yalodahalli":
                school=res.getStringArray(R.array.Yalodahalli_school);
                break;

            case "Ajji Halli":
                school=res.getStringArray(R.array.AjjiHalli_school);
                break;

            case "Hirekogaluru":
                school=res.getStringArray(R.array.Hirekogaluru_school);
                break;
            case "Durvigere":
                school=res.getStringArray(R.array.Durvigere_school);
                break;

            case "Daginakatte":
                school=res.getStringArray(R.array.Daginakatte_school);
                break;
            case "Doddabbagere":
                school=res.getStringArray(R.array.Doddabbagere_school);
                break;
            case "Goppenahalli":
                school=res.getStringArray(R.array.Goppenahalli_school);
                break;
            case "Gullehalli":
                school=res.getStringArray(R.array.Gullehalli_school);
                break;
            case "Hodigere":
                school=res.getStringArray(R.array.Hodigere_school);
                break;

            case "Kakanur":
                school=res.getStringArray(R.array.Kakanur_school);
                break;

            case "Kerebilachi":
                school=res.getStringArray(R.array.Kerebilachi_school);
                break;

            case "Kondadahalli":
                school=res.getStringArray(R.array.Kondadahalli_school);
                break;

            case "Mavina Hole":
                school=res.getStringArray(R.array.Mavina Hole_school);
                break;
            case "Nalkudure":
                school=res.getStringArray(R.array.Nalkudure_school);
                break;
            case "Nalluru":
                school=res.getStringArray(R.array.Nalluru_school);
                break;

            case "Navile Hal":
                school=res.getStringArray(R.array.NavileHal_school);
                break;

            case "Santhebennuru":
                school=res.getStringArray(R.array.Santhebennuru_school);
                break;

            case "Thanigere":
                school=res.getStringArray(R.array.Thanigere_school);
                break;

            case "Basavapattana":
                school=res.getStringArray(R.array.Basavapattana_school);
                break;

            case "Channeshpura":
                school=res.getStringArray(R.array.Channeshpura_school);
                break;


            case "Devarahalli":
                school=res.getStringArray(R.array.Devarahalli_school);
                break;

            case "Doddaghatta":
                school=res.getStringArray(R.array.Doddaghatta_school);
                break;

            case "Hebbalagere":
                school=res.getStringArray(R.array.Hebbalagere_school);
                break;

            case "Medugondanahalli":
                school=res.getStringArray(R.array.Medugondanahalli_school);
                break; */


        }

        listview = (ListView) findViewById(R.id.school);
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
