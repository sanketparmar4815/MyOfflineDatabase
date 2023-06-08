package com.example.myofflinedatabase

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class MyDatbaseclass(
    var mainActivity: Context,


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

    fun LoginData(uname: String, pass: String)   : Cursor {

     var login = "select * from Userdata where EMAIL = '$uname' and  PASSWORD = '$pass'"

      var cursor:Cursor =   readableDatabase.rawQuery(login,null)



return cursor;
    }
}

