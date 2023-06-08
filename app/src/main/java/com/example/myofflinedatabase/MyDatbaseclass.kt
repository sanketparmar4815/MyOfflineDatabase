package com.example.myofflinedatabase

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDatbaseclass(
    var mainActivity: MainActivity,


    ) : SQLiteOpenHelper(mainActivity, "hgd.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {

        var crertaetae =
            "Create Table Userdata (ID integer primary key autoincrement,NAME text , EMAIL text , PASSWORD text)"
        db!!.execSQL(crertaetae)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun InsertData(name: String, email: String, password: String) {


        var isnertdata = "insert into Userdata  (NAME,EMAIL,PASSWORD)   values('$name','$email','$password')"
        writableDatabase.execSQL(isnertdata)

    }
}

