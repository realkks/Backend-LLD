package FactoryDP;

import FactoryDP.Component.Button.Button;
import FactoryDP.Component.Button.IosButton;
import FactoryDP.Component.Dropdown.Dropdown;
import FactoryDP.Component.Dropdown.IosDropdown;
import FactoryDP.Component.Menu.IosMenu;
import FactoryDP.Component.Menu.Menu;

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
