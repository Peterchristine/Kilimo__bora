package com.example.hp.kilimo_bora;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class IrishPotatoDiseases extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irish_potato_diseases);
        final ArrayList<String> file = new ArrayList<String>();
        file.add("Bacterial Wilt");
        file.add("Bacterial Soft Rot");
        file.add("Late Blight");

        ListView listView = (ListView) findViewById(R.id.listview3);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,file);
        listView.setAdapter(listAdapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                switch (position) {
                    case 0:
                        Intent myIntent = new Intent(getBaseContext(),BacterialWiltFragment.class);
                        startActivity(myIntent);
                        break;
                    case 1:
                        Intent Intent = new Intent(getBaseContext(),BacterialSoftRotFragment.class);
                        startActivity(Intent);
                        break;
                    case 2:
                        Intent Inntent = new Intent(getBaseContext(),LateBlightFragment.class);
                        startActivity(Inntent);
                        break;



                }
            }
        });
    }
}