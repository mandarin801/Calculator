package animals;

/**
 * Created by mandarin80 on 19.02.17.
 */
public class Pet extends Animal {

    private String name;
    private boolean isVactinated = false;

    public Pet(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public Pet(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color);
        this.name = name;
    }

    public Pet(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    public String voice(){
    if (name != null){
        return super.voice() + " my name is " + name;
    } else {
        return super.voice();
    }
    }
}

