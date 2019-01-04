package com.example.myapplication;

import android.app.SearchManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvOut = (TextView) findViewById(R.id.editText);
        Button btn = findViewById(R.id.buttonDifficultLevel);

        btn.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        Button button = (Button)findViewById(R.id.buttonDifficultLevel);
        button.setText("Hi People!");
    }
}


