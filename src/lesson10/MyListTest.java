package lesson10;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by mandarin80 on 01.03.17.
 */
class MyListTest {
    static MyList list = new MyList();

    @BeforeAll
    static void setUp() {
    }

    /*@Test
    void size(){
        list.add("Yi");
        list.add("Yi");
        assertEquals(2, list.size());
    }*/

    @Test
    void add(){
        assertEquals(true, list.add("Hi"));
    }

    @Test
    void isEmpty(){
        assertEquals(false, list.isEmpty());
    }

    @Test
    void contains(){
        list.add("Yes");
        list.add("No");
        list.add("Duh");
        assertEquals(true, list.contains("No"));
    }

    @Test
    void remove(){
        list.add("Yes");
        list.add("No");
        list.add("Duh");
        assertEquals(true, list.contains("No"));
        list.remove("No");
        assertEquals(false, list.contains("No"));
    }

    @Test
    void addAll(){
        MyList first = new MyList();
        for (int i = 0; i < 4; i++) {
            System.out.println(first.add(i));
        }
        assertEquals(4, first.size());
        MyList second = new MyList();
        for (int i = 5; i < 9; i++) {
            System.out.println(second.add(i));
        }
        first.addAll(second);
        assertEquals(8, first.size());
    }

    @Test
    void retainAll(){
        MyList first = new MyList();
        for (int i = 1; i < 6; i++) {
            System.out.println(first.add(i));
        }
        assertEquals(5, first.size());
        MyList second = new MyList();
        for (int i = 3; i < 5; i++) {
            System.out.println(second.add(i));
        }
        first.retainAll(second);
        assertEquals(5, first.size());
    }

}