package lesson10;

/**
 * Created by mandarin80 on 02.03.17.
 */
public class Element {

    private Element next;
    private Object data;

    public Element (Element next, Object data) {
        this.next = next;
        this.data = data;
    }
    public Object getElement() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

}
