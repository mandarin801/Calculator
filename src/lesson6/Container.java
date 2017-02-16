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

    public int getSize(){
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

    public void addAll(int[] tail){
        int containerLength = container.length;
        int[] tmp = new int[container.length + tail.length];
        int tmpLength = tmp.length;
        for (int i = 0; i < tmpLength; i++)  {
            if (i < containerLength){
                tmp[i] = container[i];
            } else {
                tmp[i] = tail[i - containerLength];
            }
        }
        container = tmp;
    }

    public void clean(){
        for (int i: container ) {
            container[i] = 0;
        }
    }

    public int firstIndexOf(int value){
        for (int i: container) {
            if (container[i] == value)
                return i;
        }
        return -1;
    }

    public boolean equals(int[] value){
        if (container.equals(value)) {
            return true;
        }
        return false;
    }

    public void sort(Container container, int lo0, int hi0){
        int lo = lo0;
        int hi = hi0;
        int mid;
        if ( hi0 > lo0) {

            /* Arbitrarily establishing partition element as the midpoint of
             * the array.
             */
            mid = container.get(( lo0 + hi0 ) / 2 );

            // loop through the array until indices cross
            while( lo <= hi ) {
                /* find the first element that is greater than or equal to
                 * the partition element starting from the left Index.
                 */
                while( ( lo < hi0 )  && ( container.get(lo) < mid ))
                    ++lo;

                /* find an element that is smaller than or equal to
                 * the partition element starting from the right Index.
                 */
                while( ( hi > lo0 ) && ( container.get(hi) > mid ))
                    --hi;

                // if the indexes have not crossed, swap
                if( lo <= hi ) {
                    swap(container, lo, hi);
                    ++lo;
                    --hi;
                }
            }

            /* If the right index has not reached the left side of array
             * must now sort the left partition.
             */
            if( lo0 < hi )
                sort( container, lo0, hi );

            /* If the left index has not reached the right side of array
             * must now sort the right partition.
             */
            if( lo < hi0 )
                sort( container, lo, hi0 );

        }
    }

    public void swap(Container container, int i, int j) {
        int T;
        T = container.get(i);
        container.set(i, container.get(j));
        container.set(j, T);
    }

    public void set(int index, int value){
        this.container[index] = value;
    }


}
