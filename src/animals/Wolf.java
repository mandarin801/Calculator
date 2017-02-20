package animals;

/**
 * Created by mandarin80 on 20.02.17.
 */
public class Wolf extends Wild {
    public Wolf(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public Wolf(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

}
