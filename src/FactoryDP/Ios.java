package FactoryDP;

public class Ios extends Platform{
    @Override
    //It will create and return object Ios component factory
    public ComponentFactory createComponentFactory() {
        return new IosComponentFactory();
    }
}
