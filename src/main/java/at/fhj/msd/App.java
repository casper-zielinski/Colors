package at.fhj.msd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Colors color = new Colors(255, 0, 0);
        System.out.println(color.toString());
        System.out.println(color.hexFormat());
        System.out.println();
        
    }
}
