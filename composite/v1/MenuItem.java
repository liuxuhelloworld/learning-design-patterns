package composite.v1;

public class MenuItem extends MenuComponent {
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

    public void print() {
        System.out.println("[name=" + name + ", desc=" + desc + ", vegetarian=" + vegetarian + ", price=" + price + "]");
    }
}
