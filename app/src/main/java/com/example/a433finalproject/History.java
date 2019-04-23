package com.example.a433finalproject;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.LinearLayout;

public class History extends AppCompatActivity {


    LinearLayout linearLayout;
    SQLiteDatabase historyDB;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        getDatabase();


        Bundle extras = getIntent().getExtras();

        int myItemID = extras.getInt("itemID");


        historyDB=openOrCreateDatabase("MyDatabase", Context.MODE_PRIVATE, null);


     //   historyDB.execSQL("DROP TABLE IF EXISTS History");
     //   historyDB.execSQL("CREATE TABLE History (itemID INT, Item TEXT, Bins TEXT)");

        Cursor c = db.rawQuery("SELECT * FROM GreenCompass WHERE itemID = " + myItemID, null);
        c.moveToFirst();

        Log.v("currentItemIdCursor", c.getString(0));

        historyDB.execSQL("INSERT INTO History values(" + myItemID + "," + "'" + c.getString(1) + "'" + "," + "'" + c.getString(2)+ "'" + ");");
        Log.v("history", c.getString(2));

        Cursor hC= db.rawQuery("Select * from History", null);
        hC.moveToFirst();

        linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);


        if(c.getCount() > 0) {

            for( int i = 0; i < hC.getCount(); i++)

            {
                TextView textView = new TextView(this);
                textView.setText(c.getString(1));
                linearLayout.addView(textView);
            }


        }


    }

    public void goHome(View view) {
        Intent x = new Intent(this, Question.class);
        startActivity(x);
    }

    public void getDatabase(){

        db=openOrCreateDatabase("MyDatabase", Context.MODE_PRIVATE, null);
        db.execSQL("DROP TABLE IF EXISTS GreenCompass");
        db.execSQL("CREATE TABLE GreenCompass (itemID INT, Item TEXT, Bins TEXT)");

        //recycle
        db.execSQL("insert into GreenCompass values(100,'water bottle', 'recycle');");
        db.execSQL("insert into GreenCompass values(101,'paper', 'recycle');");
        db.execSQL("insert into GreenCompass values(102,'soda can', 'recycle');");
        db.execSQL("insert into GreenCompass values(103,'glass', 'recycle');");
        db.execSQL("insert into GreenCompass values(104,'newspaper', 'recycle')");
        db.execSQL("insert into GreenCompass values(105,'paper towels', 'recycle')");
        db.execSQL("insert into GreenCompass values(106,'napkins', 'recycle')");
        db.execSQL("insert into GreenCompass values(107,'tissues', 'recycle')");
        db.execSQL("insert into GreenCompass values(108,'grocery bags', 'recycle')");
        db.execSQL("insert into GreenCompass values(109,'straws', 'recycle')");
        db.execSQL("insert into GreenCompass values(110,'solo cup', 'recycle')");
        db.execSQL("insert into GreenCompass values(111,'newspaper', 'recycle')");
        db.execSQL("insert into GreenCompass values(112,'index cards', 'recycle')");
        //compost
        db.execSQL("insert into GreenCompass values(200,'lenoir box', 'compost');");
        db.execSQL("insert into GreenCompass values(201,'food', 'compost')");
        db.execSQL("insert into GreenCompass values(202,'green lenoir fork', 'compost')");
        db.execSQL("insert into GreenCompass values(203,'green lenoir spoon', 'compost')");
        db.execSQL("insert into GreenCompass values(204,'green lenoir knife', 'compost')");
        db.execSQL("insert into GreenCompass values(205,'green rams fork', 'compost')");
        db.execSQL("insert into GreenCompass values(206,'green rams spoon', 'compost')");
        db.execSQL("insert into GreenCompass values(207,'green rams knife', 'compost')");
        //trash
        db.execSQL("insert into GreenCompass values(301,'chip bag', 'trash')");
        db.execSQL("insert into GreenCompass values(302,'plastic', 'trash')");
        db.execSQL("insert into GreenCompass values(303,'paper towels', 'trash')");
        db.execSQL("insert into GreenCompass values(304,'napkins', 'trash')");
        db.execSQL("insert into GreenCompass values(305,'tissues', 'trash')");
        db.execSQL("insert into GreenCompass values(306,'grocery bags', 'trash')");
        db.execSQL("insert into GreenCompass values(307,'straws', 'trash')");
        db.execSQL("insert into GreenCompass values(308,'plastic spoon', 'trash')");
        db.execSQL("insert into GreenCompass values(319,'plastic fork', 'trash')");
        db.execSQL("insert into GreenCompass values(310,'plastic knife', 'trash')");
        db.execSQL("insert into GreenCompass values(311,'to go coffee cups', 'trash')");
        //cardboard
        db.execSQL("insert into GreenCompass values(400,'cardboard', 'trash_cardboard')");
        db.execSQL("insert into GreenCompass values(401,'cardboard box', 'trash_cardboard')");
        db.execSQL("insert into GreenCompass values(401,'cereal box', 'trash_cardboard')");



    }

}
