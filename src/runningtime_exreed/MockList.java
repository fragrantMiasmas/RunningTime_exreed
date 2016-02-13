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
public class MockList {
    int j;
    int k;
    
    StopWatch sw = new StopWatch(); 
    
    
    String[] obj = new String[0];
    String[] obj2 = new String[10];
    String[] obj3 = new String[100];
    String[] obj4 = new String[1000];
    String[] obj5 = new String[10000];
    String[] obj6 = new String[100000];
  
     
    public void MockList(){

    }
    
    public void add( String[] str, String x) {
        j = str.length + 1;
        //String[] strA = new String[j];
            for (int i = 0; i < str.length; i++) {
                String[] strA = new String[j];
                strA[i+1] = str[i];
                strA[0] = x;
            }
//            strA[0] = x;
    }   
       
     public void remove(String[] str) { //removes from the end of array
        k = str.length - 1;
        String[] strR = new String[k];
        if (k > 0) { //for negative excpetion
            for (int i = str.length; i > 0; i--) {
                strR[i-1] = str[i];
            }
        }
    }
     
    public void testMock(int n, String[] str){        
        //adds
        sw.start();
        for (int i = 0; i < n; i++) {
            add(str, "Hello World");
        }
        sw.stop();
        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read()/n) + " per string appended.\n");
        
        //removes
//        sw.start();
//        for(int i=0; i< n; i++) {
//           remove(str);
//        }
//        sw.stop();
//        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read()/n) + " per string removed.\n");
//        System.out.println("");
    }
    
    public void testMock2(int n, String[] str){
        sw.start();
        for(int i=0; i< n; i++) {
           remove(str);
        }
        sw.stop();
        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read()/n) + " per string removed.\n");
        System.out.println("");
    }
       
    public void testMockList(){ //for main class
        System.out.println("Testing MockLists....");
        //insert method
         testMock(10, obj); //10 iterations
         //testMock2(10, obj2);
         System.out.println("");
         testMock(100, obj); //100 iterations
         //testMock2(100, obj3);
         testMock(1000, obj); //1000 iterations
         testMock(10000, obj); //10000 iterations
         testMock(100000, obj); //100000 iterations
    }
        
}
