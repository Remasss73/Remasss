package com.example.remasss;

import static androidx.core.content.ContextCompat.startActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
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

public class SecondActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView Multiply;
    private Button Mul;
    private TextView Result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Multiply = findViewById(R.id.Multiply);
        Mul = findViewById(R.id.Mul);
        Result = findViewById(R.id.Result);
        };

    public void onClickMul(View v)
    {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        Result.setText(s1);
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int res = n1 * n2;;
        Result.setText(String.valueOf(res));
        }
    public void onClickAdd(View v)
    {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int res = n1+ n2;
        Result.setText(String.valueOf(res));
    }
}
