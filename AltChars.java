/*

This class takes a String input and returns boolean value based on whether vowels alternate with consonants
String.matches() is not allowed to use
e.g. 
isAlt("macaroons") ---> false, will fail at second "o"
isAlt("abababab") ---> true
isAlt("aaaababab") ---> false
isAlt("") ---> true
isAlt("a") ---> true

*/


public class AltChars{

	public static boolean isAlt(String input){
		
		if(input.length() < 2) return true;
		
		String vowels = "aeiouy";
		
		for(int i=0; i < input.length()-1; i++){
			//if char at index i is a consonant
			if(!vowels.contains(input.substring(i, i+1))){
				//if char at the next index is a vowel continue
				if(vowels.contains(input.substring(i+1, i+2))){
					//if checking against the last character return true
					if(i == input.length()-2) return true;
					else continue;
				}
				//if char at the next index is a consonant return false
				else return false;
			}
			//if char at index i is a vowel
			else if(vowels.contains(input.substring(i, i+1))){
				//if char at th next index is a consonant, continue
				if(!vowels.contains(input.substring(i+1, i+2))){
					//if checking against the last character return true
					if(i == input.length()-2) return true;
					else continue;
				}
				//if char at the next index is a vowel, return false
				else return false;
			}
		
		}
		return false;
	}

}
