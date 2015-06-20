package com.samish.teleeducation;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

        if( getIntent().getBooleanExtra("Exit", false)){
            finish();
            return; // add this to prevent from doing unnecessary stuffs
        }

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
                final String a = (String) parent.getItemAtPosition(position);
                showSurvey(a);

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
            Intent intent1 = new Intent(this, MainActivity.class);
            intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent1.putExtra("Exit", true);
            startActivity(intent1);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void showSurvey(final String a){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        // Setting Dialog Title
        alertDialog.setTitle(R.string.title_dia_survey);

        alertDialog.setItems(R.array.survey_choice, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0) {
                    Intent TalukSurveyActivity = new Intent(getApplicationContext(), Ques_Taluk.class);
                    TalukSurveyActivity.putExtra("Name", a);
                    startActivity(TalukSurveyActivity);
                } else if (which == 1) {

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
                        case "Challakere":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Chitradurga":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Channagiri":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Honnali":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Chikkaballapur":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Srinivasapur":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Soraba":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Thirthahalli":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Tumkur":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Bilagi":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Hunagund":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Bailhongal":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Soundatti":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Basavana Bagewadi":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Sindagi":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Byadagi":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Haveri":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Haliyal":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Honnavar":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Kudligi":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;
                        case "Sandur":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;
                        case "Aurad":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;
                        case "Basavakalyan":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;
                        case "Chittapur":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;
                        case "Shorapur":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;



                        case "Koppal":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Yelburga":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Devadurga":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Lingasagur":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Chamaraja Nagar":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "Yelandur":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "H.D.Kote":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                        case "T.N. Pura":
                            VillageListActivity.putExtra("Name", a);
                            startActivity(VillageListActivity);
                            break;

                    }
                }

            }
        });

        // Showing Alert Message
        alertDialog.create().show();
    }


}
