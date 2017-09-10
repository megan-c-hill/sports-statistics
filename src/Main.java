/**
 * Created by megansISU on 9/10/17.
 */
import java.util.ArrayList;

public class Main {
    private static ArrayList<BaseballPlayer> team = new ArrayList<BaseballPlayer>();

    public static void main(String[] args) {
        team.add(new Hitter("Tyler Lawson", 29, 78, 25));
        team.add(new Hitter("Jason Brown", 16, 54, 13));
        team.add(new Pitcher("Tom Jensen", 9, 50.7, 18));
        team.add(new Pitcher("Jason Brown", 10, 72.3, 15));
        team.add(new Fielder("Willie Starks", 30, 11, 97, 4));
        team.add(new Fielder("Jason Brown", 16, 23, 6, 3));

        for(BaseballPlayer b : team){
            System.out.println(b.toString());
        }

    }
}
