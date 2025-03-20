package at.fhj.msd;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Set<Colors> colorSet = new HashSet<>();
        colorSet.add(new Colors(255, 0, 0));
        colorSet.add(new Colors(255, 0, 0));
        colorSet.add(new Colors(255, 0, 0));

        System.out.println(colorSet.size());

    }
}
