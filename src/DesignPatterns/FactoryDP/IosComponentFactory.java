package DesignPatterns.FactoryDP;

import DesignPatterns.FactoryDP.Component.Button.Button;
import DesignPatterns.FactoryDP.Component.Button.IosButton;
import DesignPatterns.FactoryDP.Component.Dropdown.Dropdown;
import DesignPatterns.FactoryDP.Component.Dropdown.IosDropdown;
import DesignPatterns.FactoryDP.Component.Menu.IosMenu;
import DesignPatterns.FactoryDP.Component.Menu.Menu;

//This Class is to create objects for Ios Component
public class IosComponentFactory implements ComponentFactory{
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
