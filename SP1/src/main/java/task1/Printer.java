package task1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * <h2>Task 6</h2>
 * <p>
 * The {@link Printer} is a {@link Runnable} which simply prints the alphabet.
 * Your task is to implement the {@link #run()} method to print the alphabet
 * (in the {@link #ALPHABET} constant) one character at the time, one
 * line per character. In the {@link #main(String[])} method you should create
 * four {@link Printer}s, assign them to 4 different threads and start them all
 * simultaneously.
 * <br/>
 * Before you run them, what do you expect will print? Did you see what you
 * expected?
 * </p>
 */
public class Printer implements Runnable {

    // The alphabet to print
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * This method should print the alphabet one line at the time. Each line
     * should only contain one letter.
     */
    @Override
    public void run() {
        for (char c : ALPHABET.toCharArray()) {
            System.out.println(c);        }
    }
    static void runA() {
        for (char c : ALPHABET.toCharArray()) {
            System.out.println(c);        }
    }
    /**
     * Creates four threads and start them simultaneously.
     *
     * @param args Input arguments to the main method. Unused.
     */
    public static void main(String[] args) {
   
     
        Runnable r1 = () -> runA();
       
        
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r1).start();
    }

}