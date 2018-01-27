package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * Increase the score for Team A by 5 points.
     */
    public void addFiveForTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 10 point.
     */
    public void addDouble5ForTeamA(View v) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 6 point.
     */
    public void addDouble3ForTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 2 point.
     */
    public void addDouble1ForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 15 point.
     */
    public void addTriple5ForTeamA(View v) {
        scoreTeamA = scoreTeamA + 15;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 9 point.
     */
    public void addTriple3ForTeamA(View v) {
        scoreTeamA = scoreTeamA + 9;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 3 point.
     */
    public void addTriple1ForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team B by 5 points.
     */
        public void addFiveForTeamB(View v) {
            scoreTeamB = scoreTeamB + 5;
            displayForTeamB(scoreTeamB);
        }

        /**
         * Increase the score for Team B by 3 points.
         */
        public void addThreeForTeamB(View v) {
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }

        /**
         * Increase the score for Team B by 1 points.
         */
        public void addOneForTeamB(View v) {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
    /**
     * Increase the score for Team B by 10 point.
     */
    public void addDouble5ForTeamB(View v) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 6 point.
     */
    public void addDouble3ForTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 point.
     */
    public void addDouble1ForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 15 point.
     */
    public void addTriple5ForTeamB(View v) {
        scoreTeamB = scoreTeamB + 15;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 9 point.
     */
    public void addTriple3ForTeamB(View v) {
        scoreTeamB = scoreTeamB + 9;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 3 point.
     */
    public void addTriple1ForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
        public void resetScore(View v)
        {
              scoreTeamA = 0;
              scoreTeamB = 0;
              displayForTeamA(scoreTeamA);
              displayForTeamB(scoreTeamB);
        }
    }
