/*

Given a string ABCDE create a method that rotates the stirng by a given amount of rotation steps in a way that:
rotateString("ABCDE", 2) returns "DEABC"
rotateString("ABCDE", -2) returns "ABCDE"

*/

public class RotateString {

  public static String rotateString(String input, int rotationSteps){
      if(rotationSteps <= 0 || rotationSteps == input.length) return input;
    
      char[] charArr = input.toCharArray();
      char[] result = new char[input.length()];
      
      for(int i = 0; i < input.length(); i++){
        result[i] = charArr[(i + rotationSteps) % charArr.length];
      }
      
      return new String(result);
  }
  
}
