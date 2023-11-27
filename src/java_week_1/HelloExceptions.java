package java_week_1;

import java.util.Arrays;

public class HelloExceptions {

	public static void main(String[] args) {
		Integer[] randomArray = new Integer[10];
		//Complete randomArray with random values from 0 to 10
		for(byte i=0;i<10;i++) {
			randomArray[i] = randomZeroToTen();
		}
		System.out.println(Arrays.toString(randomArray));
		
		int index = 0;
		Integer[] dividedArray = new Integer[10];
		try {
			for(Integer el:randomArray) {
				if (index == 0) {
					dividedArray[0] = randomArray[0]/randomArray[0]; 
				}
				else{
					dividedArray[index] = randomArray[index]/randomArray[index-1];
				}
				index++;
			}
		}
		catch (Exception e) {
			//This one gives a message but continue outside of the catch 
			//(but doesn't end this one if a /0 is encountered)
			System.out.println("You cannot divide a number by o - " + e);
			//This one would stop the program
			throw new IllegalArgumentException("You cannot divide a number by o - " + e);
		}
		System.out.println(Arrays.toString(dividedArray));
		
	}
	private static int randomZeroToTen() {
		return (int) (Math.random()*11);
	}
}
