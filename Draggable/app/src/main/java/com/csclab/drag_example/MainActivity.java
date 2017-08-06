package com.csclab.drag_example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button send;
    private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = (Button) findViewById(R.id.btnSend);
        edt = (EditText) findViewById(R.id.nameEditText);

        send.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                sendName();
            }
        });

    }

    public void sendName(){

        Intent intent = new Intent(); //new Intent
        intent.setClass(MainActivity.this, Activity2.class);

        Bundle bundle = new Bundle();
        bundle.putString("nameOfUser",edt.getText().toString()); //send name of user
        System.out.println(edt.getText().toString());

        intent.putExtras(bundle); //pass bundle to intent
        startActivity(intent);



    }



}
