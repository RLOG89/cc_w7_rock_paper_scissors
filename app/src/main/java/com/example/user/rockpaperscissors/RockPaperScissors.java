package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 09/11/2016.
 */

public class RockPaperScissors extends AppCompatActivity {

    Button mRockButton;
    Button mPaperButton;
    Button mScissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Game game = new Game();
        setContentView(R.layout.activity_main);
        mRockButton = (Button) findViewById(R.id.rock_button);
        mPaperButton = (Button) findViewById(R.id.paper_button);
        mScissorsButton = (Button) findViewById(R.id.scissors_button);

        mRockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RockPaperScissors", "Rock clicked");
                Intent intent = new Intent(RockPaperScissors.this, ResultActivity.class);
                String result = game.playGame("Rock");
                intent.putExtra("result", result);
                startActivity(intent);
            }

        });

        mPaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RockPaperScissors", "Paper clicked");
                Intent intent = new Intent(RockPaperScissors.this, ResultActivity.class);
                String result = game.playGame("Paper");
                intent.putExtra("result", result);
                startActivity(intent);
            }

        });

        mScissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RockPaperScissors", "Scissors clicked");
                Intent intent = new Intent(RockPaperScissors.this, ResultActivity.class);
                String result = game.playGame("Scissors");
                intent.putExtra("result", result);
                startActivity(intent);
            }

        });

    }
}
