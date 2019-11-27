package iterator.v1;

import java.util.ArrayList;

public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("Pancake House Menu Item 1", "Pancake House Menu Item 1 Desc", true, 2.99);
        addItem("Pancake House Menu Item 2", "Pancake House Menu Item 2 Desc", false, 3.29);
        addItem("Pancake House Menu Item 3", "Pancake House Menu Item 3 Desc", true, 2.99);
        addItem("Pancake House Menu Item 4", "Pancake House Menu Item 4 Desc", false, 3.29);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
