package com.example.a433finalproject;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class QuestionActivity extends AppCompatActivity {

    SQLiteDatabase db=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hello my name is Aman!");

//        db=openOrCreateDatabase("Databse", Context.MODE_PRIVATE, null);
//        db.execSQL("DROP TABLE IF EXISTS Bins");
//        db.execSQL("CREATE TABLE Bins (Item text, Bins text)");
//
//        db.execSQL("insert into Item values('water bottle', 'Recycle')");
//        db.execSQL("insert into Item values('Paper', 'Recycle')");
//        db.execSQL("insert into Item values('soda can', 'Recycle')");
//
//        db.execSQL("insert into Item values('Lenoir tray', 'Compost')");
//
//        db.execSQL("insert into Item values('Chip bag', 'Trash')");


    }

    public void search(View view) {



    }

    public void camera(View view) {


        Log.v("CAMERA_CLICK", "Button got clicked");
        Intent x = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(x, 1);
    }
}
