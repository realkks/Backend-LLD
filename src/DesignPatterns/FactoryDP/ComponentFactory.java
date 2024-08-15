package DesignPatterns.FactoryDP;

import DesignPatterns.FactoryDP.Component.Dropdown.Dropdown;
import DesignPatterns.FactoryDP.Component.Menu.Menu;
import DesignPatterns.FactoryDP.Component.Button.Button;

// This interface have features of Component
public interface ComponentFactory {
    public Button createButton();
    public Dropdown createDropdown();
    public Menu createMenu();

}
