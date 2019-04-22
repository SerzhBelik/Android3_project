package com.example.belikov.andr3_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText enterText;
    private Toolbar toolbar;
    private FloatingActionButton fab;
    private Snackbar snackbar;
    private Button enterButton;
    private final String EMPTY = "Input your name, please!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initialization();

    }

    private void initialization() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        enterText = (EditText) findViewById(R.id.editText);
        snackbar = Snackbar.make(findViewById(R.id.inputLayout1), EMPTY, Snackbar.LENGTH_LONG);
        enterButton = (Button) findViewById(R.id.button);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClickEnter(View view){

        String inputText = enterText.getText().toString();

        if (inputText.equals("") || inputText == null){
            snackbar.show();
            return;
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
