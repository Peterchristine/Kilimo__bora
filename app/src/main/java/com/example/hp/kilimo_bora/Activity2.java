package com.example.hp.kilimo_bora;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button btnSendSMS;
    EditText txtPhoneNo;
    EditText txtMessage;
    Button ViewCrops;
    EditText subcounty;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);/*
        btnSendSMS = (Button) findViewById(R.id.btnSendSMS);
        txtPhoneNo = (EditText) findViewById(R.id.txtPhoneNo);
        txtMessage = (EditText) findViewById(R.id.txtMessage);*/
        subcounty = (EditText) findViewById(R.id.subcounty);


        ViewCrops = (Button) findViewById(R.id.buttonnext);
       /* btnSendSMS.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String phoneNo = txtPhoneNo.getText().toString();
                String message = txtMessage.getText().toString();
                if (phoneNo.length()>0 && message.length()>0)
                    sendSMS(phoneNo, message);
                else
                    Toast.makeText(getBaseContext(),
                            "Please enter both phone number and message.",

                            Toast.LENGTH_SHORT).show();

            }
        });*/



        ViewCrops.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {



                if(subcounty.getText().toString().toLowerCase().equals("njoro"))


                {
                    Intent myIntent = new Intent(getBaseContext(), Activity3.class);
                    startActivity( myIntent);
                } else  if(subcounty.getText().toString().toLowerCase().equals("")){
                    Toast.makeText(getApplicationContext(), "You did not enter anything.Please enter your subcounty",
                            Toast.LENGTH_SHORT).show();
                    // getString(R.string.Action);


                }
        else{
                    Toast.makeText(getApplicationContext(), "Information to be updated soon. try Njoro",
                            Toast.LENGTH_SHORT).show();
                    // getString(R.string.Action);
                }
            }

            //   Toast.makeText(getApplicationContext(), "view more types of crops",
            //     Toast.LENGTH_SHORT);
            //  Intent myIntent = new Intent(getBaseContext(), Activity3.class);
            //   startActivity(myIntent);
            // }


        });
    }
}

            // }
   /* private void sendSMS(String phoneNumber, String message)
    {
        PendingIntent pi = PendingIntent.getActivity(this, 0,
                new Intent(this, Activity2.class), 0);
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, pi, null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }*/

         //   public void enterSubCounty(String subcounty) {


          //  }
        //}