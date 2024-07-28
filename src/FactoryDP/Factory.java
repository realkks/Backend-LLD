package FactoryDP;

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
