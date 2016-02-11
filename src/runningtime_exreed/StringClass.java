/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningtime_exreed;


/**
 *
 * @author ElizabethReed PC
 */
public class StringClass {

    StopWatch sw = new StopWatch();
    
    String myString = "myString";
    String newString = "newString";

    public StringClass() {

    }

    public void str(int n) {
        sw.start();
        for (int i = 0; i < n; i++) {
            myString += newString;
        }
        sw.stop();
        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read()/n) + " per string appended.\n");
    }

    public void testString() { //for mmain class
        System.out.println("Testing Strings....");
        str(10); //10 iterations
        str(100); //100 iterations
        str(1000); //1000 iterations
        str(10000); //10000 iterations
        System.out.println("");
    }

}
