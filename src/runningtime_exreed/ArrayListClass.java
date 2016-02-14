/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningtime_exreed;

import java.util.ArrayList;

/**
 *
 * @author ElizabethReed PC
 */
public class ArrayListClass {
    
    ArrayList<String>str1 = new ArrayList<>();
    
    
    StopWatch SW = new StopWatch();
    
    public void add(ArrayList str){
        str.add(0, "Hello World!");
    }
    
    public void remove(ArrayList str){
       str.remove("Hello World!"); 
    }    
        public void testPrint(int n, ArrayList str) {
        //adds
        SW.start();
        for (int i = 0; i < n; i++) {
            add(str);
            //System.out.println(str); //troubleshoot
        }
        SW.stop();
        System.out.printf("for " + n + " iterations, time = " + SW.read() + " nano seconds; avg = " + (SW.read()/n) + " per string appended.\n");  
        
        //removes
        SW.start();
        for (int i = 0; i < n; i++) {
            remove(str);
            //System.out.println(str);
        }
        SW.stop();
        System.out.printf("for " + n + " iterations, time = " + SW.read() + " nano seconds; avg = " + (SW.read()/n) + " per string removed.\n");  
        System.out.println("");
    }
    
    public void testArrayList() { //for main class
        System.out.println("Testing ArrayLists....");
        testPrint(10, str1);
//        testPrint(100, str1);
//        testPrint(1000, str1);
//        testPrint(10000, str1);
//        testPrint(100000, str1);
    }
       
}
