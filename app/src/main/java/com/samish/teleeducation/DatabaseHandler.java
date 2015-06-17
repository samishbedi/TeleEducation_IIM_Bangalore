package com.samish.teleeducation;

/**
 * Created by samish on 16/6/15.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;


public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    //private static final int DATABASE_VERSION = 1;

    // Database Name
    public static final String DATABASE_NAME = "TalukSurvey.db";

    // Contacts table name
    public static final String TABLE_TALUK = "Taluk_Survey";

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




    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    // Creating Tables
    @Override
   public void onCreate(SQLiteDatabase db) {
        String CREATE_TALUK_TABLE = "CREATE TABLE " + TABLE_TALUK + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +  taluk + " TEXT," + fo_name + " TEXT,"
                + ti_name + " TEXT," + t1 + " TEXT,"+ t2 + " TEXT,"+ t3 + " TEXT,"+ t4 + " TEXT,"+t5 + " TEXT,"+ t5_moderator + " TEXT,"+t6 + " TEXT,"
                + t7 + " TEXT,"+ t8 + " TEXT,"+ t9 + " TEXT,"+ t10 + " TEXT,"+ tcomment + " TEXT"+");";
        db.execSQL(CREATE_TALUK_TABLE);

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
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    void insert(String taluk_s,String foname,String tiname,String t1s,String t2s,String t3s,String t4s,String t5s,String t5_moderator_s,String t6s,String t7s,String t8s,String t9s,String t10s,String t5_comment_s) {

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


        // Inserting Row
        db.insert(TABLE_TALUK, null, values);
        db.close(); // Closing database connection
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