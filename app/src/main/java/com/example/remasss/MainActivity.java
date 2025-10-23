package com.example.remasss;

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

public class MainActivity extends AppCompatActivity {
private TextView tv_output;
private Button btn_Go;
private EditText et_Input;
    private MenuItem itemSettings;
    private MenuItem itemSignOut;
    private MenuItem itemHistory;
    private static final String TAG = "LifecycleLab";

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
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.itemSettings)
        {
            Toast.makeText(this,"Settings", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this,Settings.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.itemSignOut)
        {
            Toast.makeText(this,"Sign Out" , Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this,SignOut.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.itemHistory)
        {
            Toast.makeText(this, "History", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this,History.class);
            startActivity(i);
        }

        return true;
    }
}



