package adapter;

import java.util.Iterator;
import java.util.Enumeration;

public class IteratorEnumeration implements Enumeration {
    private Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}
