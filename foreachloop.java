package arraylist;

import java.util.ArrayList;
import java.util.StringJoiner;

public class foreachloop {

    public static void main(String[] args) {


        ArrayList<String> FRUITS = new ArrayList<>();
         FRUITS.add("mango");
         FRUITS.add("orange");
         FRUITS.add("apple");
         FRUITS.add("pineaple");
         for(String i:FRUITS){
             System.out.println(i);
         }
    }
}