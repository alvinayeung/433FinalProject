package com.example.a433finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Finished extends AppCompatActivity {

    SQLiteDatabase db2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished);

        //put search item in a history database;
        db2=openOrCreateDatabase("MyDatabase", Context.MODE_PRIVATE, null);
        db2.execSQL("CREATE TABLE History (itemID INT, Item TEXT, Bins TEXT)");

        db2.execSQL("INSERT into History (itemId, Item, Bins)", null);
        db2.execSQL("Select itemID, Item, Bins FROM GreenCompass ");
        db2.execSQL("Select * FROM History");
    }

    public void goHome(View view) {
        Intent x = new Intent(this, Question.class);
        startActivity(x);
    }
}
