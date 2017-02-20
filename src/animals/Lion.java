package animals;

/**
 * Created by mandarin80 on 20.02.17.
 */
public class Lion extends Wild{
    public Lion(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public Lion(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
}
