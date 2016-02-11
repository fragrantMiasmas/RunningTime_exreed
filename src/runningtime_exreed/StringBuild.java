/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningtime_exreed;

import java.lang.StringBuilder;

/**
 *
 * @author ElizabethReed PC
 */
public class StringBuild { //fixed string

    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    StringBuilder sb3 = new StringBuilder();
    StringBuilder sb4 = new StringBuilder();
    StringBuilder sb5 = new StringBuilder();
    
    StopWatch sw = new StopWatch();

    public void StringBuild() {

    }

    public void builder(int n, StringBuilder sb) {
        sw.start();
        for (int i = 0; i < n; i++) {
            sb.append("Hello World"); 
        }
        sw.stop();
        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read()/n) + " per string appended.\n");
    }   

    public void testStringBuilder() { //for mmain class
        System.out.println("Testing StringBuilders....");
        builder(10, sb1); //10 iterations
        builder(100, sb2); //100 iterations
        builder(1000, sb3); //1000 iterations
        builder(10000, sb4); //10,000 iterations
        builder(100000, sb5); //100,000 iterations
        System.out.println("");
    }
    
}
