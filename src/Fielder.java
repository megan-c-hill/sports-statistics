/**
 * Created by megansISU on 9/10/17.
 */
public class Fielder extends BaseballPlayer{
    int assists;
    int putouts;
    int errors;
    String fieldingPercentage;

    public Fielder(String name, int gamesPlayed, int assists, int putouts, int errors){
        super(name, gamesPlayed);
        this.assists = assists;
        this.putouts = putouts;
        this.errors = errors;
    }

    public void setStat(){
        double fp = (double)(assists + putouts) / (assists + putouts + errors);
        fieldingPercentage = String.format("%.4f", fp);
    }

    public String toString(){
        String result = "";
        result += super.toString();
        result += "\nFielding Percentage: " + fieldingPercentage;
        return result;
    }
}
