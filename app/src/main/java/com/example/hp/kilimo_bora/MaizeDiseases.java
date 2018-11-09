package com.example.hp.kilimo_bora;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MaizeDiseases extends AppCompatActivity {
    private ActionBar tool_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maize_diseases);
        final ArrayList<String> file = new ArrayList<String>();
        file.add("Lethal Necrosis");
        file.add("Leaf Mosaic");
        file.add("Smurt");



        tool_bar=getSupportActionBar();
        if(tool_bar!=null){
            tool_bar.setDisplayHomeAsUpEnabled(true);
            tool_bar.setDisplayShowHomeEnabled(true);
        }
        ListView maizelistView = (ListView) findViewById(R.id.MaizeListview);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,file);
        maizelistView.setAdapter(listAdapter);

        maizelistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        (String) arg0.getItemAtPosition(position), Toast.LENGTH_SHORT);

            }


        });
        maizelistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                switch (position) {
                    case 0:
                        Intent myIntent = new Intent(getBaseContext(),LethalNecrosis.class);
                        startActivity(myIntent);
                        break;
                    case 1:
                        Intent intent = new Intent(getBaseContext(),LeafMosaicFragment.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent theIntent = new Intent(getBaseContext(),SmurtFragment.class);
                        startActivity(theIntent);
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




