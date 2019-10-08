package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button button01;
    private EditText editText01, editText02;
    private TextView textView03, textView04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button01 = (Button) findViewById(R.id.calcbutton);
        editText01 = (EditText) findViewById(R.id.heightinput);
        editText02 = (EditText) findViewById(R.id.weightinput);
        textView03 = (TextView) findViewById(R.id.displaybmi);
        textView04 = (TextView) findViewById(R.id.conditionid);

        button01.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                int height = Integer.parseInt(editText01.getEditableText().toString());
                float height01 = (float) height / 100;
                int weight = Integer.parseInt(editText02.getEditableText().toString());
                float BMI = (float) weight / (height01 * height01);
                textView03.setText("BMI = " + BMI);
                if(BMI< 15) textView04.setText("Extremely over light");
                else if (BMI< 16) textView04.setText("Over light");
                else if (BMI< 18.5) textView04.setText("Slighty light");
                else if (BMI< 25) textView04.setText("Healthy");
                else if (BMI< 30) textView04.setText("Over Weight");
                else if (BMI< 35) textView04.setText("Obesity Level I");
                else if (BMI< 40) textView04.setText("Obesity Level II");
                else textView04.setText("Obesity Level III");
            }
        });
    }
}
