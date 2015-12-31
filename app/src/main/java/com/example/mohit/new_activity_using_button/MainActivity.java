package com.example.mohit.new_activity_using_button;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Manifest;

public class MainActivity extends Activity implements View.OnClickListener {

    Button b;
    EditText et;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button);
        et = (EditText) findViewById(R.id.editText);
    }


    @Override
    public void onClick(View v) {
        if (v == b) {
            data = et.getText().toString();
           // String m = et.getText().toString();
            Intent intent = new Intent(this, Activity2.class);
            intent.putExtra("data",data);
            startActivity(intent);

        }
    }
}


