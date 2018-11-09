package com.example.hp.kilimo_bora;

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

public class WheatDiseases extends AppCompatActivity {
    private ActionBar tool_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheat_diseases);
        final ArrayList<String> disease = new ArrayList<String>();
        disease.add("Stem Rust");
        disease.add("Leaf Rust");
        disease.add("Yellow Rust");

        ListView wheatlistView = (ListView) findViewById(R.id.wheatlistview);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, disease);
        wheatlistView.setAdapter(listAdapter);

        tool_bar=getSupportActionBar();
        if(tool_bar!=null){
            tool_bar.setDisplayHomeAsUpEnabled(true);
            tool_bar.setDisplayShowHomeEnabled(true);
        }
        wheatlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        (String) arg0.getItemAtPosition(position), Toast.LENGTH_SHORT);

            }


        });
        wheatlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                switch (position) {
                    case 0:
                        Intent myIntent = new Intent(getBaseContext(),StemRustFragment.class);
                        startActivity(myIntent);
                        break;
                    case 1:
                        Intent intent = new Intent(getBaseContext(),LeafRustFragment.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent theIntent = new Intent(getBaseContext(),YellowRustFragment.class);
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
