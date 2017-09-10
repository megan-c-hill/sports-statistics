package com.company.Baseball;

import com.company.Baseball.BaseballPlayer;

/**
 * Created by megansISU on 9/10/17.
 */
public class Hitter extends BaseballPlayer {
    int atBat;
    int hits;
    String battingAve;

    public Hitter (String name, int gamesPlayed, int atBat, int hits){
        super(name,gamesPlayed);
        this.atBat = atBat;
        this.hits = hits;
        setStat();
    }

    public void setStat(){
        double ba = (double) hits / atBat;
        battingAve = String.format("%.3f", ba);
    }

    public String toString(){
        String result = "";
        result += super.toString();
        result += "\nBatting Average: " + battingAve;
        return result;
    }
}
