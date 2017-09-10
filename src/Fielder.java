/**
 * Created by megansISU on 9/10/17.
 */
public class Fielder extends BaseballPlayer{
    int assists;
    int putouts;
    int errors;
    double fieldingPercentage;

    public Fielder(String name, int gamesPlayed, int assists, int putouts, int errors){
        super(name, gamesPlayed);
        this.assists = assists;
        this.putouts = putouts;
        this.errors = errors;
        setFieldingPercentage();
    }

    private void setFieldingPercentage(){
        fieldingPercentage = (double)(assists + putouts) / (assists + putouts + errors);
    }
}
