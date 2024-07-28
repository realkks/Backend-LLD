package FactoryDP;

// This class is only to seggregate create factory method from platform if we get platform_name through constructor
public class Factory {
    public static ComponentFactory createFactory(String pfName){
        if(pfName.equals("Android"))
            return new AndroidComponentFactory ();
        else if (pfName.equals("Ios"))
            return new IosComponentFactory();
        else
            return null;
    }
}
