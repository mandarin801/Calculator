package lesson6;

/**
 * Created by mandarin80 on 13.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Container container = new Container(1);
        container.add(2);
        container.add(3);
        for (int i = 0; i < container.getSize(); i++) {
            System.out.println(container.get(i));
        }
        System.out.println(container.contains(2));
        int[] tail = {5,6,8,7};

        container.addAll(tail);
        for (int i = 0; i < container.getSize(); i++) {
            System.out.println(container.get(i));
        }

        //container.clean();
        container.sort(container, 0, container.getSize() - 1);
        System.out.println("Sorted array");
        for (int i = 0; i < container.getSize(); i++) {
            System.out.print(container.get(i) + ", ");
        }

    }
}
