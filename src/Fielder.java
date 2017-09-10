/**
 * Created by megansISU on 9/10/17.
 */
public class Fielder {
    int assists;
    int putouts;
    int errors;
    double fieldingPercentage;

    public Fielder(int assists, int putouts, int errors){
        this.assists = assists;
        this.putouts = putouts;
        this.errors = errors;
        setFieldingPercentage();
    }

    private void setFieldingPercentage(){
        fieldingPercentage = (double)(assists + putouts) / (assists + putouts + errors);
    }
}
