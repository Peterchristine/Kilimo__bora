package com.example.hp.kilimo_bora;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Tuberslist extends AppCompatActivity {

    private ActionBar tool_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuberslist);

        final ArrayList<String> mylist= new ArrayList<String>();

        mylist.add("Irish Potatoes");
        mylist.add("Carrots");
        mylist.add("Sweet Potatoes");



        tool_bar=getSupportActionBar();
        if(tool_bar!=null){
            tool_bar.setDisplayHomeAsUpEnabled(true);
            tool_bar.setDisplayShowHomeEnabled(true);
        }

        ListView list = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mylist);
        list.setAdapter(listAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        (String) arg0.getItemAtPosition(position), Toast.LENGTH_SHORT);

            }


        });
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                switch (position) {
                    case 0:
                        Intent myIntent = new Intent(getBaseContext(),IrishPotatoDiseases.class);
                        startActivity(myIntent);
                        break;

                }
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;
            default:

                return super.onOptionsItemSelected(item);
        }
    }

}