package FactoryDP;

import FactoryDP.Component.Dropdown.Dropdown;
import FactoryDP.Component.Menu.Menu;
import FactoryDP.Component.Button.Button;

public interface ComponentFactory {
    public Button createButton();
    public Dropdown createDropdown();
    public Menu createMenu();

}
