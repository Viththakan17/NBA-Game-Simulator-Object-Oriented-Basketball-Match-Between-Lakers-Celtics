class Coach extends Person{
    private String strategy;

    public Coach(String name, int age, String strategy){
        super(name, age);
        this.strategy = strategy;
    }

    public void changeStrategy(String newStrategy){
       this.strategy = newStrategy;
       System.out.println(" Coach " + name + " changed strategy to: " + newStrategy);

    }

    @Override
    public String toString(){
        return "Coach " + name + " - Strategy: " + strategy;

    }

}