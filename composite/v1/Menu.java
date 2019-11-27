package composite.v1;

import java.util.List;
import java.util.ArrayList;

public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;
    private String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void print() {
        System.out.println("[name=" + name + ", desc=" + desc + "]");
        System.out.println("------------------------");
        for (MenuComponent mc : menuComponents) {
            mc.print();
        }
    }
}
