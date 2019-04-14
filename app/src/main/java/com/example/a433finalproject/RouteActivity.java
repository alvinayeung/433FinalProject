package com.example.a433finalproject;

import android.content.Context;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        SQLiteDatabase binsDatabase = openOrCreateDatabase("MyBinsDatabase", Context.MODE_PRIVATE, null);
        binsDatabase.execSQL("DROP TABLE IF EXISTS Bins");
        binsDatabase.execSQL("CREATE TABLE Bins (binID INT PRIMARY KEY, lat FLOAT, long FLOAT, disposalType TEXT, photoFileName TEXT)");



        binsDatabase.execSQL("INSERT INTO Bins VALUES (1, 35.898001, -79.043404, 'trash_cardboard', 'bin1.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (2, 35.898337, -79.042039, 'mixed_recycling', 'bin2.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (3, 35.898370, -79.042229, 'trash_cardboard', 'bin3.jpg')");



        binsDatabase.execSQL("INSERT INTO Bins VALUES (201, 35.915457, -79.051475, 'trash_trash', 'bin201.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (202, 35.914573, -79.051555, 'trash_cardboard', 'bin202.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (203, 35.914556, -79.051539, 'trash_trash', 'bin203.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (204, 35.914531, -79.051537, 'mixed_recycling', 'bin204.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (205, 35.914759, -79.049023, 'trash_trash', 'bin205.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (206, 35.914751, -79.048999, 'trash_cardboard', 'bin206.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (207, 35.914725, -79.048967, 'mixed_recycling', 'bin207.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (208, 35.913763, -79.04996, 'trash_trash', 'bin208.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (209, 35.913769, -79.04992, 'trash_cardboard', 'bin209.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (210, 35.913769, -79.04992, 'mixed_recycling', 'bin210.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (211, 35.914577, -79.05156, 'trash_cardboard', 'bin211.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (212, 35.914533, -79.051532, 'mixed_recycling', 'bin212.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (213, 35.91368, -79.051527, 'mixed_recycling', 'bin213.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (214, 35.91368, -79.051527, 'trash_trash', 'bin214.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (215, 35.91322, -79.052571, 'mixed_recycling', 'bin215.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (216, 35.91322, -79.052571, 'trash_trash', 'bin216.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (217, 35.912734, -79.053894, 'mixed_recycling', 'bin217.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (218, 35.912704, -79.053871, 'trash_cardboard', 'bin218.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (219, 35.912708, -79.053845, 'trash_trash', 'bin219.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (220, 35.91273, -79.054063, 'trash_trash', 'bin220.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (221, 35.91273, -79.054063, 'mixed_recycling', 'bin221.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (222, 35.912743, -79.05499, 'trash_trash', 'bin222.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (223, 35.912207, -79.05439, 'trash_trash', 'bin223.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (224, 35.912207, -79.05439, 'mixed_recycling', 'bin224.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (225, 35.912304, -79.05388, 'mixed_recycling', 'bin225.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (226, 35.912304, -79.05388, 'trash_trash', 'bin226.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (226, 35.912304, -79.05388, 'trash_trash', 'bin226.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (227, 35.913214, -79.052566, 'mixed_recycling', 'bin227.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (228, 35.913214, -79.052566, 'trash_trash', 'bin228.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (229, 35.91192, -79.054666, 'trash_cardboard', 'bin229.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (230, 35.91192, -79.054666, 'trash_trash', 'bin230.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (231, 35.911544, -79.054655, 'mixed_recycling', 'bin231.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (232, 35.911544, -79.054655, 'trash_trash', 'bin232.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (233, 35.911686, -79.054111, 'trash_trash', 'bin233.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (234, 35.911662, -79.054086, 'trash_cardboard', 'bin234.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (235, 35.911732, -79.053267, 'trash_trash', 'bin235.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (236, 35.911101, -79.053459, 'trash_trash', 'bin236.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (237, 35.911732, -79.053273, 'mixed_recycling', 'bin237.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (238, 35.911732, -79.053273, 'trash_trash', 'bin238.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (239, 35.912245, -79.051867, 'mixed_recycling', 'bin239.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (240, 35.912245, -79.051867, 'trash_trash', 'bin240.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (241, 35.91251, -79.051064, 'mixed_recycling', 'bin241.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (242, 35.91251, -79.051064, 'trash_trash', 'bin242.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (243, 35.9128107, -79.0508554, 'mixed_recycling', 'bin243.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (244, 35.9128919, -79.0508345, 'trash_cardboard', 'bin244.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (245, 35.9128948, -79.0508253, 'trash_trash', 'bin245.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (246, 35.912421, -79.050111, 'mixed_recycling', 'bin236.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (247, 35.912421, -79.050111, 'trash_trash', 'bin247.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (248, 35.913138, -79.0493757, 'trash_trash', 'bin248.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (249, 35.9131342, -79.0493537, 'trash_cardboard', 'bin249.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (250, 35.910204, -79.053812, 'trash_trash', 'bin250.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (251, 35.910212, -79.053756, 'trash_cardboard', 'bin251.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (252, 35.909523, -79.052895, 'mixed_recycling', 'bin252.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (253, 35.909523, -79.052895, 'trash_trash', 'bin253.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (254, 35.909202, -79.053159, 'mixed_recycling', 'bin254.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (255, 35.909202, -79.053159, 'trash_trash', 'bin255.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (256, 35.910631, -79.05258, 'trash_trash', 'bin256.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (257, 35.910641, -79.052594, 'trash_cardboard', 'bin257.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (258, 35.910278, -79.052645, 'mixed_recycling', 'bin258.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (259, 35.910278, -79.052645, 'trash_trash', 'bin259.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (260, 35.909304, -79.051699, 'trash_cardboard', 'bin260.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (261, 35.909355, -79.051695, 'mixed_recycling', 'bin261.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (262, 35.909283, -79.051688, 'trash_trash', 'bin262.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (263, 35.909667, -79.0515835, 'mixed_recycling', 'bin263.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (264, 35.909667, -79.051583, 'trash_trash', 'bin264.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (265, 35.909744, -79.051184, 'mixed_recycling', 'bin265.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (266, 35.909744, -79.051184, 'trash_trash', 'bin266.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (267, 35.909963, -79.051885, 'mixed_recycling', 'bin267.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (268, 35.909963, -79.051885, 'trash_trash', 'bin268.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (269, 35.910361, -79.052083, 'mixed_recycling', 'bin269.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (270, 35.910533, -79.051728, 'mixed_recycling', 'bin270.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (271, 35.910533, -79.051728, 'trash_trash', 'bin271.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (272, 35.910743, -79.052097, 'mixed_recycling', 'bin272.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (273, 35.910735, -79.052076, 'trash_trash', 'bin273.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (274, 35.910713, -79.05206, 'trash_cardboard', 'bin274.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (275, 35.910837, -79.052116, 'mixed_recycling', 'bin275.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (276, 35.910837, -79.052116, 'trash_trash', 'bin276.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (277, 35.911742, -79.051313, 'mixed_recycling', 'bin277.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (278, 35.911742, -79.051313, 'trash_trash', 'bin278.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (279, 35.911251, -79.051257, 'mixed_recycling', 'bin279.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (280, 35.911251, -79.051257, 'trash_trash', 'bin280.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (281, 35.911042, -79.051034, 'mixed_recycling', 'bin281.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (282, 35.911042, -79.051034, 'trash_trash', 'bin282.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (283, 35.909353, -79.051692, 'mixed_recycling', 'bin283.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (284, 35.909285, -79.051681, 'trash_trash', 'bin284.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (285, 35.909308, -79.051699, 'trash_cardboard', 'bin285.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (286, 35.909671, -79.051583, 'mixed_recycling', 'bin286.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (287, 35.909671, -79.051583, 'trash_trash', 'bin287.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (288, 35.90897, -79.050606, 'mixed_recycling', 'bin288.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (289, 35.90897, -79.050606, 'trash_trash', 'bin289.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (290, 35.909741, -79.051187, 'mixed_recycling', 'bin290.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (291, 35.909741, -79.051187, 'trash_trash', 'bin291.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (292, 35.909807, -79.050323, 'mixed_recycling', 'bin292.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (293, 35.909807, -79.050323, 'trash_trash', 'bin293.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (294, 35.910436, -79.0506933, 'mixed_recycling', 'bin294.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (295, 35.910436, -79.050693, 'trash_trash', 'bin295.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (296, 35.911038, -79.051034, 'mixed_recycling', 'bin296.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (297, 35.911038, -79.051034, 'trash_trash', 'bin297.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (298, 35.911259, -79.051257, 'mixed_recycling', 'bin298.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (299, 35.911259, -79.051257, 'trash_trash', 'bin299.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (300, 35.911702, -79.050612, 'mixed_recycling', 'bin300.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (301, 35.911702, -79.050612, 'trash_trash', 'bin301.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (302, 35.911294, -79.050366, 'mixed_recycling', 'bin302.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (303, 35.911294, -79.050366, 'trash_trash', 'bin303.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (304, 35.910743, -79.050078, 'mixed_recycling', 'bin304.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (305, 35.910743, -79.050078, 'trash_trash', 'bin305.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (306, 35.911886, -79.050164, 'trash_cardboard', 'bin306.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (307, 35.911847, -79.05016, 'trash_trash', 'bin307.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (308, 35.911754, -79.049451, 'trash_cardboard', 'bin308.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (309, 35.91175, -79.049426, 'trash_trash', 'bin309.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (310, 35.911643, -79.049498, 'mixed_recycling', 'bin310.jpg')");
        binsDatabase.execSQL("INSERT INTO Bins VALUES (311, 35.911643, -79.049498, 'trash_trash', 'bin31.jpg')");
        

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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);

        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
