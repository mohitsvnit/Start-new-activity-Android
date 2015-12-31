package com.example.mohit.new_activity_using_button;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends Activity implements View.OnClickListener{

    Button c;
    Bundle extra;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        et2 = (EditText) findViewById(R.id.editText2);

        extra = getIntent().getExtras();

        String data2 = extra.getString("data");
        c = (Button) findViewById(R.id.button2);
        et2.setText(data2);

    }

    @Override
    public void onClick(View v) {
        if(v == c) {
            Intent intent = new Intent(this,MainActivity.class);
            Activity2.this.startActivity(intent);
        }
    }
}
