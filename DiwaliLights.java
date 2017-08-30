import java.io.*;
import java.util.*;

public class DiwaliLights {

    public static void main(String[] args) {
          
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        if(testCases < 1 || testCases > 1000) return;

 /* Create an array which will store the output values. Using array as the expected amount of test cases is known - saving memory space. */
        int[] result = new int[testCases];

/* Now that we have the amount of test cases we can scan the right amount of times to read all input data */
        for(int i = 0; i < testCases; i++){
            int read = scan.nextInt();
            result[i] = getAmtOfCombinations(read);
        }
        
   scan.close();
        for(int i : result) System.out.println(i);
        
    }
    
    public static int getAmtOfCombinations(int data){
        //returning 0 for incorrect inputs
        if(data < 0 || data > 10000) return 0;
        if(data == 1) return 1;
        return data * data - 1;
    }
    
}
