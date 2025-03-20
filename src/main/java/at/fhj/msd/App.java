package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Colors red = new Colors(255, 0, 0);
        Colors green = new Colors(0, 255, 0);
        Colors blue = new Colors(0, 0, 255);
        Colors red2 = new Colors(255, 0, 0);
        Colors red3 = new Colors(0, 255, 0);
        Colors blue1 = new Colors(0, 0, 255);
        Colors blue2 = new Colors(0, 0, 255);

        List<Colors> colory = new ArrayList<>();
        colory.add(red);
        colory.add(green);
        colory.add(blue);
        colory.add(red2);
        colory.add(red3);
        colory.add(blue1);
        colory.add(blue2);

        System.out.println(Colors.uniqColors(colory).toString());
        System.out.printf("colors: %d, uniq: %d\n", colory.size(), Colors.uniqColors(colory).size());

       Colors.random(10);

        
        
    }
}
