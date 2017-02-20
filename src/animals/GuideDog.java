package animals;

/**
 * Created by mandarin80 on 20.02.17.
 */
public class GuideDog extends Dog {

    private boolean isTrained = false;

    public GuideDog(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public GuideDog(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    public GuideDog(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    public GuideDog(int id, int age, int weight, String color, String name, boolean isVactinated, boolean isTrained) {
        super(id, age, weight, color, name, isVactinated);
        this.isTrained = isTrained;
    }

    public String voice(){
        if(isTrained){
            return "I can take you home.";
        } else {
            return super.voice();
        }
    }
}
