package myHashMap;

import java.util.*;

/**
 * Created by mandarin80 on 26.03.17.
 */
public class MyHashMap<K, V> implements Map {
    private LinkedList<Entry>[] table = new LinkedList[16];
    private int size = 0;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (LinkedList l : table) {
            if (l != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsKey(Object key) {
        int hash = Math.abs(key.hashCode() % 16);
        if (table[hash] == null){
            return false;
        } else {
            for (Entry e: table[hash]) {
                if(e.getKey().equals(key)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (LinkedList<Entry> l : table) {
            for (Entry e : l) {
                if (e.getValue().equals(value)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        int hash = Math.abs(key.hashCode() % 16);
        if (table[hash] == null){
            return null;
        } else {
            for (Entry e: table[hash]) {
                if(e.getKey().equals(key)){
                    return e.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public V put(Object key, Object value) {
        int hash = Math.abs(key.hashCode() % 16);
        boolean containsKey = false;
        if (table[hash] == null){
            table[hash] = new LinkedList<>();
            table[hash].addFirst(new Entry(key, value));
            size += 1;
        } else {
            for (Entry e: table[hash]) {
                if (e.getKey().equals(key)) {
                    e.setValue(value);
                    containsKey = true;
                    break;
                }
            }
            if (containsKey == false) {
                table[hash].add(new Entry(key, value));
                size += 1;
            }
        }
        return null;
    }

    @Override
    public Object remove(Object key) {
        int hash = Math.abs(key.hashCode() % 16);
        if (table[hash] == null){
            return null;
        } else {
            for (Entry e: table[hash]) {
                if(e.getKey().equals(key)){
                    table[hash].remove(e);
                    size--;
                }
            }
        }
        return null;
    }



    @Override
    public void putAll(Map m) {
        for (Object e: m.entrySet()) {
            this.put(((Entry) e).getKey(),((Entry) e).getValue());

        }
    }

    @Override
    public void clear() {
        for (LinkedList l : table) {
            if(l != null){
                l = null;
            }
        }
    }

    @Override
    public Set keySet() {
        HashSet keySet = new HashSet();
        for (LinkedList<Entry> l : table) {
            if(l != null){
                for (Entry e : l) {
                    keySet.add(e.getKey());
                }
            }
        }
        return keySet;
    }

    @Override
    public Collection values() {
        HashSet valueSet = new HashSet();
        for (LinkedList<Entry> l : table) {
            if(l != null){
                for (Entry e : l) {
                    valueSet.add(e.getValue());
                }
            }
        }
        return valueSet;
    }

    @Override
    public Set<Entry> entrySet() {
        HashSet entrySet = new HashSet();
        for (LinkedList<Entry> l : table) {
            if(l != null) {
                for (Entry e : l) {
                    entrySet.add(e);
                }
            }
        }
        return entrySet;
    }

    private static class Entry<K,V>{
        private K key;
        private V value;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry(Object key, Object value) {
            this.key = (K) key;
            this.value = (V) value;
        }
    }

}

