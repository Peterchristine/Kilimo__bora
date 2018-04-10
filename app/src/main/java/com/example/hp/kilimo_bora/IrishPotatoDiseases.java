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



    }
}