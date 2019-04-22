package com.example.a433finalproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class FoundLoc extends AppCompatActivity {
    public int routeID;
    int currentItemID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_loc);

        Bundle extras = getIntent().getExtras();

        if(extras.getByteArray("picture") != null) {
            byte[] byteArray = extras.getByteArray("picture");

            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            ImageView image = (ImageView) findViewById(R.id.LoadImageID);

            image.setImageBitmap(bmp);

            TextView part1 = (TextView) findViewById(R.id.part1sent);
            TextView part2 = (TextView) findViewById(R.id.part2sent);
            TextView part3 = (TextView) findViewById(R.id.part3sent);


            String searchString = extras.getString("ETstring");

            part1.setText(searchString);

            String part2String = extras.getString("bin");

            routeID = extras.getInt("routeID");
            currentItemID = extras.getInt("currentItemID");

            Log.v("routeID", Integer.toString(routeID));
            Log.v("FoundLocCurrentItemID", Integer.toString(currentItemID));


            if (part2String.matches("recycle")) {
                part2.setText("recyclable");
            } else if (part2String.matches("compost")) {
                part2.setText("compostable");
            } else if (part2String.matches("trash")) {
                part2.setText("trash");
            } else if (part2String.matches("trash_cardboard")) {
                part2.setText("corrugated cardboard");
            }

            part3.setText(" " + String.valueOf(extras.getInt("minDistance")) + " ft");

        }else{

            TextView part1 = (TextView) findViewById(R.id.part1sent);
            TextView part2 = (TextView) findViewById(R.id.part2sent);
            TextView part3 = (TextView) findViewById(R.id.part3sent);

            ImageView image = (ImageView) findViewById(R.id.LoadImageID);


            String searchString = extras.getString("ETstring");

            part1.setText(searchString);

            routeID = extras.getInt("routeID");
            currentItemID = extras.getInt("currentItemID");
            Log.v("FoundLoccurrentItemID", Integer.toString(currentItemID));


            Log.v("route",Integer.toString(routeID));

            String part2String = extras.getString("bin");

            if (part2String.matches("recycle")) {
                part2.setText("recyclable");
                image.setImageResource(R.drawable.recycle);
            } else if (part2String.matches("compost")) {
                part2.setText("compostable");
                image.setImageResource(R.drawable.compost);
            } else if (part2String.matches("trash")) {
                part2.setText("trash");
                image.setImageResource(R.drawable.trash);
            } else if (part2String.matches("trash_cardboard")) {
                part2.setText("recyclable");
                image.setImageResource(R.drawable.cardboard);
            }

            part3.setText(" " + String.valueOf(extras.getInt("minDistance")) + " ft");


        }
    }

    public void updateNo(View view) {

        Intent a = new Intent(FoundLoc.this, Finished.class);
        a.putExtra("currentItemID",currentItemID);
        startActivity(a);
    }


    public void updateYes(View view) {

        Intent a = new Intent(FoundLoc.this, RouteActivity.class);
        a.putExtra("route", routeID);
        a.putExtra("currentItemID",currentItemID);
        Log.v("route",Integer.toString(routeID));
        startActivity(a);

    }



}
