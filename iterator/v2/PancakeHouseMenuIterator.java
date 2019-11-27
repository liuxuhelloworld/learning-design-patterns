package iterator.v2;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        return menuItems.get(position++);
    }
}
