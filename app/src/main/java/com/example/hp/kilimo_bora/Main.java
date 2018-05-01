package com.example.hp.kilimo_bora;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main extends AppCompatActivity
{
    Button Explore;


   @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Explore = (Button) findViewById(R.id.buttonexplore);
        Explore.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "learn more about diseases and pests"
          , Toast.LENGTH_SHORT);
                Intent intent  = new Intent(getBaseContext(),Activity2.class);
                startActivity(intent);
            }

        });


    }

}