package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText hopp;
    private EditText hidden;
    private TextView p;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hopp=findViewById(R.id.HoppesId);
        hidden=findViewById(R.id.hiddenEditText);
        p=findViewById(R.id.TextVe);
        p.setMovementMethod(new ScrollingMovementMethod());


    }

    public void AddButtom(View view) {
        String st=hopp.getText().toString();
        hidden.setVisibility(view.VISIBLE);
        hidden.setText(st);


        Toast.makeText(this, st, Toast.LENGTH_SHORT).show();


    }
}