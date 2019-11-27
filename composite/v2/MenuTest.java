package composite.v2;

public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Pancake House Menu Desc");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Diner Menu Desc");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Cafe Menu Desc");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert Menu Desc");

        pancakeHouseMenu.add(new MenuItem("Pancake House Menu Item 1", "Pancake House Menu Item 1 Desc", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Pancake House Menu Item 2", "Pancake House Menu Item 2 Desc", false, 3.29));
        pancakeHouseMenu.add(new MenuItem("Pancake House Menu Item 3", "Pancake House Menu Item 3 Desc", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Pancake House Menu Item 4", "Pancake House Menu Item 4 Desc", false, 3.29));

        dinerMenu.add(new MenuItem("Diner Menu Item 1", "Diner Menu Item 1 Desc", true, 2.99));
        dinerMenu.add(new MenuItem("Diner Menu Item 2", "Diner Menu Item 2 Desc", false, 3.29));
        dinerMenu.add(new MenuItem("Diner Menu Item 3", "Diner Menu Item 3 Desc", true, 2.99));
        dinerMenu.add(new MenuItem("Diner Menu Item 4", "Diner Menu Item 4 Desc", false, 3.29));

        cafeMenu.add(new MenuItem("Cafe Menu Item 1", "Cafe Menu Item 1 Desc", true, 2.99));
        cafeMenu.add(new MenuItem("Cafe Menu Item 2", "Cafe Menu Item 2 Desc", false, 3.29));
        cafeMenu.add(new MenuItem("Cafe Menu Item 3", "Cafe Menu Item 3 Desc", true, 2.99));
        cafeMenu.add(new MenuItem("Cafe Menu Item 4", "Cafe Menu Item 4 Desc", false, 3.29));

        dessertMenu.add(new MenuItem("Dessert Menu Item 1", "Dessert Menu Item 1 Desc", true, 2.99));
        dessertMenu.add(new MenuItem("Dessert Menu Item 2", "Dessert Menu Item 2 Desc", false, 3.29));
        dessertMenu.add(new MenuItem("Dessert Menu Item 3", "Dessert Menu Item 3 Desc", true, 2.99));
        dessertMenu.add(new MenuItem("Dessert Menu Item 4", "Dessert Menu Item 4 Desc", false, 3.29));
        
        dinerMenu.add(dessertMenu);

        MenuComponent allMenus = new Menu("All Menus", "All Menus Desc");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
