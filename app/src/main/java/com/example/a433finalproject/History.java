package com.example.a433finalproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;



public class History extends AppCompatActivity {

      SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getDatabase();


        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);





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
