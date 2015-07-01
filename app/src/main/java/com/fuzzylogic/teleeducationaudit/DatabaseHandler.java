package com.fuzzylogic.teleeducationaudit;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;

import java.util.ArrayList;
import java.util.List;


public class DatabaseHandler extends SQLiteOpenHelper {





    // All Static variables
    // Database Version
    //private static final int DATABASE_VERSION = 1;

    // Database Name
    public static final String DATABASE_NAME = "TeleEducation.db";



    // Contacts table name
    public static final String TABLE_TALUK = "Taluk_Survey";
    public static final String TABLE_SCHOOL = "School_Survey";

    // Contacts Table Columns names
    public static final String KEY_ID = "ID";
    public static final String taluk = "Taluk_Name";
    public static final String fo_name = "Field_officer_name";
    public static final String ti_name = "Taluk_Incharge_name";
    public static final String t1 = "Is_TI_given_proper_training_to_update_OMS";
    public static final String t2 = "Does_TI_Understand_the_OMS_tool";
    public static final String t3 = "Is_the_TI_able_to_make_daily_updates_in_OMS";
    public static final String t4 = "Is_TI_able_to_solve_the_problem_in_School_if_any_complaint_is_received";
    public static final String t5 = "Does_TI_have_a_panel_of_Moderators";
    public static final String t5_moderator = "Moderator_details_Name_School_Class_Subject_Date";
    public static final String t6 = "Whether_Moderator_has_been_trained";
    public static final String t7 = "Whether_TI_have_a_detailed_plan_for_3_days_in_advance_for_Moderator_Session_in_consultation_with_BRC";
    public static final String t8 = "Is_the_detailed_plan_for_3_days_prior_to_allocation_of_moderators_for_each_session_put_on_OMS_tool";
    public static final String t9 = "Is_TI_cooperative_and_understands_the_data_requirement";
    public static final String t10 = "Are_spare_parts_available_in_TI_location";
    public static final String tcomment = "Comments";

    public static final String KEY_ID_SCHOOL = "ID";
    public static final String village="Village_Name";
    public static final String school="School_Name";
    public static final String fo_name_school= "Field_officer_name";
    public static final String bc="Is_barcode_labelled";
    public static final String laptop="Laptop";
    public static final String proj="Projector";
    public static final String modem="Modem";
    public static final String hugh="Hughes_Modem";
    public static final String mob="Mobile";
    public static final String ant="Antennae";
    public static final String sol="Solar";
    public static final String ups="UPS_Battery";
    public static final String classcond="Class_condition";
    public static final String crowd="Class_over_crowded";
    public static final String strt="Class_strength";
    public static final String prnt="Class_presence";
    public static final String notes="Students_notes";
    public static final String prop="Class_running_properly";
    public static final String atten="Students_attentive";
    public static final String clr="audio_clarity";
    public static final String dbt="students_clarify_doubts_through_mobile_phone";
    public static final String teacher="teacher_providing_assistance";
    public static final String vsc="VSC_present";
    public static final String vsc1="vsc_updated";
    public static final String rsn="Reason_for_class_running_late";
    public static final String scomment = "Comments";

