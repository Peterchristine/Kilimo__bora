package com.example.hp.kilimo_bora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button Next;
     Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

       Next = (Button) findViewById(R.id.buttonnext);

       Next.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "view more types of crops",
                         Toast.LENGTH_SHORT);
                Intent myIntent  = new Intent(getBaseContext(),Activity3.class);
                startActivity(myIntent);
            }



        });




    }
}
