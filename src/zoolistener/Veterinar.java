package zoolistener;

/**
 * Created by mandarin80 on 02.04.17.
 */
public class Veterinar extends Employees {
    @Override
    public void isHungry(boolean isHungry) {
        System.out.println("Feed it please");
    }

    @Override
    public void isIll(boolean isIll) {
        System.out.println("*veterinar is treating the animal");
    }
}
