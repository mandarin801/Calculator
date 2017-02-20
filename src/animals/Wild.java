package animals;

/**
 * Created by mandarin80 on 19.02.17.
 */
public class Wild extends Animal {

    private boolean isPredator;

    public Wild(int id, int age, int weight, String color) {
        super(id, age, weight, color);
        this.voice();
    }

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
        this.voice();
    }

    public String voice(){
        if (isPredator){
            return  super.voice() + "I'm a wild animal and I'm angry";
        } else {
            return  super.voice() + "I'm a wild animal";
        }
    }
}
