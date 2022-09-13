package alisherDay12;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>(5);
        list.add("ferari");
        list.add("mersedes");
        list.add("audi");
        list.add("man");
        list.add("maz");
        System.out.println(list);
        list.add(4,"BMV");
        list.remove("ferari");
        System.out.println(list);
        System.out.println(list.size());
    }
}
