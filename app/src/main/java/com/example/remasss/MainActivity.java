package com.example.remasss;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
private TextView tv_output;
private Button btn_Go;
private EditText et_Input;
    private MenuItem itemSettings;
    private MenuItem itemSignOut;
    private MenuItem itemHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_output = findViewById(R.id.tvOutput);
        et_Input = findViewById(R.id.etInput);
        btn_Go = findViewById(R.id.btnGo);
    }
    public void onClickGo(View v)
    {
        String st = et_Input.getText().toString();
        tv_output.setText(st);
    }
    public void onClickNext(View v)
    {
        Intent i=new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.remasmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.itemHistory)
        {
        }
        if (item.getItemId() == R.id.itemSignOut)
        {
        }
        return true;
    }
}
