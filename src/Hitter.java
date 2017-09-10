/**
 * Created by megansISU on 9/10/17.
 */
public class Hitter {
    int atBat;
    int hits;
    double battingAve;

    public Hitter (int atBat, int hits){
        this.atBat = atBat;
        this.hits = hits;
        setBattingAve();
    }

    private void setBattingAve(){
        battingAve = (double) hits / atBat;
    }
}
