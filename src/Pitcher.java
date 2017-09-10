/**
 * Created by megansISU on 9/10/17.
 */
public class Pitcher extends BaseballPlayer{
    int inningsPitched;
    int earnedRuns;
    double era;

    public Pitcher(String name, int gamesPlayed, int inningsPitched, int earnedRuns){
        super(name, gamesPlayed);
        this.inningsPitched = inningsPitched;
        this.earnedRuns = earnedRuns;
        setERA();
    }

    private void setERA(){
        era = (9.0 * earnedRuns) / inningsPitched;
    }
}
