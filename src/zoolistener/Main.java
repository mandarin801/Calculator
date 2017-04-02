package zoolistener;


/**
 * Created by mandarin80 on 29.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Wild dog = new Wild();
        Pets cat = new Pets();

        System.out.println(dog.getId());
        System.out.println(cat.getId());

        Director director = new Director();
        Feedboy feedboy = new Feedboy();
        Veterinar veterinar = new Veterinar();
        Groomer groomer = new Groomer();

        dog.registerIsHungryObserver(director);
        dog.registerIsHungryObserver(veterinar);
        dog.registerIsHungryObserver(feedboy);
        dog.registerIsIllObserver(director);
        dog.registerIsIllObserver(veterinar);

        dog.notifyIsHungry();
        dog.notifyIsIll();

        cat.registerIsHungryObserver(director);
        cat.registerIsHungryObserver(veterinar);
        cat.registerIsHungryObserver(feedboy);
        cat.registerIsIllObserver(director);
        cat.registerIsIllObserver(veterinar);
        cat.registerIsNeedGroomingObserver(director);
        cat.registerIsNeedGroomingObserver(groomer);

        cat.notifyIsHungry();
        cat.notifyIsIll();
        cat.notifyIsNeedGrooming();

    }
}
