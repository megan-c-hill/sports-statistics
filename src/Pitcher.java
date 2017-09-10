/**
 * Created by megansISU on 9/10/17.
 */
public class Pitcher {
    int inningsPitched;
    int earnedRuns;
    double era;

    public Pitcher(int inningsPitched, int earnedRuns){
        this.inningsPitched = inningsPitched;
        this.earnedRuns = earnedRuns;
        setERA();
    }

    private void setERA(){
        era = (9.0 * earnedRuns) / inningsPitched;
    }
}
