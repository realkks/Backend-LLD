package DesignPatterns.DecoratorDP;

// We are creating Beverage which have different types of coffee like HouseBlend, Decaf and on top of that
// we are adding AddOns like Milk, Soy, Mocha etc. So, we are creating a decorator pattern
public class Client {
    public static void main(String[] args) {
        Beverage b = new HouseBlend();
        b = new Milk (b);
        b = new Whip(b);

        b.getDescription();
        b.getCost();
    }
}
