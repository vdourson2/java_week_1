package java_week_1;

import java.util.Arrays;

public class HelloExceptions {

	public static void main(String[] args) {
		Integer[] randomArray = new Integer[10];
		for(byte i=0;i<10;i++) {
			randomArray[i] = randomZeroToTen();
		}
		System.out.println(Arrays.toString(randomArray));
		int index = 0;
		Integer[] dividedArray = new Integer[10];
		for(Integer el:randomArray) {
			if (index == 0) {
				dividedArray[0] = randomArray[0]/randomArray[0]; 
			}
			else{
				dividedArray[index] = randomArray[index]/randomArray[index-1];
			}
			index++;
		}
		System.out.println(Arrays.toString(dividedArray));
		
	}
	private static int randomZeroToTen() {
		return (int) (Math.random()*11);
	}
}
