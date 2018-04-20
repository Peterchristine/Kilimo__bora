package com.example.hp.kilimo_bora;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.ListViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class legumeslist extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legumeslist);

        final ArrayList<String> fileNames = new ArrayList<String>();
        fileNames.add("Beans");
        fileNames.add("Peas");
        fileNames.add("Clovers");
        fileNames.add("Lentils");



        ListView listView = (ListView) findViewById(R.id.listview1);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fileNames );
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        (String) arg0.getItemAtPosition(position), Toast.LENGTH_SHORT);

            }


        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                switch (position) {
                    case 0:
                        Intent myIntent = new Intent(getBaseContext(),BeanDiseases.class);
                        startActivity(myIntent);
                        break;

                }
            }
            });
    }
}