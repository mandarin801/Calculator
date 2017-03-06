package lesson10;

/**
 * Created by mandarin80 on 01.03.17.
 */
public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("first");
        list.add("second");
        list.add("third");

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
