package DesignPatterns.FactoryDP;

public class Android extends Platform{
    @Override
    // This class is to create and return object of Android ComponentFactory instead of platform
    public ComponentFactory createComponentFactory() {
        return new AndroidComponentFactory();
    }

}
