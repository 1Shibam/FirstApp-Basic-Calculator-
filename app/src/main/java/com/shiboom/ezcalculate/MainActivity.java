package com.shiboom.ezcalculate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText first, second;
    TextView output;
    Button addition, subtraction, multiplication, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        first = findViewById(R.id.firNUm);
        second = findViewById(R.id.secNum);
        output = findViewById(R.id.result);
        addition = findViewById(R.id.addButton);
        subtraction = findViewById(R.id.subButton);
        multiplication = findViewById(R.id.mulButton);
        division = findViewById(R.id.divButton);

        addition.setOnClickListener(
            new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, answer;
                num1 = Integer.parseInt(first.getText().toString());
                num2 = Integer.parseInt(second.getText().toString());
                answer = num1 + num2;
                output.setText(String.valueOf("ANSWER IS " +answer));

            }
        });
            subtraction.setOnClickListener(
            new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, answer;
                num1 = Integer.parseInt(first.getText().toString());
                num2 = Integer.parseInt(second.getText().toString());
                answer = num1 - num2;
                output.setText(String.valueOf("ANSWER IS " +answer));

            }
        });
            multiplication.setOnClickListener(
            new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, answer;
                num1 = Integer.parseInt(first.getText().toString());
                num2 = Integer.parseInt(second.getText().toString());
                answer = num1 * num2;
                output.setText(String.valueOf("ANSWER IS " +answer));

            }
        });
        division.setOnClickListener(
            new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, answer;
                num1 = Integer.parseInt(first.getText().toString());
                num2 = Integer.parseInt(second.getText().toString());
                answer = num1 / num2;
                output.setText(String.valueOf("ANSWER IS " +answer));

            }
        });
    }
}