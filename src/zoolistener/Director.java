package zoolistener;

/**
 * Created by mandarin80 on 02.04.17.
 */
public class Director extends Employees {
    @Override
    public void isHungry(boolean isHungry) {
        System.out.println("Feed it!");;
    }

    @Override
    public void isIll(boolean isIll) {
        System.out.println("Doctor, look at it!");
    }

    @Override
    public void isNeedGrooming(boolean isNeedGrooming) {
        System.out.println("Groom it!");
    }
}
