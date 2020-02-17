package com.example.trainingvssuite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class DbOpenHelper {

    private static final String DATABASE_NAME = "SUITMANDEMO.db";
    private  static final int DATABASE_VERSION = 1;

    public static SQLiteDatabase mDB;
    DatabaseHelper mDBHelper;
    private Context mCtx;

    private class DatabaseHelper extends SQLiteOpenHelper{

        public DatabaseHelper(Context context){
            super (context,DATABASE_NAME,null,DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DataBaseDemo.CreateDB._CREATE0);
        }//table0 의 구조를 만듦.


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(DataBaseDemo.CreateDB.DeleteDB);
            onCreate(db);//구조 업그레이드
        }

        @Override
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            super.onDowngrade(db, oldVersion, newVersion);
        }
    }

    public DbOpenHelper(Context context){
        this.mCtx = context;
    }

    public  DbOpenHelper open() throws SQLException{
            mDBHelper = new DatabaseHelper(mCtx);
            //테이블 구조 저장됨.
            mDB = mDBHelper.getWritableDatabase();
            // 값 수정, 추가, 삭제 가능한 상태로 만들어줌.
            return this;
    }

    public void create(){
        mDBHelper.onCreate(mDB);
        // open 한 DbOpenHelper에 DB 연결.
    }

    public void close(){
        mDB.close();
        //DB 연결 마침.
    }


    public long insertColumn(String charname, String saying){

        ContentValues values = new ContentValues();

        values.put(DataBaseDemo.CreateDB.CHARNAME, charname);
        values.put(DataBaseDemo.CreateDB.SAYING, saying);

        return mDB.insert(DataBaseDemo.CreateDB._TABLENAME0, null,values);
    }

    public Cursor selectColumns(){
        Cursor cursor= mDB.query(
                DataBaseDemo.CreateDB._TABLENAME0,
                null,
                null,
                null,
                null,
                null,
                null);

        return cursor;
    }

    public Cursor queryCursor(String a){

        String[] projection = {
                BaseColumns._ID,
                DataBaseDemo.CreateDB.CHARNAME, DataBaseDemo.CreateDB.SAYING
        };// 값 가져옴.

        String selection = DataBaseDemo.CreateDB._ID+" = ? ";
        // 조건 절 . CHARNAME 이 ? 와 같은 것으로 조회.
        String[] selectionArgs = {a};

        Cursor cursor = mDB.query(
                DataBaseDemo.CreateDB._TABLENAME0,
                projection, //반환시킬 컬럼들, 값을
                selection, // 조건
                selectionArgs, // selection으로 비교할 값.
                null,
                null,
                null
                );

        return cursor;
    }


}
