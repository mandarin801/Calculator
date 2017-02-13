package lesson6;

/**
 * Created by mandarin80 on 13.02.17.
 */
public class Container {
    private int[] container;

    public Container(int firstMark){
        this.container = new int[1];
        this.container[0] = firstMark;
    }

    public void add(int mark){
        int[] tmp = new int[this.container.length + 1];
        for (int i = 0; i < container.length; i++) {
            tmp[i] = this.container[i];
        }
        this.container = tmp;
        this.container[this.container.length - 1] = mark;
    }

    public int get(int index){
        return this.container[index];
    }

    public int getsize(){
        return this.container.length;
    }

    public boolean contains(int elementForCheck){
        for (int aContainer : this.container) {
            if (aContainer == elementForCheck) {
                return true;
            }
        }
        return false;
    }
}
