package animals;

/**
 * Created by mandarin80 on 19.02.17.
 */
public class Animal {

    private final int id;
    private int age;
    private int weight;
    private String color;

    public Animal(int id, int age, int weight, String color){
        this.id = id;
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String voice(){
        return "Hello, ";
    }
}
