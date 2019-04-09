package com.example.a433finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FoundLocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void updateNo(View view) {


    }

    public void updateYes(View view) {
        Intent x = new Intent(this, DirectionActivity.class);
        startActivity(x);
    }
}
