class GottaHaveFizzBuzzHere{

	public static void fizzbuzz(){
		
		StringBuilder printMe = new StringBuilder("");
		
		for(int i = 0; i <= 100; i++){
		
			if(i%3 == 0) printMe.append("Fizz");
			else if(i%5 == 0) printMe.append("Buzz");
			else printMe.append(i);
			
			System.out.println(printMe.toString());

			printMe.setLength(0);
		}
		
	}

	public static void main(String[] sa){
	
		fizzbuzz();
	
	}

}
