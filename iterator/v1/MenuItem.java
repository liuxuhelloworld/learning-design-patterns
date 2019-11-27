package iterator.v1;

public class MenuItem {
    private String name;
    private String desc;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
