/**
 * Created by megansISU on 9/10/17.
 */
public class Pitcher extends BaseballPlayer{
    int inningsPitched;
    int earnedRuns;
    String era;

    public Pitcher(String name, int gamesPlayed, int inningsPitched, int earnedRuns){
        super(name, gamesPlayed);
        this.inningsPitched = inningsPitched;
        this.earnedRuns = earnedRuns;
    }

    public void setStat(){
        double ERA = (9.0 * earnedRuns) / inningsPitched;
        era = String.format("%.4f", ERA);
    }

    public String toString(){
        String result = "";
        result += super.toString();
        result += "Earned Run Average: " + era;
        return result;
    }
}
