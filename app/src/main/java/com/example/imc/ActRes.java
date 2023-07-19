package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActRes extends AppCompatActivity {
    Button btn ;
    String advice="res" ;
    String test="test1";
    String test2="test2";

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_res);
        TextView txt = findViewById(R.id.txt1);
        TextView r = findViewById(R.id.r);
        Button btn=  findViewById(R.id.btn);





        String res= getIntent().getStringExtra("res");
        r.setText(res);


        Toast.makeText(this,res, Toast.LENGTH_SHORT).show();

        String name = getIntent().getStringExtra("name");
        txt.setText("Hello" +name+"!");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent2;
                String BMIR = getIntent().getStringExtra("bmi");


                switch (BMIR) {

                    case "severly under weight":

                        myintent2 = new Intent(ActRes.this,A1.class);
                        startActivity(myintent2);


                        break;


                    case "under weight":
                        myintent2 = new Intent(ActRes.this,A2.class);
                        startActivity(myintent2);


                        break;
                    case "normal weight":
                        myintent2 = new Intent(ActRes.this,A3.class);
                        startActivity(myintent2);

                        break;
                    case "overweight":
                        myintent2 = new Intent(ActRes.this,A4.class);
                        startActivity(myintent2);

                        break;
                    case "obese":
                        myintent2 = new Intent(ActRes.this,A5.class);
                        startActivity(myintent2);


                        break;


                    default:advice="nope";
                }











            }

        });

    }



}