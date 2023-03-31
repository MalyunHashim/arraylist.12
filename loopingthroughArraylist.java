package arraylist;

import java.util.ArrayList;

public class loopingthroughArraylist {
    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("pineapple");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("fruits include " + fruits.get(i));

        }
    }
}