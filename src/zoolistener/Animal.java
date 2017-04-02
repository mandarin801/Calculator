package zoolistener;


import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by mandarin80 on 29.03.17.
 */
public class Animal {
    private final int id;
    private static int nextId = 0;
    private List<Employees> isHungryObservers = new LinkedList<>();
    private List<Employees> isIllObservers = new LinkedList<>();

    private boolean isHungry = false;
    private boolean isIll = false;

    public Animal() {
        this.id = ++nextId;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    public int getId(){
        return id;
    }

    public void registerIsHungryObserver(Employees o) {
        isHungryObservers.add(o);
    }

    public void registerIsIllObserver(Employees o) {
        isIllObservers.add(o);
    }

    public void removeIsHungryObserver(Employees o) {
        isHungryObservers.remove(o);
    }

    public void removeIsIllObserver(Employees o) {
        isIllObservers.remove(o);
    }

    public void notifyIsHungry() {
        for (Employees e: isHungryObservers) {
            e.isHungry(isHungry);
        }
    }

    public void notifyIsIll(){
        for (Employees e: isHungryObservers) {
            e.isIll(isIll);
        }
    }
}
