package com.example.fengjw.uitest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
            actionBar.hide();
        button1 = (Button)findViewById(R.id.activity_main_button1);
        button1.setOnClickListener(this);
        button2 = (Button)findViewById(R.id.activity_main_button2);
        button2.setOnClickListener(this);
        button3 = (Button)findViewById(R.id.activity_main_button3);
        button3.setOnClickListener(this);
        button4 = (Button)findViewById(R.id.activity_main_button4);
        button4.setOnClickListener(this);
        button5 = (Button)findViewById(R.id.activity_main_button5);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.activity_main_button1:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is a Dialog.");
                dialog.setMessage("Something important.");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this,PercentFrameLayoutActivity.class);
                        startActivity(intent);
                    }
                });
                dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                dialog.show();
                break;
            case R.id.activity_main_button2:
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog.");
                progressDialog.setMessage("Something Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            case R.id.activity_main_button3:
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
                break;
            case R.id.activity_main_button4:
                Intent intent1 = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(intent1);
                break;
            case R.id.activity_main_button5:
                Intent intent2 = new Intent(MainActivity.this,TalkDemoActivity.class);
                startActivity(intent2);
                break;
                default:
                    break;
        }
    }
}
