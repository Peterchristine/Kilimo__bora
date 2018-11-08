package com.example.hp.kilimo_bora;

import android.content.Intent;
import
android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity  {
  ImageView Cereals;
  ImageView Legumes;
  ImageView Tubers;
  ImageView OtherCrops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

     Cereals = (ImageView) findViewById(R.id.buttoncereals);
        Legumes = (ImageView) findViewById(R.id.buttonlegumes);
        Tubers = (ImageView) findViewById(R.id.buttontubers);
        OtherCrops = (ImageView) findViewById(R.id.buttonothercrops);


        Cereals.setOnClickListener(new View.OnClickListener()  {


            @Override
            public void onClick(View view) {

                Intent myIntent  = new Intent(getBaseContext(),Cerealslist.class);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);


        if(item.getItemId()==R.id.action_settings){
            Toast.makeText(getApplicationContext(),"Settings",Toast.LENGTH_LONG).show();
            return true;
        }else{
            return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.activity3_menu,menu);
       return true;
//        return super.onCreateOptionsMenu(menu);
    }
}
