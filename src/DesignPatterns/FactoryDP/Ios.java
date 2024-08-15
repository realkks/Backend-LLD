package DesignPatterns.FactoryDP;

public class Ios extends Platform{
    @Override
    //This class will create and return object of Ios component factory
    public ComponentFactory createComponentFactory() {
        return new IosComponentFactory();
    }
}
