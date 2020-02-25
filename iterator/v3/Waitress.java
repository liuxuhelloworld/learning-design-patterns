package iterator.v3;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    private ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item.getName() + ", " + item.getPrice() + ", " + item.getDesc());
        }
    }
}
