package com.example.hp.kilimo_bora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BeanDiseases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bean_diseases);
        final ArrayList<String> file = new ArrayList<String>();
        file.add("Anthracnose");
        file.add("Black root rot");
        file.add("Southern Blight");

        ListView beanlistView = (ListView) findViewById(R.id.BeansListview);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,file);
        beanlistView .setAdapter(listAdapter);

        beanlistView .setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        (String) arg0.getItemAtPosition(position), Toast.LENGTH_SHORT);

            }


        });
        beanlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                switch (position) {
                    case 0:
                        Intent myIntent = new Intent(getBaseContext(),Anthracnose.class);
                        startActivity(myIntent);
                        break;
                    case 1:
                        Intent Intent = new Intent(getBaseContext(),BlackRootRot.class);
                        startActivity(Intent);
                        break;
                    case 2:
                        Intent Iintent = new Intent(getBaseContext(),SouthernBlight.class);
                        startActivity(Iintent);
                        break;

                }
            }
        });
    }
}




