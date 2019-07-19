package ua.edu.npu.jsonexample.gsondemo;

import com.google.gson.Gson;
import ua.edu.npu.model.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class MyKey {
    private String namer;

    public MyKey() {
    }

    public MyKey(String namer) {
        this.namer = namer;
    }

    public String getNamer() {
        return namer;
    }

    public void setNamer(String namer) {
        this.namer = namer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyKey)) return false;
        MyKey myKey = (MyKey) o;
        return Objects.equals(namer, myKey.namer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namer);
    }

    @Override
    public String toString() {
        return namer;
    }
}

public class HashMapDemo {
    public static void main(String[] args) {

        MyKey key1 = new MyKey("namer1");
        MyKey key2 = new MyKey("namer2");
        MyKey key3 = new MyKey("namer3");

        Map<MyKey, Item> mapItems = new HashMap<MyKey, Item>();
        mapItems.put(key1, new Item("Samsung", 51200.6));
        mapItems.put(key2, new Item("IPhone", 5400.6));
        mapItems.put(key3, new Item("Meizu", 4500.6));

        String jsonStr = new Gson().toJson(mapItems);
        System.out.println(jsonStr);
    }
}
