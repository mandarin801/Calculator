package lesson10;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by mandarin80 on 01.03.17.
 */
public class MyList implements List {
    Element first;


    @Override
    public int size() {
        Element current = first;
        int size = 0;
        if (first.getElement() != null){
            size = 1;
        }
        while (current.getNext() != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(first == null) {
            return true;
        } else return false;
    }

    @Override
    public boolean contains(Object o) {
        Element current = first;
        while (current.getNext() != null){
            if (current.getElement().equals(o)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        MyIterator iterator = new MyIterator(first);
        return iterator;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        if (first == null) {
            first = new Element(null, o);
        } else {
            Element last = findLast();
            last.setNext(new Element(null, o));
        }
        return true;
    }

    private Element findLast() {
        Element current = first;
        while (current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }

    @Override
    public boolean remove(Object o) {
        Element current = first;
        Element next;
        Element previous = null;
        while (current.getNext() != null){
            if (current.getElement().equals(o)){
                next = current.getNext();
                previous.setNext(next);
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        MyList second = (MyList) c;
        Element firstTail = findLast();
        Element secondHead = second.first;
        firstTail.setNext(secondHead);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        this.first = null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
