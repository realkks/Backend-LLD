package DesignPatterns.FactoryDP;

import DesignPatterns.FactoryDP.Component.Button.AndroidButton;
import DesignPatterns.FactoryDP.Component.Button.Button;
import DesignPatterns.FactoryDP.Component.Dropdown.AndroidDropdown;
import DesignPatterns.FactoryDP.Component.Dropdown.Dropdown;
import DesignPatterns.FactoryDP.Component.Menu.AndroidMenu;
import DesignPatterns.FactoryDP.Component.Menu.Menu;

// This class is to create object for Android Component
public class AndroidComponentFactory implements ComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
