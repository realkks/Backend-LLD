package FactoryDP;

public class Platform {
    private String pfName;

    Platform(){

    }
    // Using constructor
    Platform(String pfName){
        this.pfName=pfName;
    }
    public void setTheme(){
        System.out.println("Set a theme");
    }
    public void setRefreshrate(){
        System.out.println("set a refreh rate");
    }
    public ComponentFactory createComponentFactory(){
        return null;
    }

    // If we are using constructor params. for passing platform name then we need to fo like this .

//    public ComponentFactory createFactory(){
//        if(pfName.equals("Android"))
//            return new AndroidComponentFactory ();
//        else if (pfName.equals("Ios"))
//            return new IosComponentFactory();
//        else
//            return null;
//    }

    // We can also put this method in different class like below .
    public ComponentFactory createFactory(){
        return Factory.createFactory(this.pfName);
    }
}
