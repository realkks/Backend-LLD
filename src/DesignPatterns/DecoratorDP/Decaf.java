package DesignPatterns.DecoratorDP;

public class Decaf implements Beverage {
    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public void getDescription() {
        System.out.println("Decaf");
    }
}
