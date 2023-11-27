package java_week_1;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class CountingWords {

	public static void main(String[] args) {
		File file = new File("assets/countWords.csv");
		try (Scanner scanner = new Scanner(file)){
			//Absolute path :
			//File file = new File("/home/maison/eclipse-workspace/java_week_1/assets/countWords.csv");
			
			//Relative path :
			//File file = new File("./assets/countWords.csv");
			//File file = new File("assets/countWords.csv");
			
			//System.out.println("File separator : " + File.separator); 
			//System.out.println("Is file: " + file.isFile());
			
			//System.out.println(scanner.nextLine());
			String text = scanner.nextLine();
			String[] textArray = text.split(" ");
			System.out.println(Arrays.toString(textArray));
			HashMap<String,Integer> countWords = new HashMap<>();
			for(String word:textArray) {
				String cleanWord = word.replaceAll("\\p{Punct}", "").toLowerCase();
				System.out.println(cleanWord);
				//countWords.putIfAbsent(cleanWord, 1);
				countWords.merge(cleanWord, 1, Integer::sum);
			}
			System.out.println(countWords);
		}
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
			
		}
	}

}
