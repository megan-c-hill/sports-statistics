package com.company.Baseball;

/**
 * Created by megansISU on 9/10/17.
 */
public class Pitcher extends BaseballPlayer {
    double inningsPitched;
    int earnedRuns;
    String era;

    public Pitcher(String name, int gamesPlayed, double inningsPitched, int earnedRuns){
        super(name, gamesPlayed);
        this.inningsPitched = inningsPitched;
        this.earnedRuns = earnedRuns;
        setStat();
    }

    public void setStat(){
        double ERA = (9.0 * earnedRuns) / inningsPitched;
        era = String.format("%.3f", ERA);
    }

    public String toString(){
        String result = "";
        result += super.toString();
        result += "\nEarned Run Average: " + era;
        return result;
    }
}
