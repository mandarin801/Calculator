package zoolistener;

/**
 * Created by mandarin80 on 02.04.17.
 */
public class Feedboy extends Employees {

    @Override
    public void isHungry(boolean isHungry) {
        System.out.println("*feedboy is feeding the animal...");
    }
}
