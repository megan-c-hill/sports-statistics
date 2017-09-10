/**
 * Created by megansISU on 9/10/17.
 */
public class Hitter extends BaseballPlayer {
    int atBat;
    int hits;
    double battingAve;

    public Hitter (String name, int gamesPlayed, int atBat, int hits){
        super(name,gamesPlayed);
        this.atBat = atBat;
        this.hits = hits;
        setBattingAve();
    }

    private void setBattingAve(){
        battingAve = (double) hits / atBat;
    }
}
