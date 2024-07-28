package FactoryDP;

import FactoryDP.Component.Dropdown.Dropdown;
import FactoryDP.Component.Menu.Menu;
import FactoryDP.Component.Button.Button;

// This interface have features of Component
public interface ComponentFactory {
    public Button createButton();
    public Dropdown createDropdown();
    public Menu createMenu();

}
