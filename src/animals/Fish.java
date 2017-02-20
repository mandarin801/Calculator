package animals;

/**
 * Created by mandarin80 on 20.02.17.
 */
public class Fish extends Animal {


    public Fish(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public String voice(){
        return "...";
    }
}
