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

            case "Balliganudu":
                school=res.getStringArray(R.array.Balliganudu_school);
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

            case "Nidigere":
                school=res.getStringArray(R.array.Nidigere_school);
                break;

            case "Belalagere":
                school=res.getStringArray(R.array.Belalagere_school);
                break;

            case "Chiradoni":
                school=res.getStringArray(R.array.Chiradoni_school);
                break;
            case "G K Halli":
                school=res.getStringArray(R.array.G_K_Halli_school);
                break;
            case "Katthaleger":
                school=res.getStringArray(R.array.Katthaleger_school);
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
                school=res.getStringArray(R.array.Ajji_Halli_school);
                break;

            case "Hirekogaluru":
                school=res.getStringArray(R.array.Hirekogaluru_school);
                break;
            case "Kotihal":
                school=res.getStringArray(R.array.Kotihal_school);
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
                school=res.getStringArray(R.array.Mavina_Hole_school);
                break;
            case "Nalkudure":
                school=res.getStringArray(R.array.Nalkudure_school);
                break;
            case "Nalluru":
                school=res.getStringArray(R.array.Nalluru_school);
                break;

            case "Navile Hal":
                school=res.getStringArray(R.array.Navile_Hal_school);
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
                break;


            case "N.Devarahally":
                school=res.getStringArray(R.array.N_Devarahally_school);
                break;

            case "Gowrasamudra":
                school=res.getStringArray(R.array.Gowrasamudra_school);
                break;
            case "Thalak":
                school=res.getStringArray(R.array.Thalak_school);
                break;

            case "Obalapura":
                school=res.getStringArray(R.array.Obalapura_school);
                break;
            case "Ramjogihally":
                school=res.getStringArray(R.array.Ramjogihally_school);
                break;

            case "B.N Pura":
                school=res.getStringArray(R.array.B_N_Pura_school);
                break;

            case "T.N.Kote":
                school=res.getStringArray(R.array.T_N_Kote_school);
                break;
            case "Mahaddevapura":
                school=res.getStringArray(R.array.Mahaddevapura_school);
                break;

            case "Torekolammanahalli":
                school=res.getStringArray(R.array.Torekolammanahalli_school);
                break;
            case "Mallurahatty":
                school=res.getStringArray(R.array.Mallurahatty_school);
                break;

            case "Nayakanahatty":
                school=res.getStringArray(R.array.Nayakanahatty_school);
                break;
            case "Renukapura":
                school=res.getStringArray(R.array.Renukapura_school);
                break;

            case "Meerasabhihally":
                school=res.getStringArray(R.array.Meerasabhihally_school);
                break;
            case "Balaenahally":
                school=res.getStringArray(R.array.Balaenahally_school);
                break;

            case "Parasharampura":
                school=res.getStringArray(R.array.Parasharampura_school);
                break;
            case "Gopanahalli":
                school=res.getStringArray(R.array.Gopanahalli_school);
                break;

            case "Narayanapura":
                school=res.getStringArray(R.array.Narayanapura_school);
                break;
            case "Gataparthy":
                school=res.getStringArray(R.array.Gataparthy_school);
                break;

            case "Muddapur":
                school=res.getStringArray(R.array.Muddapur_school);
                break;

            case "D.S.Hally":
                school=res.getStringArray(R.array.D_S_Hally_school);
                break;
            case "Kurabarahally":
                school=res.getStringArray(R.array.Kurabarahally_school);
                break;

            case "Thuruvanuru":
                school=res.getStringArray(R.array.Thuruvanuru_school);
                break;

            case "Chitradurga":
                school=res.getStringArray(R.array.Chitradurga_school);
                break;

            case "Annehal":
                school=res.getStringArray(R.array.Annehal_school);
                break;

            case "J.N.Kote":
                school=res.getStringArray(R.array.J_N_Kote_school);
                break;

            case "Chavalihalli Gollarahatti":
                school=res.getStringArray(R.array.Chavalihalli_Gollarahatti_school);
                break;

            case "Godabanal":
                school=res.getStringArray(R.array.Sondekola_school);
                break;

            case "Janukonda":
                school=res.getStringArray(R.array.Janukonda_school);
                break;

            case "Madanayakanahally":
                school=res.getStringArray(R.array.Madanayakanahally_school);
                break;

            case "Sirigere":
                school=res.getStringArray(R.array.Sirigere_school);
                break;

            case "Hireguntanur":
                school=res.getStringArray(R.array.Hireguntanur_school);
                break;

            case "Managangi":
                school=res.getStringArray(R.array.Managangi_school);
                break;

            case "Siddapura":
                school=res.getStringArray(R.array.Siddapura_school);
                break;

            case "Madakaripura":
                school=res.getStringArray(R.array.Madakaripura_school);
                break;

            case "Bhimasamudra":
                school=res.getStringArray(R.array.Bhimasamudra_school);
                break;

            case "Dyamavvanahalli":
                school=res.getStringArray(R.array.Dyamavvanahalli_school);
                break;

            case "Baramasagara":
                school=res.getStringArray(R.array.Baramasagara_school);
                break;

            case "Bahuduragatta":
                school=res.getStringArray(R.array.Bahuduragatta_school);
                break;

            case "Guddadarangvanahally":
                school=res.getStringArray(R.array.Guddadarangvanahally_school);
                break;

            case "Guthinadu G.Hatti":
                school=res.getStringArray(R.array.GUTHINADU_G_HATTI);
                break;

            case "Maragatta":
                school=res.getStringArray(R.array.Maragatta_school);
                break;

            case "Lakshmisagar":
                school=res.getStringArray(R.array.Lakshmisagar_school);
                break;

            case "Vijapura":
                school=res.getStringArray(R.array.Vijapura_school);
                break;

            case "Yellagodu":
                school=res.getStringArray(R.array.Yellagodu_school);
                break;

            case "Konabevu":
                school=res.getStringArray(R.array.Konabevu_school);
                break;

            case "Kolahala":
                school=res.getStringArray(R.array.Kolahala_school);
                break;

            case "Sulthanipura":
                school=res.getStringArray(R.array.Sulthanipura_school);
                break;

            case "Belagatta":
                school=res.getStringArray(R.array.Belagatta_school);
                break;

            case "Vadnal":
                school=res.getStringArray(R.array.Vadnal_school);
                break;


            case "Alagavadi":
                school=res.getStringArray(R.array.Alagavadi_school);
                break;

            case "Kalagere":
                school=res.getStringArray(R.array.Kalagere_school);
                break;

            case "Kogunde":
                school=res.getStringArray(R.array.Kogunde_school);
                break;

            case "Kurubarahally":
                school=res.getStringArray(R.array.Kurubarahally_school);
                break;

            case "Guddadarangavanahally":
                school=res.getStringArray(R.array.Guddadarangavanahally_school);
                break;

            case "Lingapura":
                school=res.getStringArray(R.array.Lingapura_school);
                break;

            case "Arabagatte":
                school=res.getStringArray(R.array.Arabagatte_school);
                break;

            case "Kenchikoppa":
                school=res.getStringArray(R.array.Kenchikoppa_school);
                break;

            case "Kathige":
                school=res.getStringArray(R.array.Kathige_school);
                break;

            case "Hiregonigere":
                school=res.getStringArray(R.array.Hiregonigere_school);
                break;

            case "Kundur":
                school=res.getStringArray(R.array.Kundur_school);
                break;

            case "Sasavehalli":
                school=res.getStringArray(R.array.Sasavehalli_school);
                break;

            case "Govinkovi":
                school=res.getStringArray(R.array.Govinkovi_school);
                break;

            case "Marigondanahalli":
                school=res.getStringArray(R.array.Marigondanahalli_school);
                break;

            case "Tavaragopagondanahalli":
                school=res.getStringArray(R.array.Tavaragopagondanahalli_school);
                break;

            case "Sowlanga":
                school=res.getStringArray(R.array.Sowlanga_school);
                break;

            case "Belaguthi":
                school=res.getStringArray(R.array.Belaguthi_school);
                break;

            case "Nyamathi":
                school=res.getStringArray(R.array.Nyamathi_school);
                break;

            case "Tharaganahalli":
                school=res.getStringArray(R.array.Tharaganahalli_school);
                break;

            case "Rampura":
                school=res.getStringArray(R.array.Rampura_school);
                break;


            case "Benakanahalli":
                school=res.getStringArray(R.array.Benakanahalli_school);
                break;

            case "Chilur":
                school=res.getStringArray(R.array.Chilur_school);
                break;


            case "Kumblur":
                school=res.getStringArray(R.array.Kumblur_school);
                break;


            case "Avalagurki":
                school=res.getStringArray(R.array.Avalagurki_school);  break;
            case "Dibbur":
                school=res.getStringArray(R.array.Dibbur_school);  break;
            case "Hosahudya":
                school=res.getStringArray(R.array.Hosahudya_school);  break;
            case "Mandikal":
                school=res.getStringArray(R.array.Mandikal_school);  break;
            case "Muddenahalli":
                school=res.getStringArray(R.array.Muddenahalli_school);  break;
            case "Nandi":
                school=res.getStringArray(R.array.Nandi_school);  break;
            case "Peresandra":
                school=res.getStringArray(R.array.Peresandra_school);  break;
            case "Reddy Gollavarahalli":
                school=res.getStringArray(R.array.Reddy_Gollavarahalli_school);  break;

            case "Angarkanahalli":
                school=res.getStringArray(R.array.Angarkanahalli_school);  break;
            case "Hale Peresandra":
                school=res.getStringArray(R.array.Hale_Peresandra_school);  break;
            case "Manchanabele":
                school=res.getStringArray(R.array.Manchanabele_school);  break;
            case "Addagal":
                school=res.getStringArray(R.array.Addagal_school);  break;
            case "Alavatta":
                school=res.getStringArray(R.array.Alavatta_school);  break;
            case "Arikunte":
                school=res.getStringArray(R.array.Arikunte_school);  break;
            case "Byraganapalli":
                school=res.getStringArray(R.array.Byraganapalli_school);  break;
            case "Dalasanur":
                school=res.getStringArray(R.array.Dalasanur_school);  break;
            case "Gownipalli":
                school=res.getStringArray(R.array.Gownipalli_school);  break;
            case "Lakshmipura":
                school=res.getStringArray(R.array.Lakshmipura_school);  break;
            case "Mastenahalli":
                school=res.getStringArray(R.array.Mastenahalli_school);  break;
            case "Mudimadudu":
                school=res.getStringArray(R.array.Mudimadudu_school);  break;
            case "Muthakapalli":
                school=res.getStringArray(R.array.Muthakapalli_school);  break;
            case "Nambihalli":
                school=res.getStringArray(R.array.Nambihalli_school);  break;
            case "Rayalpadu":
                school=res.getStringArray(R.array.Rayalpadu_school);  break;
            case "Ronur":
                school=res.getStringArray(R.array.Ronur_school);  break;
            case "Somayajilapalli":
                school=res.getStringArray(R.array.Somayajilapalli_school);  break;

            case "Somalapura":
                school=res.getStringArray(R.array.Somalapura_school);  break;

            case "Thadigol":
                school=res.getStringArray(R.array.Thadigol_school);  break;
            case "Kurigepalli":
                school=res.getStringArray(R.array.Kurigepalli_school);  break;
            case "Puligurkote":
                school=res.getStringArray(R.array.Puligurkote_school);  break;
            case "Yeldur":
                school=res.getStringArray(R.array.Yeldur_school);  break;
            case "Anavatti":
                school=res.getStringArray(R.array.Anavatti_school);  break;
            case "Chikkashakuna":
                school=res.getStringArray(R.array.Chikkashakuna_school);  break;
            case "Harishi":
                school=res.getStringArray(R.array.Harishi_school);  break;
            case "Kadasuru":
                school=res.getStringArray(R.array.Kadasuru_school);  break;
            case "Kotipura":
                school=res.getStringArray(R.array.Kotipura_school);  break;
            case "Kamaruru":
                school=res.getStringArray(R.array.Kamaruru_school);  break;
            case "Ulavi":
                school=res.getStringArray(R.array.Ulavi_school);  break;
            case "Jade":
                school=res.getStringArray(R.array.Jade_school);  break;
            case "Shakunavalli":
                school=res.getStringArray(R.array.Shakunavalli_school);  break;
            case "Thavanandi":
                school=res.getStringArray(R.array.Thavanandi_school);  break;
            case "Kuppagadde":
                school=res.getStringArray(R.array.Kuppagadde_school);  break;
            case "Chandraguthi":
                school=res.getStringArray(R.array.Chandraguthi_school);  break;
            case "Mavali":
                school=res.getStringArray(R.array.Mavali_school);  break;
            case "Nisarani":
                school=res.getStringArray(R.array.Nisarani_school);  break;
            case "Bharangi":
                school=res.getStringArray(R.array.Bharangi_school);  break;
            case "Hosabale":
                school=res.getStringArray(R.array.Hosabale_school);  break;
            case "Udri_Vaddigere":
                school=res.getStringArray(R.array.Udri_Vaddigere_school);  break;
            case "Tattur":
                school=res.getStringArray(R.array.Tattur_school);  break;
            case "Humchadakatte":
                school=res.getStringArray(R.array.Humchadakatte_school);  break;
            case "Konandur":
                school=res.getStringArray(R.array.Konandur_school);  break;
            case "Guddekoppa":
                school=res.getStringArray(R.array.Guddekoppa_school);  break;
            case "Kannangi":
                school=res.getStringArray(R.array.Kannangi_school);  break;
            case "Kudumallige":
                school=res.getStringArray(R.array.Kudumallige_school);  break;
            case "Thuduru":
                school=res.getStringArray(R.array.Thuduru_school);  break;
            case "Kodlu":
                school=res.getStringArray(R.array.Kodlu_school);  break;
            case "Melige":
                school=res.getStringArray(R.array.Melige_school);  break;
            case "Megaravalli":
                school=res.getStringArray(R.array.Megaravalli_school);  break;
            case "Bavikaisaru":
                school=res.getStringArray(R.array.Bavikaisaru_school);  break;
            case "Guddekeri":
                school=res.getStringArray(R.array.Guddekeri_school);  break;
            case "Kattehakklu":
                school=res.getStringArray(R.array.Kattehakklu_school);  break;
            case "Kondlur":
                school=res.getStringArray(R.array.Kondlur_school);  break;
            case "Mandagadde":
                school=res.getStringArray(R.array.Mandagadde_school);  break;
            case "Nonaburu":
                school=res.getStringArray(R.array.Nonaburu_school);  break;
            case "Araga":
                school=res.getStringArray(R.array.Araga_school);  break;
            case "Basavani":
                school=res.getStringArray(R.array.Basavani_school);  break;
            case "Mattigaru":
                school=res.getStringArray(R.array.Mattigaru_school);  break;
            case "Ramakrishnapura":
                school=res.getStringArray(R.array.Ramakrishnapura_school);  break;
            case "Kammaradi":
                school=res.getStringArray(R.array.Kammaradi_school);  break;
            case "Agumbe":
                school=res.getStringArray(R.array.Agumbe_school);  break;
            case "Melinakuruvalli":
                school=res.getStringArray(R.array.Melinakuruvalli_school);  break;
            case "Venkatapura":
                school=res.getStringArray(R.array.Venkatapura_school);  break;
            case "Gangasagara":
                school=res.getStringArray(R.array.Gangasagara_school);  break;
            case "Arasikere":
                school=res.getStringArray(R.array.Arasikere_school);  break;
            case "Kotagudda":
                school=res.getStringArray(R.array.Kotagudda_school);  break;
            case "Nagalamadike":
                school=res.getStringArray(R.array.Nagalamadike_school);  break;
            case "Y.N.Hoskote":
                school=res.getStringArray(R.array.Y_N_Hoskote_school);  break;
            case "Thirumani":
                school=res.getStringArray(R.array.Thirumani_school);  break;
            case "Dommathamari":
                school=res.getStringArray(R.array.Dommathamari_school);  break;
            case "Ponnasamudra":
                school=res.getStringArray(R.array.Ponnasamudra_school);  break;
            case "Bellibattlu":
                school=res.getStringArray(R.array.Bellibattlu_school);  break;
            case "J.Hosahalli":
                school=res.getStringArray(R.array.J_Hosahalli_school);  break;
            case "Kilarlahalli":
                school=res.getStringArray(R.array.Kilarlahalli_school);  break;
            case "Mangalawada":
                school=res.getStringArray(R.array.Mangalawada_school);  break;
            case "Sasalakunte":
                school=res.getStringArray(R.array.Sasalakunte_school);  break;
            case "Veerlagondi":
                school=res.getStringArray(R.array.Veerlagondi_school);  break;
            case "Vallur":
                school=res.getStringArray(R.array.Vallur_school);  break;
            case "Hebburu":
                school=res.getStringArray(R.array.Hebburu_school);  break;
            case "Bellavi":
                school=res.getStringArray(R.array.Bellavi_school);  break;
            case "Heggere":
                school=res.getStringArray(R.array.Heggere_school);  break;
            case "Thippadasarahalli":
                school=res.getStringArray(R.array.Thippadasarahalli_school);  break;
            case "Kestooru":
                school=res.getStringArray(R.array.Kestooru_school);  break;
            case "Bugudanahalli":
                school=res.getStringArray(R.array.Bugudanahalli_school);  break;
            case "Yellapura (Belagumba)":
                school=res.getStringArray(R.array.Yellapura_Belagumba_school);  break;
            case "Hirehalli":
                school=res.getStringArray(R.array.Hirehalli_school);  break;
            case "Kesaramadu":
                school=res.getStringArray(R.array.Kesaramadu_school);  break;
            case "Beladhara":
                school=res.getStringArray(R.array.Beladhara_school);  break;
            case "Obalapura Tumkur":
                school=res.getStringArray(R.array.Obalapura_tumkur_school);  break;
            case "Chikkaseebi":
                school=res.getStringArray(R.array.Chikkaseebi_school);  break;
            case "Kora":
                school=res.getStringArray(R.array.Kora_school);  break;
            case "Oorukere":
                school=res.getStringArray(R.array.Oorukere_school);  break;
            case "Gulur":
                school=res.getStringArray(R.array.Gulur_school);  break;
            case "Mallasandra":
                school=res.getStringArray(R.array.Mallasandra_school);  break;
            case "Nagavalli":
                school=res.getStringArray(R.array.Nagavalli_school);  break;
            case "Guleharavi":
                school=res.getStringArray(R.array.Guleharavi_school);  break;
            case "Siddaganga Mata":
                school=res.getStringArray(R.array.Siddaganga_Mata_school);  break;
            case "Byatha":
                school=res.getStringArray(R.array.Byatha_school);  break;
            case "Haralooru":
                school=res.getStringArray(R.array.Haralooru_school);  break;
            case "Areyur":
                school=res.getStringArray(R.array.Areyur_school);  break;
            case "Arakere":
                school=res.getStringArray(R.array.Arakere_school);  break;
            case "C.T.Kere":
                school=res.getStringArray(R.array.C_T_Kere_school);  break;
            case "Rolli":
                school=res.getStringArray(R.array.Rolli_school);  break;
            case "Siddapur":
                school=res.getStringArray(R.array.Siddapur_school);  break;
            case "Budihal (Sa)":
                school=res.getStringArray(R.array.Budihal_Sa_school);  break;
            case "Hanchinal (Inam)":
                school=res.getStringArray(R.array.Hanchinal_Inam_school);  break;
            case "Herakal":
                school=res.getStringArray(R.array.Herakal_school);  break;
            case "Teggi":
                school=res.getStringArray(R.array.Teggi_school);  break;
            case "Kolur":
                school=res.getStringArray(R.array.Kolur_school);  break;
            case "Girisagar":
                school=res.getStringArray(R.array.Girisagar_school);  break;
            case "Bilagi Cross":
                school=res.getStringArray(R.array.Bilagi_Cross_school);  break;
            case "Chikalgundi":
                school=res.getStringArray(R.array.Chikalgundi_school);  break;
            case "Katarki":
                school=res.getStringArray(R.array.Katarki_school);  break;
            case "Galagali":
                school=res.getStringArray(R.array.Galagali_school);  break;
            case "Kundargi":
                school=res.getStringArray(R.array.Kundargi_school);  break;
            case "Heggur":
                school=res.getStringArray(R.array.Heggur_school);  break;
            case "Chittargi":
                school=res.getStringArray(R.array.Chittargi_school);  break;
            case "Dhannur":
                school=res.getStringArray(R.array.Dhannur_school);  break;
            case "Ganjihal":
                school=res.getStringArray(R.array.Ganjihal_school);  break;
            case "Bevinamatti":
                school=res.getStringArray(R.array.Bevinamatti_school);  break;
            case "Hire Kodagali":
                school=res.getStringArray(R.array.Hire_Kodagali_school);  break;
            case "Hire Magi":
                school=res.getStringArray(R.array.Hire_Magi_school);  break;
            case "Hire Singanagutti":
                school=res.getStringArray(R.array.Hire_Singanagutti_school);  break;
            case "Karadi":
                school=res.getStringArray(R.array.Karadi_school);  break;
            case "Marol":
                school=res.getStringArray(R.array.Marol_school);  break;
            case "Marol Hunagund":
                school=res.getStringArray(R.array.Marol_hunagund_school);  break;
            case "Nagur":
                school=res.getStringArray(R.array.Nagur_school);  break;
            case "Nandawadgi":
                school=res.getStringArray(R.array.Nandawadgi_school);  break;
            case "Sangam":
                school=res.getStringArray(R.array.Sangam_school);  break;
            case "Sangam Hunagund":
                school=res.getStringArray(R.array.Sangam_hunagund_school);  break;
            case "Udri Vaddigere":
                school=res.getStringArray(R.array.Udri_Vaddigere_school);  break;
            case "Sulebhavi":
                school=res.getStringArray(R.array.Sulebhavi_school);  break;
            case "Kandagal":
                school=res.getStringArray(R.array.Kandagal_school);  break;
            case "Ingalgi":
                school=res.getStringArray(R.array.Ingalgi_school);  break;
            case "Aiholli":
                school=res.getStringArray(R.array.Aiholli_school);  break;
            case "Aminagad":
                school=res.getStringArray(R.array.Aminagad_school);  break;
            case "Kamatgi":
                school=res.getStringArray(R.array.Kamatgi_school);  break;
            case "Amatur":
                school=res.getStringArray(R.array.Amatur_school);  break;
            case "Bailwad":
                school=res.getStringArray(R.array.Bailwad_school);  break;
            case "Belavadi":
                school=res.getStringArray(R.array.Belavadi_school);  break;
            case "Devalapur":
                school=res.getStringArray(R.array.Devalapur_school);  break;
            case "Hunasikatti":
                school=res.getStringArray(R.array.Hunasikatti_school);  break;
            case "Kadaravalli":
                school=res.getStringArray(R.array.Kadaravalli_school);  break;
            case "Lakkundi":
                school=res.getStringArray(R.array.Lakkundi_school);  break;
            case "Nesargi":
                school=res.getStringArray(R.array.Nesargi_school);  break;
            case "Turamari":
                school=res.getStringArray(R.array.Turamari_school);  break;
            case "Anigol":
                school=res.getStringArray(R.array.Anigol_school);  break;
            case "Bhavihal":
                school=res.getStringArray(R.array.Bhavihal_school);  break;
            case "Ghs Mallapur":
                school=res.getStringArray(R.array.Ghs_Mallapur_school);  break;
            case "Sanikopp":
                school=res.getStringArray(R.array.Sanikopp_school);  break;
            case "Vannur":
                school=res.getStringArray(R.array.Vannur_school);  break;
            case "Naganur":
                school=res.getStringArray(R.array.Naganur_school);  break;
            case "Holihosur":
                school=res.getStringArray(R.array.Holihosur_school);  break;
            case "Dodwad":
                school=res.getStringArray(R.array.Dodwad_school);  break;
            case "Neginhal":
                school=res.getStringArray(R.array.Neginhal_school);  break;
            case "Bailhongal":
                school=res.getStringArray(R.array.Bailhongal_school);  break;
            case "Hoolikatti":
                school=res.getStringArray(R.array.Hoolikatti_school);  break;
            case "Turakarshigehalli":
                school=res.getStringArray(R.array.Turakarshigehalli_school);  break;
            case "Khodanapur":
                school=res.getStringArray(R.array.Khodanapur_school);  break;
            case "Kittur":
                school=res.getStringArray(R.array.Kittur_school);  break;
            case "Sangolli":
                school=res.getStringArray(R.array.Sangolli_school);  break;
            case "Marikatti":
                school=res.getStringArray(R.array.Marikatti_school);  break;
            case "Benakatti":
                school=res.getStringArray(R.array.Benakatti_school);  break;
            case "Karikatti":
                school=res.getStringArray(R.array.Karikatti_school);  break;
            case "Munavalli":
                school=res.getStringArray(R.array.Munavalli_school);  break;
            case "Sangreshakoppa":
                school=res.getStringArray(R.array.Sangreshakoppa_school);  break;
            case "Shivapur":
                school=res.getStringArray(R.array.Shivapur_school);  break;
            case "Yakkundi":
                school=res.getStringArray(R.array.Yakkundi_school);  break;
            case "Kadabi":
                school=res.getStringArray(R.array.Kadabi_school);  break;
            case "Asundi":
                school=res.getStringArray(R.array.Asundi_school);  break;
            case "Hooli":
                school=res.getStringArray(R.array.Hooli_school);  break;
            case "Hanchanal":
                school=res.getStringArray(R.array.Hanchanal_school);  break;
            case "Inamhongal":
                school=res.getStringArray(R.array.Inamhongal_school);  break;
            case "Inchal":
                school=res.getStringArray(R.array.Inchal_school);  break;
            case "Murgod":
                school=res.getStringArray(R.array.Murgod_school);  break;
            case "Shirasangi":
                school=res.getStringArray(R.array.Shirasangi_school);  break;
            case "Tallur":
                school=res.getStringArray(R.array.Tallur_school);  break;
            case "Ugargol":
                school=res.getStringArray(R.array.Ugargol_school);  break;
            case "Yargatti":
                school=res.getStringArray(R.array.Yargatti_school);  break;
            case "Chachadi":
                school=res.getStringArray(R.array.Chachadi_school);  break;
            case "Soppadla":
                school=res.getStringArray(R.array.Soppadla_school);  break;
            case "Hosur":
                school=res.getStringArray(R.array.Hosur_school);  break;
            case "Sutagatti":
                school=res.getStringArray(R.array.Sutagatti_school);  break;
            case "Ghps Benakatti":
                school=res.getStringArray(R.array.Ghps_Benakatti_school);  break;
            case "Yragatti":
                school=res.getStringArray(R.array.Yragatti_school);  break;
            case "Benal":
                school=res.getStringArray(R.array.Benal_school);  break;
            case "Chimmalgi":
                school=res.getStringArray(R.array.Chimmalgi_school);  break;
            case "K.Salawadagi":
                school=res.getStringArray(R.array.K_Salawadagi_school);  break;
            case "Almatti":
                school=res.getStringArray(R.array.Almatti_school);  break;
            case "Huvina Hipparagi":
                school=res.getStringArray(R.array.Huvina_Hipparagi_school);  break;
            case "Ingaleshwar":
                school=res.getStringArray(R.array.Ingaleshwar_school);  break;
            case "Nidagundiancled":
                school=res.getStringArray(R.array.Nidagundiancled_school);  break;
            case "Narasalagi":
                school=res.getStringArray(R.array.Narasalagi_school);  break;
            case "Nidagundi":
                school=res.getStringArray(R.array.Nidagundi_school);  break;
            case "Sasanur":
                school=res.getStringArray(R.array.Sasanur_school);  break;
            case "Ukkali":
                school=res.getStringArray(R.array.Ukkali_school);  break;
            case "Wadawadagi":
                school=res.getStringArray(R.array.Wadawadagi_school);  break;
            case "Bisanal":
                school=res.getStringArray(R.array.Bisanal_school);  break;
            case "Donur":
                school=res.getStringArray(R.array.Donur_school);  break;
            case "Mulawad":
                school=res.getStringArray(R.array.Mulawad_school);  break;
            case "Muttagi":
                school=res.getStringArray(R.array.Muttagi_school);  break;
            case "Kolhar":
                school=res.getStringArray(R.array.Kolhar_school);  break;
            case "Telagi":
                school=res.getStringArray(R.array.Telagi_school);  break;
            case "Wandal":
                school=res.getStringArray(R.array.Wandal_school);  break;
            case "Yalawar":
                school=res.getStringArray(R.array.Yalawar_school);  break;
            case "Malaghan":
                school=res.getStringArray(R.array.Malaghan_school);  break;
            case "Chikkarugi":
                school=res.getStringArray(R.array.Chikkarugi_school);  break;
            case "Binjalbhavi":
                school=res.getStringArray(R.array.Binjalbhavi_school);  break;
            case "Jalawad":
                school=res.getStringArray(R.array.Jalawad_school);  break;
            case "Gabasavalgi":
                school=res.getStringArray(R.array.Gabasavalgi_school);  break;
            case "Mulasavalgi":
                school=res.getStringArray(R.array.Mulasavalgi_school);  break;
            case "Gubbewad":
                school=res.getStringArray(R.array.Gubbewad_school);  break;
            case "Devarhippargi.":
                school=res.getStringArray(R.array.Devarhippargi_school);  break;
            case "Rampur (Pa)":
                school=res.getStringArray(R.array.Rampur_Pa_school);  break;
            case "Bisalalli":
                school=res.getStringArray(R.array.Bisalalli_school);  break;
            case "Kalledevar":
                school=res.getStringArray(R.array.Kalledevar_school);  break;
            case "Gundenahalli":
                school=res.getStringArray(R.array.Gundenahalli_school);  break;
            case "Hireanaji":
                school=res.getStringArray(R.array.Hireanaji_school);  break;
            case "Shidenur":
                school=res.getStringArray(R.array.Shidenur_school);  break;
            case "Keravadi":
                school=res.getStringArray(R.array.Keravadi_school);  break;
            case "Masanagi":
                school=res.getStringArray(R.array.Masanagi_school);  break;
            case "Budapanahalli":
                school=res.getStringArray(R.array.Budapanahalli_school);  break;
            case "Muttur":
                school=res.getStringArray(R.array.Muttur_school);  break;
            case "Chikkabasur":
                school=res.getStringArray(R.array.Chikkabasur_school);  break;
            case "Kadaramandalagi":
                school=res.getStringArray(R.array.Kadaramandalagi_school);  break;
            case "Mallur":
                school=res.getStringArray(R.array.Mallur_school);  break;
            case "Motebennur":
                school=res.getStringArray(R.array.Motebennur_school);  break;
            case "Kaginele":
                school=res.getStringArray(R.array.Kaginele_school);  break;
            case "Haleshidenoor":
                school=res.getStringArray(R.array.Haleshidenoor_school);  break;
            case "Kanvalli":
                school=res.getStringArray(R.array.Kanvalli_school);  break;
            case "Karajagi":
                school=res.getStringArray(R.array.Karajagi_school);  break;
            case "Mevundi":
                school=res.getStringArray(R.array.Mevundi_school);  break;
            case "Yalagacchi":
                school=res.getStringArray(R.array.Yalagacchi_school);  break;
            case "Havanur":
                school=res.getStringArray(R.array.Havanur_school);  break;
            case "Nelogalla":
                school=res.getStringArray(R.array.Nelogalla_school);  break;
            case "Kabbur":
                school=res.getStringArray(R.array.Kabbur_school);  break;
            case "Agadi":
                school=res.getStringArray(R.array.Agadi_school);  break;
            case "Devagiri":
                school=res.getStringArray(R.array.Devagiri_school);  break;
            case "Devihosur":
                school=res.getStringArray(R.array.Devihosur_school);  break;
            case "Neglur":
                school=res.getStringArray(R.array.Neglur_school);  break;
            case "Sangur":
                school=res.getStringArray(R.array.Sangur_school);  break;
            case "Kurubagunda":
                school=res.getStringArray(R.array.Kurubagunda_school);  break;
            case "Belavagi":
                school=res.getStringArray(R.array.Belavagi_school);  break;
            case "Guttal":
                school=res.getStringArray(R.array.Guttal_school);  break;
            case "Hosaritti":
                school=res.getStringArray(R.array.Hosaritti_school);  break;
            case "Aladakatti":
                school=res.getStringArray(R.array.Aladakatti_school);  break;
            case "Arlawada":
                school=res.getStringArray(R.array.Arlawada_school);  break;
            case "Yadoga":
                school=res.getStringArray(R.array.Yadoga_school);  break;
            case "Janaga":
                school=res.getStringArray(R.array.Janaga_school);  break;
            case "Bhagavati":
                school=res.getStringArray(R.array.Bhagavati_school);  break;
            case "Gundolli":
                school=res.getStringArray(R.array.Gundolli_school);  break;
            case "Teragao":
                school=res.getStringArray(R.array.Teragao_school);  break;
            case "Mangalawad":
                school=res.getStringArray(R.array.Mangalawad_school);  break;
            case "Satnalli":
                school=res.getStringArray(R.array.Satnalli_school);  break;
            case "Murkawada":
                school=res.getStringArray(R.array.Murkawada_school);  break;
            case "Belavatagi":
                school=res.getStringArray(R.array.Belavatagi_school);  break;
            case "Kavalawada":
                school=res.getStringArray(R.array.Kavalawada_school);  break;
            case "Sanbrani":
                school=res.getStringArray(R.array.Sanbrani_school);  break;
            case "Chibbalgeri":
                school=res.getStringArray(R.array.Chibbalgeri_school);  break;
            case "K K Halli":
                school=res.getStringArray(R.array.K_K_Halli_school);  break;
            case "Melin-Idgunji":
                school=res.getStringArray(R.array.Melin_Idgunji_school);  break;
            case "Manki":
                school=res.getStringArray(R.array.Manki_school);  break;
            case "Gundabala":
                school=res.getStringArray(R.array.Gundabala_school);  break;
            case "Jalwal Karki":
                school=res.getStringArray(R.array.Jalwal_Karki_school);  break;
            case "Hodke Shiroor":
                school=res.getStringArray(R.array.Hodke_Shiroor_school);  break;
            case "Hadinbal":
                school=res.getStringArray(R.array.Hadinbal_school);  break;
            case "Hulegar":
                school=res.getStringArray(R.array.Hulegar_school);  break;
            case "Mallapur":
                school=res.getStringArray(R.array.Mallapur_school);  break;
            case "Karki":
                school=res.getStringArray(R.array.Karki_school);  break;
            case "Salkod":
                school=res.getStringArray(R.array.Salkod_school);  break;
            case "Mugwa":
                school=res.getStringArray(R.array.Mugwa_school);  break;
            case "Kasarkod":
                school=res.getStringArray(R.array.Kasarkod_school);  break;
            case "Anilgod":
                school=res.getStringArray(R.array.Anilgod_school);  break;
            case "Magod":
                school=res.getStringArray(R.array.Magod_school);  break;
            case "Kadtoka":
                school=res.getStringArray(R.array.Kadtoka_school);  break;
            case "Haldipur":
                school=res.getStringArray(R.array.Haldipur_school);  break;
            case "Maka Nadaku":
                school=res.getStringArray(R.array.Maka_Nadaku_school);  break;
            case "Hire Kumbala Kunte":
                school=res.getStringArray(R.array.Hire_Kumbala_Kunte_school);  break;
            case "Hyalya":
                school=res.getStringArray(R.array.Hyalya_school);  break;
            case "Nimbalageri":
                school=res.getStringArray(R.array.Nimbalageri_school);  break;
            case "Thimmala Pura":
                school=res.getStringArray(R.array.Thimmala_Pura_school);  break;
            case "Gudekote":
                school=res.getStringArray(R.array.Gudekote_school);  break;
            case "Kencha Mallana Halli":
                school=res.getStringArray(R.array.Kencha_Mallana_Halli_school);  break;
            case "Huralihal":
                school=res.getStringArray(R.array.Huralihal_school);  break;
            case "Thoola Halli":
                school=res.getStringArray(R.array.Thoola_Halli_school);  break;
            case "Ujjini":
                school=res.getStringArray(R.array.Ujjini_school);  break;
            case "Hosalli":
                school=res.getStringArray(R.array.Hosalli_school);  break;
            case "Kandagallu":
                school=res.getStringArray(R.array.Kandagallu_school);  break;
            case "Thoranagallu":
                school=res.getStringArray(R.array.Thoranagallu_school);  break;
            case "Donimalai":
                school=res.getStringArray(R.array.Donimalai_school);  break;
            case "Bommagatta":
                school=res.getStringArray(R.array.Bommagatta_school);  break;
            case "Sandur":
                school=res.getStringArray(R.array.Sandur_school);  break;
            case "Choranoor":
                school=res.getStringArray(R.array.Choranoor_school);  break;
            case "Sovena Halli":
                school=res.getStringArray(R.array.Sovena_Halli_school);  break;
            case "Banni Hatti":
                school=res.getStringArray(R.array.Banni_Hatti_school);  break;
            case "Bandri":
                school=res.getStringArray(R.array.Bandri_school);  break;
            case "Chornur":
                school=res.getStringArray(R.array.Chornur_school);  break;
            case "Sonala":
                school=res.getStringArray(R.array.Sonala_school);  break;
            case "Belkuni(Ch)":
                school=res.getStringArray(R.array.Belkuni_Ch_school);  break;
            case "Kushnoor(T)":
                school=res.getStringArray(R.array.Kushnoor_T_school);  break;
            case "Santhpur":
                school=res.getStringArray(R.array.Santhpur_school);  break;
            case "Wadgaon(D)":
                school=res.getStringArray(R.array.Wadgaon_D_school);  break;
            case "Aurad":
                school=res.getStringArray(R.array.Aurad_school);  break;
            case "Chintaki":
                school=res.getStringArray(R.array.Chintaki_school);  break;
            case "Kamalnagar":
                school=res.getStringArray(R.array.Kamalnagar_school);  break;
            case "Kushnoor-T":
                school=res.getStringArray(R.array.Kushnoor_T_school);  break;
            case "Wadgaon":
                school=res.getStringArray(R.array.Wadgaon_school);  break;
            case "Algood":
                school=res.getStringArray(R.array.Algood_school);  break;
            case "Belur":
                school=res.getStringArray(R.array.Belur_school);  break;
            case "Batgera":
                school=res.getStringArray(R.array.Batgera_school);  break;
            case "Bhosga":
                school=res.getStringArray(R.array.Bhosga_school);  break;
            case "Gaur":
                school=res.getStringArray(R.array.Gaur_school);  break;
            case "Dhannura (K)":
                school=res.getStringArray(R.array.Dhannura_K_school);  break;
            case "Gadalegoan (B)":
                school=res.getStringArray(R.array.Gadalegoan_B_school);  break;
            case "Harkood":
                school=res.getStringArray(R.array.Harkood_school);  break;
            case "Kohinoor":
                school=res.getStringArray(R.array.Kohinoor_school);  break;
            case "Koudiyal (R)":
                school=res.getStringArray(R.array.Koudiyal_R_school);  break;
            case "Manthal":
                school=res.getStringArray(R.array.Manthal_school);  break;
            case "Mudbi":
                school=res.getStringArray(R.array.Mudbi_school);  break;
            case "Narayanpur":
                school=res.getStringArray(R.array.Narayanpur_school);  break;
            case "Rajeshwar":
                school=res.getStringArray(R.array.Rajeshwar_school);  break;
            case "Rajola":
                school=res.getStringArray(R.array.Rajola_school);  break;
            case "Yarandi":
                school=res.getStringArray(R.array.Yarandi_school);  break;
            case "Kitta":
                school=res.getStringArray(R.array.Kitta_school);  break;
            case "Ujalam":
                school=res.getStringArray(R.array.Ujalam_school);  break;
            case "Gorta (B)":
                school=res.getStringArray(R.array.Gorta_B_school);  break;
            case "Hulsoor":
                school=res.getStringArray(R.array.Hulsoor_school);  break;
            case "Sastapur":
                school=res.getStringArray(R.array.Sastapur_school);  break;
            case "Kherda (B)":
                school=res.getStringArray(R.array.Kherda_B_school);  break;
            case "Bet Balkunda":
                school=res.getStringArray(R.array.Bet_Balkunda_school);  break;
            case "Muchalamb":
                school=res.getStringArray(R.array.Muchalamb_school);  break;
            case "Narayanpur ":
                school=res.getStringArray(R.array.Narayanpur_school);  break;
            case "Allur [B]":
                school=res.getStringArray(R.array.Allur_B_school);  break;
            case "Bhagodi":
                school=res.getStringArray(R.array.Bhagodi_school);  break;
            case "Bhimanalli":
                school=res.getStringArray(R.array.Bhimanalli_school);  break;
            case "Chincholi [H]":
                school=res.getStringArray(R.array.Chincholi_H_school);  break;
            case "Dandoti":
                school=res.getStringArray(R.array.Dandoti_school);  break;
            case "Diggaon":
                school=res.getStringArray(R.array.Diggaon_school);  break;
            case "Gotur":
                school=res.getStringArray(R.array.Gotur_school);  break;
            case "Gunddagurthi":
                school=res.getStringArray(R.array.Gunddagurthi_school);  break;
            case "Honagunta":
                school=res.getStringArray(R.array.Honagunta_school);  break;
            case "Kalgurti":
                school=res.getStringArray(R.array.Kalgurti_school);  break;
            case "Kandagol":
                school=res.getStringArray(R.array.Kandagol_school);  break;
            case "Kodadur":
                school=res.getStringArray(R.array.Kodadur_school);  break;
            case "Kollur":
                school=res.getStringArray(R.array.Kollur_school);  break;
            case "Korwar":
                school=res.getStringArray(R.array.Korwar_school);  break;
            case "Mangalagi":
                school=res.getStringArray(R.array.Mangalagi_school);  break;
            case "Martur":
                school=res.getStringArray(R.array.Martur_school);  break;
            case "Peth Shiroor":
                school=res.getStringArray(R.array.Peth_Shiroor_school);  break;
            case "Ravoor":
                school=res.getStringArray(R.array.Ravoor_school);  break;
            case "Tengali":
                school=res.getStringArray(R.array.Tengali_school);  break;
            case "Chittapur":
                school=res.getStringArray(R.array.Chittapur_school);  break;
            case "Wadi":
                school=res.getStringArray(R.array.Wadi_school);  break;
            case "Alahalli":
                school=res.getStringArray(R.array.Alahalli_school);  break;
            case "Hebbal":
                school=res.getStringArray(R.array.Hebbal_school);  break;
            case "Kalagi":
                school=res.getStringArray(R.array.Kalagi_school);  break;
            case "Kamaradi":
                school=res.getStringArray(R.array.Kamaradi_school);  break;
            case "Madabool":
                school=res.getStringArray(R.array.Madabool_school);  break;
            case "Malagatti":
                school=res.getStringArray(R.array.Malagatti_school);  break;
            case "Bankur":
                school=res.getStringArray(R.array.Bankur_school);  break;
            case "Revagi":
                school=res.getStringArray(R.array.Revagi_school);  break;
            case "Satanoor":
                school=res.getStringArray(R.array.Satanoor_school);  break;
            case "Yagapur":
                school=res.getStringArray(R.array.Yagapur_school);  break;
            case "Nalwar":
                school=res.getStringArray(R.array.Nalwar_school);  break;
            case "Nippani":
                school=res.getStringArray(R.array.Nippani_school);  break;
            case "Donagoan":
                school=res.getStringArray(R.array.Donagoan_school);  break;
            case "Rajapur":
                school=res.getStringArray(R.array.Rajapur_school);  break;
            case "Shahabad":
                school=res.getStringArray(R.array.Shahabad_school);  break;
            case "Shellagi":
                school=res.getStringArray(R.array.Shellagi_school);  break;
            case "Mudbool":
                school=res.getStringArray(R.array.Mudbool_school);  break;
            case "Bhimanahalli":
                school=res.getStringArray(R.array.Bhimanahalli_school);  break;
            case "Devapur":
                school=res.getStringArray(R.array.Devapur_school);  break;
            case "Hunasagi":
                school=res.getStringArray(R.array.Hunasagi_school);  break;
            case "Kembhavi":
                school=res.getStringArray(R.array.Kembhavi_school);  break;
            case "Vajjal":
                school=res.getStringArray(R.array.Vajjal_school);  break;
            case "Mudanoor K.":
                school=res.getStringArray(R.array.Mudanoor_K_school);  break;
            case "Rajankollur":
                school=res.getStringArray(R.array.Rajankollur_school);  break;
            case "Kakkera":
                school=res.getStringArray(R.array.Kakkera_school);  break;
            case "Devargonal":
                school=res.getStringArray(R.array.Devargonal_school);  break;
            case "Kodekal":
                school=res.getStringArray(R.array.Kodekal_school);  break;
            case "Naganoor":
                school=res.getStringArray(R.array.Naganoor_school);  break;
            case "Yalagi":
                school=res.getStringArray(R.array.Yalagi_school);  break;
            case "Devatkal":
                school=res.getStringArray(R.array.Devatkal_school);  break;
            case "Benaknahalli":
                school=res.getStringArray(R.array.Benaknahalli_school);  break;
            case "Bychavalli":
                school=res.getStringArray(R.array.Bychavalli_school);  break;
            case "Agni":
                school=res.getStringArray(R.array.Agni_school);  break;
            case "Benakal":
                school=res.getStringArray(R.array.Benakal_school);  break;
            case "Agalakera":
                school=res.getStringArray(R.array.Agalakera_school);  break;
            case "Alawandi":
                school=res.getStringArray(R.array.Alawandi_school);  break;
            case "Bandiharlapur":
                school=res.getStringArray(R.array.Bandiharlapur_school);  break;
            case "Betageri":
                school=res.getStringArray(R.array.Betageri_school);  break;
            case "Bhaghyanagar":
                school=res.getStringArray(R.array.Bhaghyanagar_school);  break;
            case "Ginigeri":
                school=res.getStringArray(R.array.Ginigeri_school);  break;
            case "Hirebhoganhal":
                school=res.getStringArray(R.array.Hirebhoganhal_school);  break;
            case "Indaragi":
                school=res.getStringArray(R.array.Indaragi_school);  break;
            case "Kawaloor":
                school=res.getStringArray(R.array.Kawaloor_school);  break;
            case "Kinhal":
                school=res.getStringArray(R.array.Kinhal_school);  break;
            case "Lebagera":
                school=res.getStringArray(R.array.Lebagera_school);  break;
            case "Budagumpa":
                school=res.getStringArray(R.array.Budagumpa_school);  break;
            case "Hiresindhogi":
                school=res.getStringArray(R.array.Hiresindhogi_school);  break;
            case "Irkalgada":
                school=res.getStringArray(R.array.Irkalgada_school);  break;
            case "Kataraki":
                school=res.getStringArray(R.array.Kataraki_school);  break;
            case "Hitnal":
                school=res.getStringArray(R.array.Hitnal_school);  break;
            case "Hulagi":
                school=res.getStringArray(R.array.Hulagi_school);  break;
            case "Munirabad":
                school=res.getStringArray(R.array.Munirabad_school);  break;
            case "Balagera":
                school=res.getStringArray(R.array.Balagera_school);  break;
            case "Bannikoppa":
                school=res.getStringArray(R.array.Bannikoppa_school);  break;
            case "Bevoor":
                school=res.getStringArray(R.array.Bevoor_school);  break;
            case "Bhanapur":
                school=res.getStringArray(R.array.Bhanapur_school);  break;
            case "Karamudi":
                school=res.getStringArray(R.array.Karamudi_school);  break;
            case "Ganadal":
                school=res.getStringArray(R.array.Ganadal_school);  break;
            case "Kukanoor":
                school=res.getStringArray(R.array.Kukanoor_school);  break;
            case "Mangaloor":
                school=res.getStringArray(R.array.Mangaloor_school);  break;
            case "Talakal":
                school=res.getStringArray(R.array.Talakal_school);  break;
            case "Hirewankalakunta":
                school=res.getStringArray(R.array.Hirewankalakunta_school);  break;
            case "Mudhol":
                school=res.getStringArray(R.array.Mudhol_school);  break;
            case "Alkod":
                school=res.getStringArray(R.array.Alkod_school);  break;
            case "Arkera":
                school=res.getStringArray(R.array.Arkera_school);  break;
            case "Gabbur":
                school=res.getStringArray(R.array.Gabbur_school);  break;
            case "Jalahalli":
                school=res.getStringArray(R.array.Jalahalli_school);  break;
            case "Jagir Jadaladinni":
                school=res.getStringArray(R.array.Jagir_Jadaladinni_school);  break;
            case "Mustur":
                school=res.getStringArray(R.array.Mustur_school);  break;
            case "Masarakal":
                school=res.getStringArray(R.array.Masarakal_school);  break;
            case "Anwar":
                school=res.getStringArray(R.array.Anwar_school);  break;
            case "Baiyapur":
                school=res.getStringArray(R.array.Baiyapur_school);  break;
            case "Sarjapur":
                school=res.getStringArray(R.array.Sarjapur_school);  break;
            case "Kannal":
                school=res.getStringArray(R.array.Kannal_school);  break;
            case "Nagalapur":
                school=res.getStringArray(R.array.Nagalapur_school);  break;
            case "Nagarhal":
                school=res.getStringArray(R.array.Nagarhal_school);  break;
            case "Guragunta":
                school=res.getStringArray(R.array.Guragunta_school);  break;
            case "Anahosur":
                school=res.getStringArray(R.array.Anahosur_school);  break;
            case "Hatti":
                school=res.getStringArray(R.array.Hatti_school);  break;
            case "Yalagatta":
                school=res.getStringArray(R.array.Yalagatta_school);  break;
            case "Maski":
                school=res.getStringArray(R.array.Maski_school);  break;
            case "Devarabhupur":
                school=res.getStringArray(R.array.Devarabhupur_school);  break;
            case "Doddaraya Pet":
                school=res.getStringArray(R.array.Doddaraya_Pet_school);  break;
            case "Thamada Halli":
                school=res.getStringArray(R.array.Thamada_Halli_school);  break;
            case "Haradana Halli":
                school=res.getStringArray(R.array.Haradana_Halli_school);  break;
            case "Yaragana Halli":
                school=res.getStringArray(R.array.Yaragana_Halli_school);  break;
            case "Gulipura":
                school=res.getStringArray(R.array.Gulipura_school);  break;
            case "Erasa Vadi":
                school=res.getStringArray(R.array.Erasa_Vadi_school);  break;
            case "Mangala":
                school=res.getStringArray(R.array.Mangala_school);  break;
            case "Harave":
                school=res.getStringArray(R.array.Harave_school);  break;
            case "Bisalavadi":
                school=res.getStringArray(R.array.Bisalavadi_school);  break;
            case "Nanjedevana Pura":
                school=res.getStringArray(R.array.Nanjedevana_Pura_school);  break;
            case "Yanagalli":
                school=res.getStringArray(R.array.Yanagalli_school);  break;
            case "Chandakavadi":
                school=res.getStringArray(R.array.Chandakavadi_school);  break;
            case "Santhe Marahalli":
                school=res.getStringArray(R.array.Santhe_Marahalli_school);  break;
            case "Udigala":
                school=res.getStringArray(R.array.Udigala_school);  break;
            case "Ummathur":
                school=res.getStringArray(R.array.Ummathur_school);  break;
            case "Kagala Vadi":
                school=res.getStringArray(R.array.Kagala_Vadi_school);  break;
            case "Arakala Vadi":
                school=res.getStringArray(R.array.Arakala_Vadi_school);  break;
            case "Chamaraj-1":
                school=res.getStringArray(R.array.Chamaraj_1_school);  break;
            case "Maddur":
                school=res.getStringArray(R.array.Maddur_school);  break;
            case "Gowda Halli":
                school=res.getStringArray(R.array.Gowda_Halli_school);  break;
            case "B.R.Hills":
                school=res.getStringArray(R.array.B_R_Hills_school);  break;
            case "Beechanahalli":
                school=res.getStringArray(R.array.Beechanahalli_school);  break;
            case "Annuru":
                school=res.getStringArray(R.array.Annuru_school);  break;
            case "Madapura":
                school=res.getStringArray(R.array.Madapura_school);  break;
            case "K.Belthur":
                school=res.getStringArray(R.array.K_Belthur_school);  break;
            case "Hommaragalli":
                school=res.getStringArray(R.array.Hommaragalli_school);  break;
            case "Hebbala Guppe":
                school=res.getStringArray(R.array.Hebbala_Guppe_school);  break;
            case "G.B.Saragur":
                school=res.getStringArray(R.array.G_B_Saragur_school);  break;
            case "Antharasanthe":
                school=res.getStringArray(R.array.Antharasanthe_school);  break;
            case "Sagare":
                school=res.getStringArray(R.array.Sagare_school);  break;
            case "Yara Halli":
                school=res.getStringArray(R.array.Yara_Halli_school);  break;
            case "Thumbasoge":
                school=res.getStringArray(R.array.Thumbasoge_school);  break;
            case "Savve":
                school=res.getStringArray(R.array.Savve_school);  break;
            case "Kanchamalli":
                school=res.getStringArray(R.array.Kanchamalli_school);  break;
            case "Mullur":
                school=res.getStringArray(R.array.Mullur_school);  break;
            case "D B Kuppe":
                school=res.getStringArray(R.array.D_B_Kuppe_school);  break;
            case "Masalli":
                school=res.getStringArray(R.array.Masalli_school);  break;
            case "Kenchana Halli":
                school=res.getStringArray(R.array.Kenchana_Halli_school);  break;
            case "Magge":
                school=res.getStringArray(R.array.Magge_school);  break;
            case "Bache Gowdan Halli":
                school=res.getStringArray(R.array.Bache_Gowdan_Halli_school);  break;
            case "Chedara Halli":
                school=res.getStringArray(R.array.Chedara_Halli_school);  break;
            case "Mavina Halli":
                school=res.getStringArray(R.array.Mavina_Halli_school);  break;
            case "Kodagalli":
                school=res.getStringArray(R.array.Kodagalli_school);  break;
            case "Bannahalli Hundi":
                school=res.getStringArray(R.array.Bannahalli_Hundi_school);  break;
            case "Musuvena Koppalu":
                school=res.getStringArray(R.array.Musuvena_Koppalu_school);  break;
            case "Muguru":
                school=res.getStringArray(R.array.Muguru_school);  break;
            case "Vatalu":
                school=res.getStringArray(R.array.Vatalu_school);  break;
            case "Byrapura":
                school=res.getStringArray(R.array.Byrapura_school);  break;
            case "Benakana Halli":
                school=res.getStringArray(R.array.Benakana_Halli_school);  break;
            case "Beregere Hundi":
                school=res.getStringArray(R.array.Beregere_Hundi_school);  break;
            case "Talakadu":
                school=res.getStringArray(R.array.Talakadu_school);  break;
            case "Attahalli":
                school=res.getStringArray(R.array.Attahalli_school);  break;
            case "Kethupura":
                school=res.getStringArray(R.array.Kethupura_school);  break;
            case "Dodde Bagelu":
                school=res.getStringArray(R.array.Dodde_Bagelu_school);  break;

            case "Mudigere":
                school=res.getStringArray(R.array.Mudigere_school);  break;


            case "Medikere":
                school=res.getStringArray(R.array.Medikere_school);  break;

            case "Kuppahalli":
                school=res.getStringArray(R.array.Kuppahalli_school);  break;

            case "Porshathalli":
                school=res.getStringArray(R.array.Porshathalli_school);  break;



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
