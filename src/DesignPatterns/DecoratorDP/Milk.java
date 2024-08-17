package DesignPatterns.DecoratorDP;

public class Milk implements AddOns {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 10 + beverage.getCost() ;
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Milk has been added");
    }
}
