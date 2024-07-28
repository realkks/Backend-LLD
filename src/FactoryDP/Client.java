package FactoryDP;

import FactoryDP.Component.Button.Button;

// Here , we are achieving complete abstraction . We can create object of different class on basis of requirements .
// Refer class notes for Factory design diagram .

public class Client {
    public static void main(String[] args) {
        Platform pf = new Android();    // Creating object on basis of Platform . It can be android or Ios.
        ComponentFactory cf = pf.createComponentFactory(); // It will create component Factory object on basic of Platform

        //Now, after this we can create any component
        Button button = cf.createButton(); // It will create Button object on basis of Pf.


        // If we don't have Android or Ios class . Instead we are passing at object creation . e.g:
        Platform pf1 = new Platform("Android");
        ComponentFactory cf1 = pf.createFactory();
        Button b1 = cf1.createButton();
    }
}
