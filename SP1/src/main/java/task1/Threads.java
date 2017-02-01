package task1;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * <h2>Task 1</h2>
 * <p>
 * Write three methods:
 * <ol>
 * <li>Compute and print the sum of all numbers from 1 to 1 billion.</li>
 * <li>
 * Print the numbers from 1 to 5. Pause for 2 seconds between each print.
 * </li>
 * <li>
 * Print all numbers from 10 and up to {@link Integer#MAX_VALUE}. Pause for 3
 * seconds between each print.
 * </li>
 * </ol>
 * Create three threads that run each of the above methods. Start them all
 * simultaneously from your main method. Stop / kill the thread running the
 * third method after waiting 10 seconds.
 * </p>
 */
public class Threads {

    /**
     * Starts three threads that execute three methods simultaneously.
     *
     * @param args Input arguments to the main method. Unused.
     */
    
    
    static void taskOne(){
      int sum=0;
       for(int i = 0; i<1000000001; i++){
       
       sum =sum+i;
           System.out.println("One "+i);
       } 
        
        
        System.out.println(sum);
    
    }
    
    static void taskTwo() {
                    try {
                           
        for (int i = 1; i<6; i++){
        
            System.out.println("two "+i);
            Thread.sleep(2000);
        }
               } catch (InterruptedException ex) {
                   Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
               }

    }
    
    static void taskThree() {
                try {
                    for(int i=10; i<Integer.MAX_VALUE; i++  ){
        System.out.println(" three "+i);
        Thread.sleep(3000);
    }
               } catch (InterruptedException ex) {
                   Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
               }
                
                

    
    }
    
    public static void main(String[] args) throws InterruptedException {
               
        
           Runnable r1 = () -> taskOne();
            Runnable r2 = () -> taskTwo();
             Runnable r3 = () -> taskThree();

        new Thread(r1).start();
        new Thread(r2).start();
        Thread t3 = new Thread(r3);
        t3.start();
        Thread.sleep(3000);
        System.out.println("t3 Still alive! "+Thread.activeCount());
        t3.stop();
        
        Thread.sleep(4000);
         System.out.println("t3 is dead.. "+Thread.activeCount());
        
      /*  taskOne();  
        taskTwo();
        taskThree();*/
    }
    
 

}
