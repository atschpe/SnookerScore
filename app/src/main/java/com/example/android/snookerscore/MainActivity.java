package com.example.android.snookerscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerI = 0;
    int scorePlayerII = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Pots: Awarded when the correct ball is potted, according to game rules.
     **/

    // Increase the score by 1 point (red ball)
    // for Player I
    public void red_i(View v) {
        scorePlayerI = scorePlayerI + 1;
        displayForPlayerI(scorePlayerI);
    }

    // for Player II// for Player II
    public void red_ii(View v) {
        scorePlayerII = scorePlayerII + 1;
        displayForPlayerII(scorePlayerII);
    }

    // Increase the score for Player II by 2 points (yellow ball)
    // for Player I
    public void yellow_i(View v) {
        scorePlayerI = scorePlayerI + 2;
        displayForPlayerI(scorePlayerI);
    }

    // for Player II
    public void yellow_ii(View v) {
        scorePlayerII = scorePlayerII + 2;
        displayForPlayerII(scorePlayerII);
    }

    // Increase the score by 3 points (green ball)
    //for Player I
    public void green_i(View v) {
        scorePlayerI = scorePlayerI + 3;
        displayForPlayerI(scorePlayerI);
    }

    // for Player II
    public void green_ii(View v) {
        scorePlayerII = scorePlayerII + 3;
        displayForPlayerII(scorePlayerII);
    }

    // Increase the score by 4 points (brown ball)
    // for Player I
    public void brown_i(View v) {
        scorePlayerI = scorePlayerI + 4;
        displayForPlayerI(scorePlayerI);
    }

    // for Player II
    public void brown_ii(View v) {
        scorePlayerII = scorePlayerII + 4;
        displayForPlayerII(scorePlayerII);
    }

    // Increase the score by 5 points (blue ball)
    // for Player I
    public void blue_i(View v) {
        scorePlayerI = scorePlayerI + 5;
        displayForPlayerI(scorePlayerI);
    }

    // for Player II
    public void blue_ii(View v) {
        scorePlayerII = scorePlayerII + 5;
        displayForPlayerII(scorePlayerII);
    }

    // Increase the score by 6 points (pink ball)
    // for Player I
    public void pink_i(View v) {
        scorePlayerI = scorePlayerI + 6;
        displayForPlayerI(scorePlayerI);
    }

    // for Player II
    public void pink_ii(View v) {
        scorePlayerII = scorePlayerII + 6;
        displayForPlayerII(scorePlayerII);
    }

    // Increase the score by 7 points (black ball)
    // for Player I
    public void black_i(View v) {
        scorePlayerI = scorePlayerI + 7;
        displayForPlayerI(scorePlayerI);
    }

    //for Player II
    public void black_ii(View v) {
        scorePlayerII = scorePlayerII + 7;
        displayForPlayerII(scorePlayerII);
    }

    /**
     * Fouls: awarded when correct ball is missed, or another is touched or potted.
     * This includes potting the cue ball.
     */

    // Foul on {cue, red, yellow, brown or green}.
    //Player I fouls. 4 points awarded to Player II
    public void foul4_i(View v) {
        scorePlayerII = scorePlayerII + 4;
        displayForPlayerII(scorePlayerII);
    }

    //Player II fouls. 4 points awarded to Player I
    public void foul4_ii(View v) {
        scorePlayerI = scorePlayerI + 4;
        displayForPlayerI(scorePlayerI);
    }

    // Foul on blue.
    // Player I fouls. 5 points awarded to Player II
    public void foul5_i(View v) {
        scorePlayerII = scorePlayerII + 5;
        displayForPlayerII(scorePlayerII);
    }

    //Player II fouls. 5 points added to Player I
    public void foul5_ii(View view) {
        scorePlayerI = scorePlayerI + 5;
        displayForPlayerI(scorePlayerI);
    }

    //Foul on pink.
    // Player I fouls. 6 points awarded to Player II
    public void foul6_i(View v) {
        scorePlayerII = scorePlayerII + 6;
        displayForPlayerII(scorePlayerII);
    }

    //Player II fouls. 6 points awarded to Player I
    public void foul6_ii(View v) {
        scorePlayerI = scorePlayerI + 6;
        displayForPlayerI(scorePlayerI);
    }

    //Foul on black.
    // Player I fouls. 7 points awarded to Player II
    public void foul7_i(View v) {
        scorePlayerII = scorePlayerII + 7;
        displayForPlayerII(scorePlayerII);
    }

    //Player II fouls. 7 points awarded to Player I
    public void foul7_ii(View v) {
        scorePlayerI = scorePlayerI + 7;
        displayForPlayerI(scorePlayerI);
    }

    /**
     * Each player has their own score calculated and updated throughout the frame.
     *
     * @param score is the amount of points scored.
     */

    // for Player I
    public void displayForPlayerI(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_player_i);
        scoreView.setText(String.valueOf(score));
    }

    //for Player II.
    public void displayForPlayerII(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_player_ii);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset game: set both scores back to zero ready for a new frame.
     */

    public void reset(View v) {

        scorePlayerI = 0;
        displayForPlayerI(scorePlayerI);
        scorePlayerII = 0;
        displayForPlayerII(scorePlayerII);
    }
}