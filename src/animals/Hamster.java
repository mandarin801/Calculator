package animals;

/**
 * Created by mandarin80 on 20.02.17.
 */
public class Hamster extends Pet {
    public Hamster(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public Hamster(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    public Hamster(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }
}
