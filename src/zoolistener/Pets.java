package zoolistener;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

/**
 * Created by mandarin80 on 29.03.17.
 */
public class Pets extends Animal {
    private boolean isNeedGrooming = false;
    private List<Employees> isNeedGroomingObservers = new LinkedList<>();

    public boolean isNeedGrooming() {
        return isNeedGrooming;
    }

    public void setNeedGrooming(boolean needGrooming) {
        isNeedGrooming = needGrooming;
    }

    public void registerIsNeedGroomingObserver(Employees o){
        isNeedGroomingObservers.add(o);
    }

    public void removeIsNeedGroomingObserver(Employees o){
        isNeedGroomingObservers.remove(o);
    }

    public void notifyIsNeedGrooming(){
        for (Employees e: isNeedGroomingObservers) {
            e.isNeedGrooming(isNeedGrooming);
        }
    }

}
