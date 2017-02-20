package animals;

/**
 * Created by mandarin80 on 19.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Fish zolotaya = new Fish(100,2,50,"Gold");
        System.out.println(zolotaya.voice());

        Dog tuzik = new Dog(1, 2, 3, "black", "Tuzik", true);
        System.out.println(tuzik.voice());

        Cat murzik = new Cat(101,2,4500,"red","Murzik", true);
        System.out.println(murzik.voice());

        Wolf seryi = new Wolf(103,4,65000,"grey", true);
        System.out.println(seryi.voice());

        Giraffe giraffe = new Giraffe(104,6,37900,"unknown", false);
        System.out.println(giraffe.voice());

        GuideDog muhtar = new GuideDog(105,3,5000,"Black", "Muhtar", true, true);
        System.out.println(muhtar.voice());

    }
}
