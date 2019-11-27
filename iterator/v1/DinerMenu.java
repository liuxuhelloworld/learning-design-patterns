package iterator.v1;

public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Diner Menu Item 1", "Diner Menu Item 1 Desc", true, 2.99);
        addItem("Diner Menu Item 2", "Diner Menu Item 2 Desc", false, 3.29);
        addItem("Diner Menu Item 3", "Diner Menu Item 3 Desc", true, 2.99);
        addItem("Diner Menu Item 4", "Diner Menu Item 4 Desc", false, 3.29);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, desc, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full");
        } else {
            menuItems[numberOfItems++] = item;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
