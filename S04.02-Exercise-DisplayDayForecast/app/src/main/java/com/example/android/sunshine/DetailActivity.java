package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Display the weather forecast that was passed from MainActivity
        mDisplayText = (TextView) findViewById(R.id.tv_display_weather);

        // Use the getIntent method to store the Intent that started this Activity in a variable
        Intent intentThatStartedThisActivity = getIntent();

        // Create an if statement to check if this Intent has the extra we passed from MainActivity
        //Me - Since not all activities will include extra data, need to check or else app will crach
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            // If the Intent contains the correct extra, retrieve the text
            String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
            // If the Intent contains the correct extra, use it to set the TextView text
            mDisplayText.setText(textEntered);

        }
    }
}