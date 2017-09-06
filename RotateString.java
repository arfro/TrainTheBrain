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
