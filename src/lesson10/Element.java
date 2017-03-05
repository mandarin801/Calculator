package lesson10;

/**
 * Created by mandarin80 on 02.03.17.
 */
public class Element<E> extends Object{

    private Element next;
    private Element previous;
    private E data;

    public Object getElement() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element getPrevious() {
        return previous;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }
}
