package FactoryDP;

public class Android extends Platform{
    @Override
    // It will create and return object of Android ComponentFactory instead of platform
    public ComponentFactory createComponentFactory() {
        return new AndroidComponentFactory();
    }

}
