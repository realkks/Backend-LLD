package DesignPatterns.DecoratorDP;

public class Whip implements AddOns {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 15;
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Whip has been added");
    }
}
