package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class colours {
    public static void main(String[] args) {
        ArrayList< String> colours=new ArrayList<>();
        colours.add("yellow");
        colours.add("black");
        colours.add("red");
        colours.add("green");
        colours.add("pink");
        colours.add("white");
        colours.add("orange");
        Collections.sort(colours);
        for(String i:colours){
            System.out.println(i);
        }
    }
}
