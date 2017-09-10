/**
 * Created by megansISU on 9/10/17.
 */
public abstract class BaseballPlayer {
    private String name;
    private int gamesPlayed;

    public BaseballPlayer(String name, int games){
        this.name = name;
        gamesPlayed = games;
        setStat();
    }

    public String toString(){
        String result = "";
        result += "Name: " + name;
        result += "\nGames:] " + gamesPlayed;
        return result;
    }

    public abstract void setStat();

}

