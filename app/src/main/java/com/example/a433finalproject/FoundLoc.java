package com.example.a433finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class FoundLoc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_loc);
    }

    public void updateNo(View view) {


    }


    public void updateYes(View view) {

        Intent a = new Intent(FoundLoc.this, RouteActivity.class);
        startActivity(a);


    }


}
