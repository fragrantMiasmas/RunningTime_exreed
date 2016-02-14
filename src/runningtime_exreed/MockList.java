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

    int i;
    int j;
    int k;
    StopWatch sw = new StopWatch();

    String[] obj = new String[0];
    String[] obj2 = new String[10];
    String[] obj3 = new String[100];
    String[] obj4 = new String[1000];
    String[] obj5 = new String[10000];
    String[] obj6 = new String[100000];

    public void MockList() {

    }

    public void add() {
        j = obj.length + 1;
        String[] str = new String[j];
        for (int i = 0; i < obj.length; i++) {
            str[i + 1] = obj[i];
        }
        str[0] = "Hello World";
        //System.out.println(str[0]);
        System.out.println(java.util.Arrays.toString(str));
    }

  
    public void remove(String[] str) { //removes one from array
        k = str.length - 1;
        if (k > 0) { //for negative exceptions
            String[] str2 = new String[k];
            for (int i = 0; i > str.length; i--) {
                str2[i - 1] = str[i];
            }
        }
    }

    public void testAdd(int n) {
        //adds
        sw.start();
        for (int i = 0; i < n; i++) {
            add();
//            System.out.println(obj);
            //System.out.println(java.util.Arrays.toString(obj));
        }
        sw.stop();
        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read() / n) + " per string appended.\n");
    }

    public void testRemove(int n, String[] str) {
        //removes
        sw.start();
        for (int i = 0; i < n; i++) {
            remove(str);
        }
        sw.stop();
        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read() / n) + " per string removed.\n");
        System.out.println("");
    }

    public void testMockList() { //for main class
        System.out.println("Testing MockLists....");
        //insert method
         testAdd(10); //10 iterations
//         testRemove(10, obj2);
//         testAdd(100); //100 iterations
//         testRemove(100, obj3);
//         testAdd(1000); //1000 iterations
//         testRemove(1000, obj4); 
//         testAdd(10000); //10000 iterations
//         testRemove(10000, obj5); 
//         testAdd(100000); //100000 iterations
//         testRemove(100000, obj6); //10000 iterations
    }

}
