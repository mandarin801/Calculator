package myHashMap;

import java.util.Map;

/**
 * Created by mandarin80 on 26.03.17.
 */
public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap();
        MyHashMap<String, String> myHashMap2 = new MyHashMap();
        myHashMap.put("Vasyan", "Pupkin");

        System.out.println(myHashMap.get("Vasyan"));
        myHashMap.put("Kolya", "Fedoriv");
        myHashMap.put("Vasyan", "Ivanov");
        System.out.println(myHashMap.get("Vasyan"));
        myHashMap.remove("Vasyan");
        System.out.println(myHashMap.get("Vasyan"));
        myHashMap2.put("Ibo", "Gogul");
        myHashMap2.put("Credo", "Assasin");
        myHashMap.keySet();
        myHashMap.values();
        myHashMap.entrySet();
        System.out.println("Ok");
        for (Object o: myHashMap.keySet()) {
            System.out.println(myHashMap.get(o).toString());
        }
        System.out.println("PutAll");
        myHashMap.putAll(myHashMap2);
        for (Object o: myHashMap.keySet()) {
            System.out.println(myHashMap.get(o).toString());
        }
    }
}