    public static final String uploaded="Uploaded";
    public static final String uploaded_s="Uploaded_S";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    // Creating Tables
    @Override
   public void onCreate(SQLiteDatabase db) {
        String CREATE_TALUK_TABLE = "CREATE TABLE " + TABLE_TALUK + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +  taluk + " TEXT," + fo_name + " TEXT,"
                + ti_name + " TEXT," + t1 + " TEXT,"+ t2 + " TEXT,"+ t3 + " TEXT,"+ t4 + " TEXT,"+t5 + " TEXT,"+ t5_moderator + " TEXT,"+t6 + " TEXT,"
                + t7 + " TEXT,"+ t8 + " TEXT,"+ t9 + " TEXT,"+ t10 + " TEXT,"+ tcomment + " TEXT,"+ uploaded + " TEXT"+");";
        db.execSQL(CREATE_TALUK_TABLE);

        String CREATE_SCHOOL_TABLE = "CREATE TABLE " + TABLE_SCHOOL + "("
                + KEY_ID_SCHOOL + " INTEGER PRIMARY KEY AUTOINCREMENT," +  taluk + " TEXT," + village + " TEXT," + school + " TEXT,"
                + fo_name_school + " TEXT," + bc + " TEXT,"+ laptop + " TEXT,"+ proj + " TEXT,"+ modem + " TEXT,"+hugh + " TEXT,"+ mob + " TEXT,"+ant + " TEXT,"
                + sol + " TEXT,"+ ups + " TEXT,"+ classcond + " TEXT,"+ crowd + " TEXT,"+ strt + " TEXT,"+ prnt + " TEXT,"+ notes + " TEXT,"+ prop + " TEXT,"+
                atten + " TEXT,"+ clr + " TEXT,"+ dbt + " TEXT,"+ teacher + " TEXT,"+ vsc + " TEXT,"+  vsc1 + " TEXT,"+
                rsn + " TEXT,"+ scomment + " TEXT,"+ uploaded_s + " TEXT"+");";
        db.execSQL(CREATE_SCHOOL_TABLE);





       // +  t1 + " TEXT,"+ t2 + " TEXT,"+ t3 + " TEXT,"+ t4 + " TEXT,"+ t5 + " TEXT,"+ t5_moderator + " TEXT,"+t6 + " TEXT,"
        //+ t7 + " TEXT,"+ t8 + " TEXT,"+ t9 + " TEXT,"+ t10 + " TEXT,"+ tcomment + " TEXT)"


    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TALUK);

