package com.example.hp.kilimo_bora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Cerealslist extends AppCompatActivity {
    private ActionBar tool_bar;

   /* private Spinner spinner1, spinner2;
    private Button btnSubmit;

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerealslist);

        Databasehelper dbhelper = new Databasehelper(this);
           dbhelper.insertData("Maize");
        dbhelper.insertData("Wheat");


        ArrayList<String>listPro = dbhelper.getAllCereals();

      spinner = (Spinner) findViewById(R.id.spinner);
      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_layout, R.id.txt,listPro);
              spinner.setAdapter(adapter);
    }*/


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerealslist);
        tool_bar=getSupportActionBar();
        if(tool_bar!=null){
            tool_bar.setDisplayHomeAsUpEnabled(true);
            tool_bar.setDisplayShowHomeEnabled(true);
        }
        final ArrayList<String> fileNames = new ArrayList<String>();
        fileNames.add("Maize");
        fileNames.add("Wheat");
        fileNames.add("Barley");
        fileNames.add("Sorghum");


        ListView listView = (ListView) findViewById(R.id.cerealslistview);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fileNames);
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
                        Intent myIntent = new Intent(getBaseContext(), MaizeDiseases.class);
                        startActivity(myIntent);
                        break;
                    case 1:
                        Intent myintent = new Intent(getBaseContext(), WheatDiseases.class);
                        startActivity(myintent);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity3_menu,menu);
        return true;
//        return super.onCreateOptionsMenu(menu);
    }
}


      /*  addItemsOnSpinner2();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }

    // add items into spinner dynamically
    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("Maize diseases");
        list.add(" Wheat diseases");
        list.add(" barley diseases");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Cerealslist.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) +
                                "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }

        });*/

