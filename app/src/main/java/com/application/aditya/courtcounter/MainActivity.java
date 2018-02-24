package com.application.aditya.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetscore(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * ADDING 3 POINTS TO TEAM A
     */

    public void addthreepoints(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * ADDING 2 POINTS TO TEAM A
     */
    public void addtwopoints(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * ADDING 1 POINTS TO TEAM A
     */

    public void addonepoints(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * ADDING 3 POINTS TO TEAM B
     */
    public void addthreepointsb(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);

    }

    /**
     * ADDING 2 POINTS TO TEAM B
     */
    public void addtwopointsb(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * ADDING 1 POINTS TO TEAM B
     */
    public void addonepointsb(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }



}
