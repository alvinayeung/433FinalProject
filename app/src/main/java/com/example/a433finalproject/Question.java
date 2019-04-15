package com.example.a433finalproject;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.util.Log;


public class Question extends AppCompatActivity {

    SQLiteDatabase db= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        db=openOrCreateDatabase("MyDatabase", Context.MODE_PRIVATE, null);
        db.execSQL("DROP TABLE IF EXISTS GreenCompass");
        db.execSQL("CREATE TABLE GreenCompass (itemID INT, Item TEXT, Bins TEXT)");

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
        db.execSQL("insert into GreenCompass values(110,'solo cups', 'recycle')");
        db.execSQL("insert into GreenCompass values(111,'newspaper', 'recycle')");
        db.execSQL("insert into GreenCompass values(112,'index cards', 'recycle')");

        db.execSQL("insert into GreenCompass values(200,'lenoir box', 'compost');");
        db.execSQL("insert into GreenCompass values(201,'food', 'compost')");
        db.execSQL("insert into GreenCompass values(202,'green lenoir fork', 'compost')");
        db.execSQL("insert into GreenCompass values(203,'green lenoir spoon', 'compost')");
        db.execSQL("insert into GreenCompass values(204,'green lenoir knife', 'compost')");
        db.execSQL("insert into GreenCompass values(205,'green rams fork', 'compost')");
        db.execSQL("insert into GreenCompass values(206,'green rams spoon', 'compost')");
        db.execSQL("insert into GreenCompass values(207,'green rams knife', 'compost')");

        db.execSQL("insert into GreenCompass values(301,'chip bag', 'trash')");
        db.execSQL("insert into GreenCompass values(302,'plastic', 'trash')");
        db.execSQL("insert into GreenCompass values(303,'paper towels', 'trash')");
        db.execSQL("insert into GreenCompass values(304,'napkins', 'trash')");
        db.execSQL("insert into GreenCompass values(305,'tissues', 'trash')");
        db.execSQL("insert into GreenCompass values(306,'grocery bags', 'trash')");
        db.execSQL("insert into GreenCompass values(307,'straws', 'trash')");
        db.execSQL("insert into GreenCompass values(308,'solo cups', 'trash')");
        db.execSQL("insert into GreenCompass values(309,'plastic spoon', 'trash')");
        db.execSQL("insert into GreenCompass values(310,'plastic fork', 'trash')");
        db.execSQL("insert into GreenCompass values(311,'plastic knife', 'trash')");
        db.execSQL("insert into GreenCompass values(312,'to go coffee cups', 'trash')");

        db.execSQL("insert into GreenCompass values(400,'cardboard', 'trash_cardboard')");
        db.execSQL("insert into GreenCompass values(401,'cardboard box', 'trash_cardboard')");





    }

    public void search(View view) {

        Intent x = new Intent(Question.this, RouteActivity.class);
        startActivity(x);

    }

    public void camera(View view) {


        Log.v("CAMERA_CLICK", "Button got clicked");
        Intent x = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(x, 1);
    }

    
}
