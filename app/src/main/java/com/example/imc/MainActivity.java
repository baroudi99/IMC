.package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText weight ,height;
    TextView result;
    String calculation, BMIresult;
    Button calculate_button ;
    String msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        result = findViewById(R.id.result);
        EditText edit1=findViewById(R.id.edit1);
        RadioButton femme=findViewById(R.id.femme);
        RadioButton homme=findViewById(R.id.homme);

        calculate_button = (Button) findViewById(R.id.Resbtn);
        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this,ActRes.class);
                String s1 = weight.getText().toString();
                String s2 = height.getText().toString();
                float weightValue = Float.parseFloat(s1);
                float heightValue = Float.parseFloat(s2);
                float bmi=weightValue /(heightValue* heightValue) ;
                if (bmi < 16) {
                    BMIresult="severly under weight";

                }
                else if (bmi<18.5)
                {
                    BMIresult="under weight";

                }
                else if (bmi>=18.5 && bmi<=24.9)
                {
                    BMIresult="normal weight";

                }
                else if (bmi>=25 && bmi<=29.9)
                {
                    BMIresult="overweight";

                }
                else
                {
                    BMIresult="obese";

                }
                calculation="Result:    "+bmi+""+BMIresult;
                result.setText(calculation);
                String s=edit1.getText().toString();

                if (femme.isChecked())
                    s= "Mlle"+" "+ s;

                else if (homme.isChecked())
                    s="Mr"+" "+s;



                myintent.putExtra("res", String.valueOf(calculation));
                myintent.putExtra("name",s);
                myintent.putExtra("bmi",String.valueOf(BMIresult));


                startActivity(myintent);
            }


            });
        };


    }

