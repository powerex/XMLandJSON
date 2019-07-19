package ua.edu.npu.jsonexample.gsondemo;

import com.google.gson.Gson;
import ua.edu.npu.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        List<Item> listItems = new ArrayList<Item>();
        listItems.add( new Item("Samsung" , 51200.6));
        listItems.add( new Item("IPhone" , 5400.6));
        listItems.add( new Item("Meizu" , 4500.6));

        String jsonStr = new Gson().toJson(listItems);
        System.out.println(jsonStr);
    }
}
