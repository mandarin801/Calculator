package lesson10;

import java.util.Iterator;

/**
 * Created by mandarin80 on 06.03.17.
 */
public class MyIterator implements Iterator {
    private Element current;

    public MyIterator(Element first){
        current = first;
    }

    @Override
    public boolean hasNext() {
        if (current.getNext() != null){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (current.getNext() == null) {
            throw new IndexOutOfBoundsException("End of list.");
        }
        else current = current.getNext();
        return current;
    }
}
