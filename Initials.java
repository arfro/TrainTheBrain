import java.util.*;

/*

This program takes a string argument and returns initials.

Examples:
For "annette last name" -> "A. L. Name"
For "lastname" -> "Lastname"
For "  this is my LaST NAME" -> "T. I. M. L. Name"
For "" OR " " -> "N/A"

Usage: 
java Initials "input your string here"
DO NOT forget the quotes, otherwise each word will be treated as a separate argument

*/

public class Initials{

	public static String buildInitials(String input){
		
		StringBuilder result = new StringBuilder();
		
		// trim the input first - avoid ArrayIndexOutOfBoundsException if string containing spaces only passed
		input = input.trim();
		
		if(input.length() == 0 || input == null) return "N/A";
		
		// split on space and input to an array
		String[] inputArr = input.split("\\s+");
		
		// if there is more than one element in the array take each element apart from the last one and shorten them as:
		// First letter of the word upper case + ". "
			if(inputArr.length > 1){
				for(int i = 0; i < inputArr.length-1; i++){
					result.append(inputArr[i]
									.substring(0,1)
									.toUpperCase());
					result.append(". ");
				}
			}
		// append the last element of the array to the result as:
		// First letter uppercase, remaining letters lowercase
			result.append(inputArr[inputArr.length-1]
										.substring(0,1)
										.toUpperCase());
			result.append(inputArr[inputArr.length-1]
										.substring(1, inputArr[inputArr.length-1].length())
										.toLowerCase());
			return new String(result);
	
	}
	

	public static void main(String[] arg){
		
		try{
		System.out.println(buildInitials(arg[0]));
		}
		catch(Exception e){
			System.out.println("Perhaps you didn't provide an argument. Try again");
		}
	}

}
