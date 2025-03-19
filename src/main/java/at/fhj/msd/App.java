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
        List<Colors> colory = new ArrayList<>();
        colory.add(red);
        colory.add(green);
        colory.add(blue);
        colory.add(red2);
        Colors.uniqColors(colory);

       Colors.random(10);

        
        
    }
}
