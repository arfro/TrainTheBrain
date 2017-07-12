import java.util.Scanner;

/*
There is a number of people standing in a line, numbered: 1, 2, 3 ... 
People in odd numbered places (1, 3, ..) put one hand up.
People in even numbered places (2, 4, ..) put two hands up.

This is to recursively count the number of hands up.
*/

public class HandsUpRecursion{
  
  public static int handsUp(int people) {
  
   if(people == 0) return 0;
  
   if(people%2 == 0) return 2+handsUp(people-1);
   else return 1+handsUp(people-1);
  
}

public static void main(String[] args){
  
  System.out.println("How many people we have in the queue?");
  Scanner in = new Scanner(System.in);
  
  int input = in.nextInt();
  
  System.out.println("Seems like we've got "+handsUp(input)+" hands up");
}

}
