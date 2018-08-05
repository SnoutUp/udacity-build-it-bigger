package com.udacity.garuolis.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public static String KEY_JOKE = "key-joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tvJoke = (TextView) findViewById(R.id.tv_joke_text);
        Intent intent = getIntent();
        String jokeString = intent.getStringExtra(KEY_JOKE);
        if (jokeString != null) {
            tvJoke.setText(jokeString);
        } else {
            tvJoke.setText(R.string.info_no_joke_available);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
