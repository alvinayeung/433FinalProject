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

     //   Bundle bundle= getIntent().getExtras();

        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("picture");

                Log.v("HELP", " " + (byteArray == null));

        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ImageView image = (ImageView) findViewById(R.id.LoadImageID);

        image.setImageBitmap(bmp);


        String searchString= extras.getString("ETstring");

        part1.setText(searchString);

        String part2String = extras.getString("bin");
        Log.v("MYTAG", " " + part2String);

        if(part2String.matches("recycle")){
            part2.setText("recyclable");
        }else if (part2String.matches("compost")){
            part2.setText("compostable");
        }else if(part2String.matches("trash")){
            part2.setText("trash");
        }else if(part2String.matches("trash_cardboard")){
            part2.setText("trash");
        }

        part3.setText(" " + String.valueOf(extras.getDouble("minDistance")) + " ");

//
//        byte[] image = bundle.getByteArray("byteArray");
//
//        Log.v("HELP", " " + (image == null));
//
//        Bitmap bmp = BitmapFactory.decodeByteArray(image, 0, image.length);
//        ImageView im= (ImageView) findViewById(R.id.LoadImageID);
//
//        im.setImageBitmap(bmp);

    }

    public void updateNo(View view) {
        Intent x =  new Intent(FoundLoc.this, Finished.class);
        startActivity(x);

    }


    public void updateYes(View view) {

        Intent a = new Intent(FoundLoc.this, RouteActivity.class);
        startActivity(a);

//        onMapReady(mMap);


    }



}
