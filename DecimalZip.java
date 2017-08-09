/* There might be cases where two given integers will result in an output that overflows integer max value. 

For example consider a case which is within the correct range for both A and B but result is an overflow value, example test: (200000, 200999) would result in a runtime exception.

We could change int return value of the function to long - however the below implementation is as per requirements with requested return type.
*/

class DecimalZip {
    public int solution(int A, int B) {
        
        StringBuilder resultString = new StringBuilder();
        char[] A_charArr = String.valueOf(A).toCharArray();
        char[] B_charArr = String.valueOf(B).toCharArray();
        
        //edge case test
        if(A > 100000000 || B > 100000000) return -1;
        
        for(int i=0; i < A_charArr.length || i < B_charArr.length; i++){
            //append value of the i-th index to resultString
            //append A_charArr[i]
            if(i < A_charArr.length) resultString.append(A_charArr[i]);
            //append B_charArr[i]
            if(i < B_charArr.length) resultString.append(B_charArr[i]);
            }
            
        //if the final output will not be parsable to integer (e.g. overflow) return -1.
        try{
            return Integer.parseInt(resultString.toString());
        }catch(NumberFormatException e){
            return -1;
        }
        
    }
}
