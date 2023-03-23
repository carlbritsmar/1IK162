package labTwo;

public class Players {
    private String name;
    private String team;
    private String position;
    private int scoredGoals;
    private int titlesWon;

    public Players(){}
    Players(String name, String team, String position, int scoredGoals, int titlesWon){
        this.name = name;
        this.team = team;
        this.position = position;
        this.scoredGoals = scoredGoals;
        this.titlesWon = titlesWon;

    }


    public int getTitlesWon() {
        return titlesWon;
    }

    public void setTitlesWon(int titlesWon) {
        this.titlesWon = titlesWon;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
