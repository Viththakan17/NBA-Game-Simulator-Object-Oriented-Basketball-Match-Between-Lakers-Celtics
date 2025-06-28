class Player extends Person implements Comparable<Player> {
    private String position;
    private double pointsPerGame;
    private double assistsPerGame;
    private double reboundsPerGame;

    public Player(String name, int age, String position, double ppg, double apg, double rpg){
        super(name, age);
        this.position = position;
        this.pointsPerGame = ppg;
        this.assistsPerGame = apg;
        this.reboundsPerGame = rpg;

    }
    public String getPosition(){
        return position;
    }
    public double getPointsPerGame(){
        return pointsPerGame;
    }

    @Override
    public String toString(){
        return name + " (" + position + ") - " + pointsPerGame + " PPG, " + assistsPerGame + " APG, " + reboundsPerGame + " RPG";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Player other = (Player) obj;
            return name.equals(other.name) && pointsPerGame == other.pointsPerGame;
        
    }
    @Override
    public int compareTo(Player other){
        return Double.compare(other.pointsPerGame, this.pointsPerGame);

    }  
}
