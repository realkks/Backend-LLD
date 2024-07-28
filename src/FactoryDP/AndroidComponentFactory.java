package FactoryDP;

import FactoryDP.Component.Button.AndroidButton;
import FactoryDP.Component.Button.Button;
import FactoryDP.Component.Dropdown.AndroidDropdown;
import FactoryDP.Component.Dropdown.Dropdown;
import FactoryDP.Component.Menu.AndroidMenu;
import FactoryDP.Component.Menu.Menu;


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
