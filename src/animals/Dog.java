package animals;

/**
 * Created by mandarin80 on 20.02.17.
 */
public class Dog extends Pet {



    public Dog(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public Dog(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    public Dog(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    public String voice(){
        return super.voice() + ", Woof!";
    }
}
