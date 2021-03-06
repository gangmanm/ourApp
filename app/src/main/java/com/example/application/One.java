package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class One extends AppCompatActivity {

    public static final int REQUEST_CODE_ADD_NOTE =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        ImageView imageAddNoteMain = findViewById(R.id.imageAddNoteMain);

       imageAddNoteMain.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivityForResult(new Intent(getApplicationContext(),CreateNoteActivity.class),
                       REQUEST_CODE_ADD_NOTE);
           }
       });
    }
}