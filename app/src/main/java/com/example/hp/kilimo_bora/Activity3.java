package com.example.hp.kilimo_bora;

import android.content.Intent;
import
android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity  {
  Button Cereals;
  Button Legumes;
  Button Tubers;
  Button OtherCrops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Cereals = (Button) findViewById(R.id.buttoncereals);
        Legumes = (Button) findViewById(R.id.buttonlegumes);
        Tubers = (Button) findViewById(R.id.buttontubers);
        OtherCrops = (Button) findViewById(R.id.buttonothercrops);


        Cereals.setOnClickListener(new View.OnClickListener()  {


            @Override
            public void onClick(View view) {

                Intent myIntent  = new Intent(getBaseContext(),Activity4.class);
                startActivity(myIntent);
            }
        });


       OtherCrops.setOnClickListener(new View.OnClickListener()  {


            @Override
            public void onClick(View view) {
                Intent myIntent  = new Intent(getBaseContext(),Activity4.class);
                startActivity(myIntent);

            }
        });

        Tubers.setOnClickListener(new View.OnClickListener()  {


            @Override
            public void onClick(View view) {
                Intent myIntent  = new Intent(getBaseContext(),Tuberslist.class);
                startActivity(myIntent);


            }
        });


      Legumes.setOnClickListener(new View.OnClickListener()  {


            @Override
            public void onClick(View view) {
                Intent myIntent  = new Intent(getBaseContext(),legumeslist.class);
                startActivity(myIntent);


            }
        });
    }
}
