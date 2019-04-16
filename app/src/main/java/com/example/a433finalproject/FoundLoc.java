package com.example.a433finalproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class FoundLoc extends AppCompatActivity {
    GoogleMap mMap;
    SQLiteDatabase binsDatabase;
    Cursor c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_loc);

        TextView part1 = (TextView) findViewById(R.id.part1sent);
        TextView part2 = (TextView) findViewById(R.id.part2sent);
        TextView part3 = (TextView) findViewById(R.id.part3sent);

        Bundle bundle= getIntent().getExtras();
        String searchString= bundle.getString("ETstring");

        part1.setText("Your " + searchString);

        String part2String = bundle.getString("bin");

        if(part2String.matches("recycle")){
            part2.setText("is recyclable");
        }else if (part2String.matches("compost")){
            part2.setText("is compostable");
        }else if(part2String.matches("trash")){
            part2.setText("is trash");
        }

        part3.setText(String.valueOf(bundle.getDouble("minDistance")));

    }

    public void updateNo(View view) {


    }


    public void updateYes(View view) {

        Intent a = new Intent(FoundLoc.this, RouteActivity.class);
        startActivity(a);

//        onMapReady(mMap);


    }



}
