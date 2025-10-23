package com.example.remasss;

import static androidx.core.content.ContextCompat.startActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    private MenuItem itemSettings;
    private MenuItem itemSignOut;
    private MenuItem itemHistory;
    private Button btnModolo;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Multiply = findViewById(R.id.Multiply);
        Mul = findViewById(R.id.Mul);
        Result = findViewById(R.id.Result);
        btnModolo=findViewById(R.id.btnModolo);
        btnModolo .setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int res = n1 % n2;
                Result.setText(String.valueOf(res));
            }
        });
    }


    public void onClickMul(View v)
    {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        Result.setText(s1);
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int res = n1 * n2;
        Result.setText(String.valueOf(res));
    }

    public void onClickAdd(View v) {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int res = n1 + n2;
        Result.setText(String.valueOf(res));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.remasmenu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.itemSettings)
        {
            Toast.makeText(this,"Settings", Toast.LENGTH_SHORT).show();
             Intent i = new Intent(SecondActivity.this,Settings.class);
             startActivity(i);
        }
        if (item.getItemId() == R.id.itemSignOut)
        {
            Toast.makeText(this,"Sign Out" , Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SecondActivity.this,SignOut.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.itemHistory)
        {
            Toast.makeText(this, "History", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SecondActivity.this,History.class);
            startActivity(i);
        }

        return true;
    }
}