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
    }

    public void setStat(){
        double ba = (double) hits / atBat;
        battingAve = String.format("%.4f", ba);
    }

    public String toString(){
        String result = "";
        result += super.toString();
        result += "Batting Average: " + battingAve;
        return result;
    }
}
