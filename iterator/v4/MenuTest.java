package iterator.v4;

import java.util.ArrayList;
import java.util.Collections;

public class MenuTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        ArrayList<Menu> menus = new ArrayList<Menu>();
        Collections.addAll(menus, pancakeHouseMenu, dinerMenu, cafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
