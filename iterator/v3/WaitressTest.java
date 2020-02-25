package iterator.v3;

import java.util.ArrayList;
import java.util.Collections;

public class WaitressTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        Collections.addAll(menus, pancakeHouseMenu, dinerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
