package lesson10;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by mandarin80 on 01.03.17.
 */
public class MyList<E> implements List {
    private Element head;
    private Element tail;



    @Override
    public int size() {
        Element counter = head;
        int size = 0;
        if (head.getElement() != null){
            size = 1;
        }
        while (counter.getNext() != null) {
            size++;
            counter = counter.getNext();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(head == null && tail == null) {
            return true;
        } else return false;
    }

    @Override
    public boolean contains(Object o) {
        Element iterator = head;
        while (iterator.getNext() != null){
            if (iterator.getElement().equals(o)){
                return true;
            }
            iterator = iterator.getNext();
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Element element = new Element();
        if (head == null) {
            head = element;
        } else {
            element.setPrevious(tail);
            tail.setNext(element);
        }
        element.setData(o);
        tail = element;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Element iterator = head;
        Element next = null;
        Element previous = null;
        while (iterator.getNext() != null){
            if (iterator.getElement().equals(o)){
                next = iterator.getNext();
                previous = iterator.getPrevious();
                next.setPrevious(previous);
                previous.setNext(next);
                return true;
            }
            iterator = iterator.getNext();
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        MyList second = (MyList) c;
        Element firstTail = this.tail;
        Element secondHead = second.head;
        secondHead.setPrevious(firstTail);
        firstTail.setNext(secondHead);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
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
