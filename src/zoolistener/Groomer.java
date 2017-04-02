package zoolistener;

/**
 * Created by mandarin80 on 02.04.17.
 */
public class Groomer extends Employees {
    @Override
    public void isNeedGrooming(boolean isNeedGrooming) {
        System.out.println("*groomer is grooming the animal");
    }
}
