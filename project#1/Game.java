import java.util.Random;

class Game{
    private Team team1;
    private Team team2;
    private Random rand;

    public Game(Team team1,Team team2){
        this.team1 = team1;
        this.team2 = team2;
        this.rand = new Random();

    }

    public void simulateGame(){
        System.out.println("\n Game: " + team1.getTeamName() + " vs. " + team2.getTeamName());
        int score1 = 0, score2 = 0;
        for(int quarter = 1; quarter <= 4; quarter++){
            int points1 = rand.nextInt(30) + 20;
            int points2 = rand.nextInt(30) + 20;
            score1 += points1;
            score2 += points2;

            System.out.println("\n Final Score: " + team1.getTeamName() + " " + score1 + " - " + team2.getTeamName() + " " + score2);

        }
        System.out.println("\n Final Score: " + team1.getTeamName() + " " + score1 + " - " + team2.getTeamName() + " " + score2);

        if (score1 > score2) {
            System.out.println(team1.getTeamName() + " WINS!");
        }
        else if (score2> score1) {
            System.out.println(team2.getTeamName() + " WINS!");
    
        }
        else{
            System.out.println("It's a tie!");
        }
}

}
