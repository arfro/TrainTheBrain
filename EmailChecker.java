
 // Please note I would also consider space an invalid character however that is not included in specifiation - spaces will therefore be considered valid characters
 
class EmailChecker {
    public int solution(String S) {
        
        StringBuilder result = new StringBuilder();
        int longest = -1;
        char[] array = S.toCharArray();
        
        
        // edge case scenarios
        if(S.length() == 0 || S == null) return -1;
        if(S.length() == 1){
            //if S converted to lower case does not equal original S that means original S is upper case and also the longest substring
            if(!S.toLowerCase().equals(S)) return 1;
            else return -1;
            }
        
        
        for(char c : array){
                if(!Character.isDigit(c)){
                    result.append(c);
                }
                else{
                    String helper = result.toString().toLowerCase();
                    // if helper (that is: 'result' converted to lower case) is not equal to original 'result' that means there is at least one capital letter
                    if(!helper.equals(result.toString())){
                            if(result.length() > longest) longest = result.length();
                    }
                    result = new StringBuilder();
                }
                
                String helper = result.toString().toLowerCase();
                    if(!helper.equals(result.toString())){
                            if(result.length() > longest) longest = result.length();
                    }
        }
        return longest;
    }
}
