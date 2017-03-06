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
        return current!=null;
    }

    @Override
    public Object next() {
        Object toReturn = current.getElement();
        current = current.getNext();
        return toReturn;
    }
}
