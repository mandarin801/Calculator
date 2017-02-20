package animals;

/**
 * Created by mandarin80 on 20.02.17.
 */
public class Crocodile extends Wild {
    public Crocodile(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public Crocodile(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
}
