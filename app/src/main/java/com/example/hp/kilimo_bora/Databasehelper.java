package com.example.hp.kilimo_bora;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import static com.example.hp.kilimo_bora.MainData.MainDataInfo.DATABASE_NAME;
import static com.example.hp.kilimo_bora.MainData.MainDataInfo.DATABASE_VERSION;

public class Databasehelper extends SQLiteOpenHelper {
    public Databasehelper(Context ctx) {

        super(ctx, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public static String createQuery =
            "CREATE TABLE '" + MainData.MainDataInfo.TABLE1_NAME + "'"/* +
                    "('" + MainData.MainDataInfo.DISEASES + "' VARCHAR(20)," +
                    "'" + MainData.MainDataInfo.REGIONS_GROWN + "' VARCHAR(20)," */+
                    "'" + MainData.MainDataInfo.CEREAL_TYPE + "' UNIQUE,NOT NULL,VARCHAR(20))";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createQuery);
        Log.d("CREATE", "Table Created Successfully");


    }


    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query;
        query = "DROP TABLE IF EXISTS Students";
        db.execSQL(query);
        onCreate(db);
    }


    public void insertData( String cereal_type) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();

        ContentValues values;

        try {

            values = new ContentValues();
           // values.put(MainData.MainDataInfo.DISEASES, diseases);
            //values.put(MainData.MainDataInfo.REGIONS_GROWN, region);
            values.put(MainData.MainDataInfo.CEREAL_TYPE, cereal_type);

            db.insert(MainData.MainDataInfo.TABLE1_NAME, null, values);
            db.insert(MainData.MainDataInfo.TABLE2_NAME, null, values);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            db.endTransaction();
            db.close();
        }
    }
    public ArrayList<String> getAllCereals() {

    ArrayList<String> list = new ArrayList<>();
    SQLiteDatabase db = this.getReadableDatabase();
      db.beginTransaction();



        try {
            String selectQuery = "SELECT * FROM " + MainData.MainDataInfo.TABLE1_NAME;
            Cursor cursor = db.rawQuery(selectQuery, null);

            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    String cereals = cursor.getString(cursor.getColumnIndex("cereals"));
                    list.add(MainData.MainDataInfo.CEREAL_TYPE);
                }
            }
            db.setTransactionSuccessful();

        } catch
                (Exception e)

        {
            e.printStackTrace();
        } finally

        {

            db.endTransaction();
            db.close();


        }


  return list;

}
}