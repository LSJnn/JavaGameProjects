package com.example.trainingvssuite;

import android.provider.BaseColumns;

public final class DataBaseDemo {

    private DataBaseDemo(){}
// 외부 접근 못하게 하기 위해.

    public static final class CreateDB implements BaseColumns{

        public static final String CHARNAME = "charname";
        public static final String SAYING = "saying";
        public static final String _TABLENAME0 = "chapter_1";

        public static final String _CREATE0 =
                "CREATE TABLE IF NOT EXISTS " + _TABLENAME0+" ("
                +_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                        // 데이터 구분 자. 다음 행으로 넘어갈 때마다 1씩 증가.
                +CHARNAME +" TEXT, "
                +SAYING + " TEXT ) " ;

        public static final String DeleteDB =
                "DROP TABLE IF EXISTS "+ CreateDB._TABLENAME0;

    }
}
