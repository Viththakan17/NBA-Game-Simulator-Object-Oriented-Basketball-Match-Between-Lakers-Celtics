public class Project1Test {
    /**This simulation of a basketball game is a program that models a match 
     * between two teams; the Los Angeles Lakers and the Boston Celtics. It 
     * follows an object-oriented design,where players, coaches, teams, and 
     * the game itself are represented using distinct Java classes. Randomized 
     * scoring simulates a real basketball game, enabling each team to score a 
     * random amount of points per quarter. The team with the most points is 
     * the proclaimed champion. It also provides extensibility, allowing new 
     * teams, players, or custom rules to be easily added. 

Person file  
This file is dedicated to receive the name and age of each individual
that is part of the Los Angeles Lakers and the Boston Celtics.

Player file
The position of the NBA player as well as the pointsPerGame, 
assistsPerGame and reboundsPerGame.

Coach file
The coach receives a strategy in order to defeat the team 
and provides a method to changeStrategy() to update during the game.

Team file 
The teamName, coach and roster is given.

Game file
This is where the game is simulated and uses Random to generate 
a random number of points per quarter.

ProjectTest file
This is the main file where the code has to be tested in order 
to be outputted. It initializes the 2 teams the Lakers and the 
Celtics and this it calls simulateGame() to start the game.
     * 
     *
    */


    public static void main(String[] args){
        Coach coachLakers = new Coach("JJ Redick", 40, "Defence First");
        Coach coachCeltics = new Coach("Joe Mazzulla", 36, "Fast Break");

        Team lakers = new Team("Los Angeles Lakers", coachLakers);
        Team celtics = new Team("Boston Celtics", coachCeltics);

        lakers.addPlayer(new Player("Lebron James", 40,  "SF", 27.2, 8.3, 7.4));
        lakers.addPlayer(new Player("Luka Doncic", 26, "PG", 27.0, 8.2, 7.8));
        lakers.addPlayer(new Player("Austin Reeves", 26, "SG", 18.8, 5.8, 4.3));
        lakers.addPlayer(new Player("Jaxson Haßyes", 24, "C", 6.4, 1.1, 4.6));
        lakers.addPlayer(new Player("Jarred Vanderbilt", 24, "PF", 4.1, 1.1, 5.6));

        celtics.addPlayer(new Player("Jayson Tatum", 27, "SF", 27.2, 5.8, 8.9));
        celtics.addPlayer(new Player("Jaylen Brown", 28, "SG", 23.2, 4.8, 6.1));
        celtics.addPlayer(new Player("Jrue Holiday", 34, "PG", 10.8, 3.6, 4.3));
        celtics.addPlayer(new Player("Kristaps Porzingus", 29 ,"C", 18.9, 1.9, 6.8));
        celtics.addPlayer(new Player("Al Horford", 38 ,"C", 8.3, 1.9, 5.8));

        lakers.displayRoster();
        celtics.displayRoster();

        Game game = new Game(lakers, celtics);
        game.simulateGame();
    }
}
