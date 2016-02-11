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
    
    StopWatch sw = new StopWatch(); 
    
    
    String[] obj = new String[0];
    String[] obj2 = new String[0];
    String[] obj3 = new String[0];
    String[] obj4 = new String[0];
    String[] obj5 = new String[0];
          
    public void MockList(){

    }
    
    public int size(int size, String[] str){
        size = str.length - 1;
        return(size);
    }
    
     public void add(int j, String[] str, String x) {
        j = str.length + 1;
        String[] str2 = new String[j];
            for (int i = 0; i < str.length; i++) {
                str2[i+1] = str[i];
            }
            str2[0] = x;
    }
     
      public void remove(int j, String[] str, String y){ //sets everything to null
        String temp = str[j];
        for(int i = j-1; i< str.length; i++){ //i>0, i--
           str[j+1] = str[j];
       }
        str[j] = y;
        str[0] = temp;
    }
       
//     public void remove(int k, String[] str, String y){ //sets everything to null
//        k = str.length - 1;
//        String[] str2 = new String[k];
//        for(int i = 0; i > str.length; i--){
//           str2[i-1] = str[i];
//       }
//        str2[0] = y;
//    }
    public void testMock(int n, String[] str){        
        //adds
        sw.start();
        for (int i = 0; i < n; i++) {
            add(0, str, "Hello World");
        }
        sw.stop();
        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read()/n) + " per string appended.\n");
        
        //removes
//        sw.start();
//        for(int i=0; i< n; i++) {
//           remove(0, str, "");
//        }
//        sw.stop();
//        System.out.printf("for " + n + " iterations, time = " + sw.read() + " nano seconds; avg = " + (sw.read()/n) + " per string removed.\n");
//        System.out.println("");
    }
        
//     public void testMockList(){ //for main class
//        System.out.println("Testing MockLists....");
//        //insert method
//         testMock(obj); //10 iterations
//         testMock(obj2); //100 iterations
//         testMock(obj3); //1000 iterations
//         testMock(obj4); //10000 iterations
//         testMock(obj5); //100000 iterations
//    }
    
    //str.length
    
    public void testMockList(){ //for main class
        System.out.println("Testing MockLists....");
        //insert method
         testMock(10, obj); //10 iterations
         testMock(100, obj2); //100 iterations
         testMock(1000, obj3); //1000 iterations
         testMock(10000, obj4); //10000 iterations
         testMock(100000, obj5); //100000 iterations
    }
        
}
