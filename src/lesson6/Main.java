package lesson6;

/**
 * Created by mandarin80 on 13.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Container container = new Container(1);
        container.add(2);
        container.add(3);
        for (int i = 0; i < container.getsize(); i++) {
            System.out.println(container.get(i));
        }
        System.out.println(container.contains(2));
    }
}
