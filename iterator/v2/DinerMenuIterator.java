package iterator.v2;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        return menuItems[position++];
    }
}
