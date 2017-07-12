public class RevertInPlace{

	public static String revertInPlace(String string){
		
		if(string.length() == 0) return "";
		
		else if(string.length() == 1) return string;

		else{
			//convert to an array of chars - will manipulate in place. More effecient as strings immutable. 
			char[] stringToChar = string.toCharArray();
			
			//this loop treats variable i as offset from the last and first character,e.g. i==1 means:
			// swap the second character and the second last
			for(int i = 0; i < stringToChar.length/2; i++){
				char temp;
				//Summary of which index value is replaced by which index value
				System.out.println("Replacing " +stringToChar[i]+ " with "+stringToChar[stringToChar.length-1-i]);
				temp = stringToChar[stringToChar.length-1-i];
				stringToChar[stringToChar.length-1-i] = stringToChar[i];
				stringToChar[i] = temp;
			}
			
			return new String(stringToChar);
		}
		
		
	}


	public static void main(String[] args){
			
			try{
				System.out.println("Reverting string "+args[0]+". Done: "+revertInPlace(args[0]));
			}catch(Exception e){
				System.out.println("Possibly forgot an argument?");
			}
			
	}

}
