package com.example.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultat;
    private EditText number1, number2;
    private Button addAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultat = findViewById(R.id.textView2);
        number1 = findViewById(R.id.Number1);
        number2 = findViewById(R.id.Number2);
        addAnswer = findViewById(R.id.button2);

        addAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                float res = num1 + num2;
                resultat.setText(String.valueOf(res));

            }
        });

    }




}