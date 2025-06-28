import java.util.ArrayList;
class Team{
    private String teamName;
    private Coach coach;
    private ArrayList<Player> roster;

    public Team(String teamName, Coach coach){
        this.teamName = teamName;
        this.coach = coach;
        this.roster = new ArrayList <>();
    }

    public void addPlayer(Player player){
        roster.add(player);
    }
    public void displayRoster(){
        System.out.println("\n " + teamName + "Roster: ");
        for(Player player : roster){
            System.out.println(player);
        }
    }
    public ArrayList<Player> getRoster() {
        return roster;
    }
    public String getTeamName(){
        return teamName;
    }

    }