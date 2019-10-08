package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button calcbutton;
    private EditText heightinput, weightinput;
    private TextView displaybmi, conditionid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcbutton = findViewById(R.id.calcbutton);
        heightinput = findViewById(R.id.heightinput);
        weightinput = findViewById(R.id.weightinput);
        displaybmi = findViewById(R.id.displaybmi);
        conditionid = findViewById(R.id.conditionid);

        calcbutton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                float height = Float.parseFloat(heightinput.getEditableText().toString());
                float height01 = height / 100;
                float weight = Float.parseFloat(weightinput.getEditableText().toString());
                float BMI = weight / (height01 * height01);
                displaybmi.setText("BMI = " + BMI);
                if(BMI< 15) conditionid.setText("Extremely under weight");
                else if (BMI< 16) conditionid.setText("Under weight");
                else if (BMI< 18.5) conditionid.setText("Slighty light");
                else if (BMI< 25) conditionid.setText("Healthy");
                else if (BMI< 30) conditionid.setText("Over Weight");
                else if (BMI< 35) conditionid.setText("Obesity Level I");
                else if (BMI< 40) conditionid.setText("Obesity Level II");
                else conditionid.setText("Obesity Level III");
            }
        });
    }
}
