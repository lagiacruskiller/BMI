package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button01;
    private EditText editText01, editText02;
    private TextView textView03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button01 = (Button) findViewById(R.id.button);
        editText01 = (EditText) findViewById(R.id.editText);
        editText02 = (EditText) findViewById(R.id.editText2);
        textView03 = (TextView) findViewById(R.id.textView3);

        button01.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                int height = Integer.parseInt(editText01.getEditableText().toString());
                float height01 = (float) height / 100;
                int weight = Integer.parseInt(editText02.getEditableText().toString());
                float BMI = (float) weight / (height01 * height01);
                textView03.setText("BMI = " + BMI);
            }
        });
    }
}
