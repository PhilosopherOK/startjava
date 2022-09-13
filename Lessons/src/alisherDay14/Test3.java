package alisherDay14;

import java.io.File;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args){
        File file = new File("people.txt");
        System.out.println(Human.parseFileToObjList(file));
    }
}
