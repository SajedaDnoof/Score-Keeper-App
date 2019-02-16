package com.jawx.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreFirstTeam;
    int scoreSecondTeam;
    TextView scoreView1;
    TextView scoreView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreFirstTeam=0;
        scoreSecondTeam=0;
        scoreView1 = (TextView) findViewById(R.id.first_team_score);
        scoreView2 = (TextView) findViewById(R.id.second_team_score);
    }
    public void addOneFirst(View V){
        scoreFirstTeam=scoreFirstTeam+1;
        displayFirst(scoreFirstTeam);
    }
    public void addTwoFirst(View V){
        scoreFirstTeam=scoreFirstTeam+2;
        displayFirst(scoreFirstTeam);
    }
    public void addOneSecond(View V){
        scoreSecondTeam=scoreSecondTeam+1;
        displaySecond(scoreSecondTeam);
    }
    public void addTwoSecond(View V){
        scoreSecondTeam=scoreSecondTeam+2;
        displaySecond(scoreSecondTeam);
    }
    public void resetScore(View V){
        scoreFirstTeam=0;
        scoreSecondTeam=0;
        displayFirst(scoreFirstTeam);
        displaySecond(scoreSecondTeam);
    }


    public void displayFirst(int score) {
        scoreView1.setText(score+"");
    }
    public void displaySecond(int score) {
        scoreView2.setText(score+"");
    }
}