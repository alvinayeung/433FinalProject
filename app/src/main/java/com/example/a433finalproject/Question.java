package com.example.a433finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.util.Log;


public class Question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


    }

    public void search(View view) {

        Intent x = new Intent(Question.this, RouteActivity.class);
        startActivity(x);



    }

    public void camera(View view) {


        Log.v("CAMERA_CLICK", "Button got clicked");
        Intent x = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(x, 1);
    }
}
