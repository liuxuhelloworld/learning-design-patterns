package iterator.v1;

import java.util.ArrayList;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem item = breakfastItems.get(i);
            System.out.println(item.getName() + ": " + item.getPrice() + ", " + item.getDesc());
        }

        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem item = lunchItems[i];
            if (item == null) {
                break;
            }
            System.out.println(item.getName() + ": " + item.getPrice() + ", " + item.getDesc());
        }
    }
}
