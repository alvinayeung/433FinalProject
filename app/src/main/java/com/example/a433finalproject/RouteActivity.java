package com.example.a433finalproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RouteActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Cursor c;
    private SQLiteDatabase binsDatabase = openOrCreateDatabase("MyBinsDatabase", Context.MODE_PRIVATE, null);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        binsDatabase.execSQL("DROP TABLE IF EXISTS Bins");

        binsDatabase.execSQL("CREATE TABLE Bins (binID INT PRIMARY KEY, lat FLOAT, long FLOAT, disposalType TEXT, photoFileName TEXT)");



        binsDatabase.execSQL("INSERT INTO Bins VALUES (1, 35.898001, -79.043404, 'trash_cardboard', 'bin1.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (2, 35.898337, -79.042039, 'mixed_recycling', 'bin2.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (3, 35.898370, -79.042229, 'trash_cardboard', 'bin3.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (4, 35.900447, -79.043163, 'mixed_recycling', 'bin4.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (5, 35.900447, -79.043163, 'mixed_recycling', 'bin5.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (6, 35.900998, -79.045424, 'mixed_recycling', 'bin6.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (7, 35.900350, -79.046252, 'mixed_recycling', 'bin7.jpg')");







    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        c = binsDatabase.rawQuery("SELECT lat, long FROM Bins", null);

        c.moveToFirst();


        for(int i = 0; i < c.getCount(); i++){

            LatLng coordinates = new LatLng(c.getFloat(2), c.getFloat(3));
            mMap.addMarker(new MarkerOptions().position(coordinates).title(c.getString(4)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(coordinates));

        }










    }
}
