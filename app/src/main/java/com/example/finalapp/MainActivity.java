package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView out;
    EditText inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = findViewById(R.id.showText);
        inp = findViewById(R.id.inpText);

        Button btn = findViewById(R.id.btn1);
        //btn.setOnClickListener(this);
/*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("mail","onClick called......");

                String str = inp.getText().toString();

                out.setText("Hello " + str);
            }
        });
*/
    }

    @Override
    public void onClick(View view) {
        Log.i("click","onClick......");

        //TextView tv = findViewById(R.id.showText);

        //EditText inp = findViewById(R.id.inpText);
        String str = inp.getText().toString();

        out.setText("Hello " + str);
    }

    public void btnClick(View btn) {
        Log.i("click","btnClick called......");
    }
}
