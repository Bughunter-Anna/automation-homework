package org.example;

public class davaleba3 {
    public static void main(String[] args) {

      int [] testResults = {1,0,1,1,0};

      int passed = 0;
      int failed = 0;

       for (int i = 0; i < testResults.length; i++) {
           if (testResults[i] == 1) {
               passed++;
           } else {
               failed++;

           }
       }
        System.out.println("Passed:" + passed);
        System.out.println("Failed:" + failed);
    }
}
