package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        EditText email =(EditText) findViewById(R.id.email);
        EditText pass =(EditText) findViewById(R.id.pass);
        ImageButton next = (ImageButton)findViewById(R.id.next);
        ImageButton create = (ImageButton)findViewById(R.id.create);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.length()==0||pass.length()==0){
                    Toast.makeText(MainActivity2.this,"Одно из полей не заполнено",Toast.LENGTH_SHORT).show();
                }else {
                    Intent i = new Intent(MainActivity2.this,MainActivity4.class);
                    startActivity(i);
                }
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });


    }
}