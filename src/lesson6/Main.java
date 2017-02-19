package lesson6;

/**
 * Created by mandarin80 on 13.02.17.
 */
public class Main {
    public static void main(String[] args) {
        // creation of new Student;
        Students ivanov = new Students(1, "Vasiliy", "Ivanov");
        System.out.println(ivanov.getId() + ", " + ivanov.getName());
        ivanov.addMark(5);
        ivanov.setLastName("Petrov-Vodkin");
        System.out.println(ivanov.getId() + ", " + ivanov.getName());
        ivanov.addMark(4);
        ivanov.addMark(3);
        ivanov.addMark(2);

        System.out.println(ivanov.getName() + " has " + ivanov.numberOfMarks() + " marks");

    }
}
