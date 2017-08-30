/* You are given a sequence whose n-th term is

T(n) = n^2 - (n-1)^2

You have to evaluate the series

S(n) = T(1) + T(2) + .... + T(n)

Input Format

The first line of input contains T, the number of test cases. 
Each test case consists of one line containing a single integer n. 

Constraints:
1 <= T <= 10
1 <= n <= 10^16

Output Format

For each test case, print the required answer in a line.
*/

import java.io.*;
import java.util.*;

public class SummingNSeries {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
/* If test cases amount is less than 1 or more than 10 program should not proceed. Could also throw a custom exception e.g. IncorrectAmountOfTestCases */
        if(testCases < 1 || testCases > 10) return;

//create a long array which will store the output values
        long[] result = new long[testCases];

/* Now that we have the amount of test cases we can scan the right amount of times to read all input data.
i is an integer, as test cases amount will not be more than 10. The read value however must be long to meet 1 < val < 10^16 requirement*/
        for(int i = 0; i < testCases; i++){
            long read = scan.nextLong();
            if(read <= 0 || read > 100000000000000000L) result[i]=0;
            else result[i] = evaluateSeries(read);
        }

        scan.close();
        for(long i : result) System.out.println(i);
    }
    
    public static long evaluateSeries(long data){
 //for a very large data input recursion could be too costy
        if(data == 0) return 0;
        long result = 0;
        for(long i = 1; i <= data; i++){
            result += calculateTerm(i);
        }
        return result;
    }
    

    public static long calculateTerm(long data){
        return ((data*data) - ((data - 1) * (data -1)));
    }
}
