package com.bignerdranch.android.tpmsamplequiz;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class Final extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_screen);

        TextView finalScoreTextView = (TextView) findViewById(R.id.user_score);
        Button finalQuitButton = (Button) findViewById(R.id.final_quit);

        // Begin Listener for Quit Button
        finalQuitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        // End Listener for Quit Button

        // Start Logic for displaying score
        finalScoreTextView.setText("Your Postal Score was: " + getIntent().getExtras().getInt("user_final_score"));

        // End Logic for displaying score
    }

}
