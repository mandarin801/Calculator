package myHashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by mandarin80 on 03.04.17.
 */
class MyHashMapTest {

    static MyHashMap<String, String> myHashMap;

    @BeforeAll
    private static void setUp() {
        myHashMap = new MyHashMap();
    }

    @AfterEach
    void tearDown() {
        myHashMap = new MyHashMap<>();
        System.out.println("=============setUp");
    }

    @Test
    void size() {
        assertEquals(0, myHashMap.size());
        myHashMap.put("Vasya", "Pupkin");
        assertEquals(1, myHashMap.size());
        myHashMap.put("O","K");
        assertEquals(2, myHashMap.size());
    }

    @Test
    void isEmpty() {
        myHashMap.put("K", "V");
        assertEquals(1, myHashMap.size());
        myHashMap.put("F", "B");
        assertEquals(2, myHashMap.size());
        myHashMap.clear();
        assertEquals(0, myHashMap.size());
    }

    @Test
    void containsKey() {
        myHashMap.put("K", "V");
        myHashMap.put("F", "B");
        assertEquals("B", myHashMap.get("F"));
        assertEquals(true, myHashMap.containsKey("F"));
    }

    @Test
    void containsValue() {
        myHashMap.put("K", "V");
        myHashMap.put("F", "B");
        assertEquals("B", myHashMap.get("F"));
        assertEquals(true, myHashMap.containsValue("B"));
    }

    @Test
    void get() {
        myHashMap.put("K", "V");
        myHashMap.put("F", "B");
        assertEquals("B", myHashMap.get("F"));
    }

    @Test
    void put() {
        assertEquals(0, myHashMap.size());
        myHashMap.put("F", "H");
        assertEquals(1, myHashMap.size());
    }

    @Test
    void remove() {
        myHashMap.put("F", "H");
        assertEquals(1, myHashMap.size());
        myHashMap.remove("F");
        assertEquals(0, myHashMap.size());
    }

    @Test
    void putAll() {
        myHashMap.put("F", "H");
        myHashMap.put("V", "G");
        MyHashMap map = new MyHashMap();
        map.put("Q", "W");
        map.put("A", "S");
        myHashMap.putAll(map);
        assertEquals(4, myHashMap.size());
        assertEquals("H", myHashMap.get("F"));
        assertEquals("G", myHashMap.get("V"));
        assertEquals("W", myHashMap.get("Q"));
        assertEquals("S", myHashMap.get("A"));
    }

    @Test
    void clear() {
        myHashMap.put("F", "H");
        myHashMap.put("B", "G");
        assertEquals(2, myHashMap.size());
        myHashMap.clear();
        assertEquals(0, myHashMap.size());
    }

    @Test
    void keySet() {
        myHashMap.put("F", "H");
        myHashMap.put("B", "G");
        assertEquals(true, myHashMap.keySet().contains("F"));
        assertEquals(true, myHashMap.keySet().contains("B"));
        assertEquals(false, myHashMap.keySet().contains("H"));
    }

    @Test
    void values() {
        myHashMap.put("F", "H");
        myHashMap.put("B", "G");
        assertEquals(true, myHashMap.values().contains("H"));
        assertEquals(true, myHashMap.values().contains("G"));
        assertEquals(false, myHashMap.values().contains("F"));
    }

    @Test
    void entrySet() {
        myHashMap.put("F", "H");
        myHashMap.put("B", "G");
        assertEquals(2, myHashMap.entrySet().size());
    }

}