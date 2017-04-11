package serilizible;

import java.io.*;

/**
 * Created by mandarin80 on 11.04.17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Student ivanov = new Student(1, "Ivanov");
        Student petrov = new Student(1, "Petrov");
        Student sidorov = new Student(1, "Sidorov");

        ivanov.setMark(3);
        ivanov.setMark(4);
        ivanov.setMark(5);
        ivanov.setMark(4);

        petrov.setMark(3);
        petrov.setMark(3);
        petrov.setMark(4);
        petrov.setMark(2);

        sidorov.setMark(3);
        sidorov.setMark(3);
        sidorov.setMark(4);
        sidorov.setMark(2);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./student.txt"));
        out.writeObject(ivanov);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("./student.txt"));
        Student ivanov1 = (Student) in.readObject();
        in.close();

        System.out.println(ivanov1.toString());
    }
}