        // Create tables again
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SCHOOL);

        // Create tables again
        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    void insert_taluk(String taluk_s,String foname,String tiname,String t1s,String t2s,String t3s,String t4s,String t5s,String t5_moderator_s,String t6s,String t7s,String t8s,String t9s,String t10s,String t5_comment_s) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(taluk,taluk_s);
        values.put(fo_name, foname);
        values.put(ti_name, tiname);
        values.put(t1, t1s);
        values.put(t2, t2s);
        values.put(t3, t3s);
        values.put(t4, t4s);
        values.put(t5, t5s);
        values.put(t5_moderator,t5_moderator_s);
        values.put(t6, t6s);
        values.put(t7, t7s);
        values.put(t8,t8s );
        values.put(t9,t9s );
        values.put(t10, t10s);
        values.put(tcomment, t5_comment_s);
        values.put(uploaded, "0");

        // Inserting Row
        db.insert(TABLE_TALUK, null, values);
        db.close(); // Closing database connection
    }

    void insert_school(String taluk_s,String village_s,String school_s,String fo_name_school_s,String bcs,String laptops,String projs,String modems,String hughs,String mobs,
                       String ants,String sols,String ups_s,String classcond_s,String crowds,String strts,String prnts,String notes_s,
                       String props,String attens,String clrs,String dbts,String teachers,String vscs,String vsc1s,String rsns,String scomments) {

       // ,String laptops,String projs,String modems,,String mobs,
         //       String ants,String sols,String ups_s,String classcond_s,String crowds,String strts,String prnts,String notes_s,
           //     String props,String attens,String clrs,String dbts,String teachers,String vscs,String vsc1s,String rsns,String scomments

        SQLiteDatabase db1 = this.getWritableDatabase();

        ContentValues values_s = new ContentValues();
        values_s.put(taluk,taluk_s);
        values_s.put(village, village_s);
        values_s.put(school, school_s);
        values_s.put(fo_name_school, fo_name_school_s);
        values_s.put(bc, bcs);
        values_s.put(laptop, laptops);
        values_s.put(proj, projs);
        values_s.put(modem, modems);
        values_s.put(hugh,hughs);
        values_s.put(mob, mobs);
        values_s.put(ant, ants);
        values_s.put(sol,sols);
        values_s.put(ups,ups_s);
        values_s.put(classcond, classcond_s);
        values_s.put(crowd, crowds);
        values_s.put(strt, strts);
        values_s.put(prnt, prnts);
        values_s.put(notes, notes_s);
        values_s.put(prop, props);
        values_s.put(atten, attens);
        values_s.put(clr, clrs);
        values_s.put(dbt, dbts);
        values_s.put(teacher,teachers);
        values_s.put(vsc, vscs);
        values_s.put(vsc1, vsc1s);
        values_s.put(rsn, rsns);
        values_s.put(scomment, scomments);
        values_s.put(uploaded_s, "0");



        // Inserting Row
        db1.insert(TABLE_SCHOOL, null, values_s);
        db1.close(); // Closing database connection
    }

    List<String> values(){
        List<String> dbl = new ArrayList<String>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c;
        String selectQuery = "SELECT  * FROM " + TABLE_TALUK;
        c=db.rawQuery(selectQuery,null);
        c.moveToFirst();
         do {
             dbl.add(String.valueOf(c.getInt(0)));
             dbl.add(c.getString(1));
             dbl.add(c.getString(2));
             dbl.add(c.getString(3));
             dbl.add(c.getString(4));
             dbl.add(c.getString(5));
             dbl.add(c.getString(6));
             dbl.add(c.getString(7));
             dbl.add(c.getString(8));
             dbl.add(c.getString(9));
             dbl.add(c.getString(10));
             dbl.add(c.getString(11));
             dbl.add(c.getString(12));
             dbl.add(c.getString(13));
             dbl.add(c.getString(14));
             dbl.add(c.getString(15));
             dbl.add(c.getString(16));

         }while(c.moveToNext());
        return dbl;
    }

    List<String> values_school(){
        List<String> dbl = new ArrayList<String>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c;
        String selectQuery = "SELECT  * FROM " + TABLE_SCHOOL;
        c=db.rawQuery(selectQuery,null);
        c.moveToFirst();
        do {
            dbl.add(String.valueOf(c.getInt(0)));
            dbl.add(c.getString(1));
            dbl.add(c.getString(2));
            dbl.add(c.getString(3));
            dbl.add(c.getString(4));
            dbl.add(c.getString(5));
            dbl.add(c.getString(6));
            dbl.add(c.getString(7));
            dbl.add(c.getString(8));
            dbl.add(c.getString(9));
            dbl.add(c.getString(10));
            dbl.add(c.getString(11));
            dbl.add(c.getString(12));
            dbl.add(c.getString(13));
            dbl.add(c.getString(14));
            dbl.add(c.getString(15));
            dbl.add(c.getString(16));
            dbl.add(c.getString(17));
            dbl.add(c.getString(18));
            dbl.add(c.getString(19));
            dbl.add(c.getString(20));
            dbl.add(c.getString(21));
            dbl.add(c.getString(22));
            dbl.add(c.getString(23));
            dbl.add(c.getString(24));
            dbl.add(c.getString(25));
            dbl.add(c.getString(26));
            dbl.add(c.getString(27));
            dbl.add(c.getString(28));
        }while(c.moveToNext());
        return dbl;
    }

    int markUpload(int ID) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(uploaded, "1");

        // updating row
        return db.update(TABLE_TALUK, values, KEY_ID + "=" + ID, null);
    }

    int markUpload_s(int ID) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(uploaded_s,"1");

        // updating row
        return db.update(TABLE_SCHOOL, values, KEY_ID + "=" + ID, null);
    }


    void uploadOldData() {


        try {
            //Boolean booError = false;
            //Boolean NbooContinue = true;
            SQLiteDatabase db = this.getReadableDatabase();


                //hidepopup();

                //showpopup("Checking Location Details In Phone");
                Cursor objCursorLocation;
                String selectQuery = "SELECT  * FROM " + TABLE_TALUK;

                objCursorLocation = db.rawQuery(selectQuery, null);

                if (objCursorLocation.moveToFirst()) {
                    int intNoOfLocationUploaded = 0;
                    int intTotalCursorsCount = objCursorLocation.getCount();
                    int intPercentage = 0;
                    while (objCursorLocation.moveToNext()) {
                        intNoOfLocationUploaded += 1;

                     //   intPercentage = (int) ((intNoOfLocationUploaded / intTotalCursorsCount) * 100);

                     //   updatepopup("Uploading Location Log To Web Server",intPercentage);



                        int ID= objCursorLocation.getInt(0);
                        String Taluk_Name=objCursorLocation.getString(1);
                        String Field_Officer_Name= objCursorLocation.getString(2);
                        String Taluk_Incharge_Name= objCursorLocation.getString(3);
                        String Is_TI_given_proper_training_to_update_OMS= objCursorLocation.getString(4);
                        String Does_TI_understand_the_OMS_tool= objCursorLocation.getString(5);
                        String Is_the_TI_able_to_make_daily_updates_in_OMS= objCursorLocation.getString(6);
                        String Is_TI_able_to_solve_the_problem_in_School_if_any_complaint_is_received= objCursorLocation.getString(7);
                        String Does_ti_have_a_panel_of_moderators= objCursorLocation.getString(8);
                        String Moderator_details_Name_School_Class_Sbject_Date= objCursorLocation.getString(9);
                        String Whether_Moderator_has_been_trained= objCursorLocation.getString(10);
                        String Whether_TI_have_a_detailed_plan_for_3_days= objCursorLocation.getString(11);
                        String Is_the_detailed_plan_put_on_oms_tool= objCursorLocation.getString(12);
                        String is_ti_cooperative= objCursorLocation.getString(13);
                        String Are_spare_parts_available_in_location= objCursorLocation.getString(14);
                        String Comments= objCursorLocation.getString(15);
                        String PASSWORD="ii@m_s_urv@y@eg@";


                        CALLWSDOTNET objWS = new CALLWSDOTNET("http://203.129.241.19/is/Service.asmx");
                        objWS.AddPropertyInfo("PASSWORD",PASSWORD,CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("IMEI","ABC",CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("ID", ID, CALLWSDOTNET.datatype.INTEGER);
                        objWS.AddPropertyInfo("Taluk_Name", "Samish", CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Field_Officer_Name", Field_Officer_Name, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Taluk_Incharge_Name", Taluk_Incharge_Name, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Is_TI_given_proper_training_to_update_OMS", Is_TI_given_proper_training_to_update_OMS,CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Does_TI_understand_the_OMS_tool", Does_TI_understand_the_OMS_tool, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Is_The_TI_able_to_make_daily_updates_in_OMS", Is_the_TI_able_to_make_daily_updates_in_OMS, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Is_TI_able_to_solve_the_problem_in_school_if_any_complaint_is_received",  Is_TI_able_to_solve_the_problem_in_School_if_any_complaint_is_received, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Does_ti_have_a_panel_of_moderators", Does_ti_have_a_panel_of_moderators, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Moderator_details_Name_School_Class_Sbject_Date", Moderator_details_Name_School_Class_Sbject_Date, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo(" Whether_Moderator_has_been_trained", Whether_Moderator_has_been_trained, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Whether_ti_have_adetailed_plan_for_3_days",Whether_TI_have_a_detailed_plan_for_3_days, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Is_the_detailed_plan_put_oms_tool", Is_the_detailed_plan_put_on_oms_tool, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("is_ti_cooperative", is_ti_cooperative, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Are_spare_parts_available_in_location", Are_spare_parts_available_in_location, CALLWSDOTNET.datatype.STRING);
                        objWS.AddPropertyInfo("Comments", Comments, CALLWSDOTNET.datatype.STRING);

                        objWS.invokeWebService("UpdateTalukSurvey");

                      ;

            //            if (booLocationInserted.equals("UPDATED")) {
                                //
              //              } else {
                                // booError = true;
                //NbooContinue = false;

                  //          }


                    }
                }



            } catch (Exception ex) {

        }

    }




    // Getting single contact
 /*   Contact getContact(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CONTACTS, new String[] { KEY_ID,
                        KEY_NAME, KEY_PH_NO }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Contact contact = new Contact(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));
        // return contact
        return contact;
    }

    // Getting All Contacts
    public List<Contact> getAllContacts() {
        List<Contact> contactList = new ArrayList<Contact>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Contact contact = new Contact();
                contact.setID(Integer.parseInt(cursor.getString(0)));
                contact.setName(cursor.getString(1));
                contact.setPhoneNumber(cursor.getString(2));
                // Adding contact to list
                contactList.add(contact);
            } while (cursor.moveToNext());
        }

        // return contact list
        return contactList;
    }

    // Updating single contact
    public int updateContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.getName());
        values.put(KEY_PH_NO, contact.getPhoneNumber());

        // updating row
        return db.update(TABLE_CONTACTS, values, KEY_ID + " = ?",
                new String[] { String.valueOf(contact.getID()) });
    }

    // Deleting single contact
    public void deleteContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CONTACTS, KEY_ID + " = ?",
                new String[] { String.valueOf(contact.getID()) });
        db.close();
    }


    // Getting contacts Count
    public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_CONTACTS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }*/

}