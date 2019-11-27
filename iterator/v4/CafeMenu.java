package iterator.v4;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    private HashMap<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new HashMap<String, MenuItem>();

        addItem("Cafe Menu Item 1", "Cafe Menu Item 1 Desc", true, 2.99);
        addItem("Cafe Menu Item 2", "Cafe Menu Item 2 Desc", false, 3.29);
        addItem("Cafe Menu Item 3", "Cafe Menu Item 3 Desc", true, 2.99);
        addItem("Cafe Menu Item 4", "Cafe Menu Item 4 Desc", false, 3.29);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, desc, vegetarian, price);
        menuItems.put(item.getName(), item);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
