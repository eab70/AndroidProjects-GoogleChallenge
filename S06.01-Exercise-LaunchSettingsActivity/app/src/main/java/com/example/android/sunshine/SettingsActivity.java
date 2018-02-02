package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ActionBar actionBar = this.getSupportActionBar();
        // (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        // Set the action bar back button to look like an up button
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //This code is to override the home button so that it acts like the back button
        //and so when in the Settings from the DetailActivity UI the user goes back to that
        //UI and not the UI of the MainActivity. This is different to the Visualizer exercise
        //doe because didn't have to worry about getting to the Settings from both a child activity
        // and the main activity
        if (id == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}