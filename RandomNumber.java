import java.util.Random;

publicc class RandomNumber{
	public static voild main(String args[]){
		Random random = new Random();
		
		//create a veriable to store the random number genarated.
		int randomNum = random.nextInt();
		
		//print the random number
		System.out.printf("Random Number is : %d%n", random);
		
		//Generating a number within a rang
		intrandomNumInRange = random.nextInt(20);
		
		System.out.printf("Random Number In Range is %d%n", randomNumInRange);
		
		//genarating a float-point number
		double floatpointNum = random.nextDouble();
		
		//print
		System.out.printf("Random Double Number is: %.2f%n", floatpointNum);
	}
}