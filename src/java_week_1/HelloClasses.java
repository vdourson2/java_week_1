package java_week_1;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class HelloClasses {

	public static void main(String[] args) {
		File file = new File("assets/hospital_data.csv");
		try (Scanner scanner = new Scanner(file)){
			String text = scanner.nextLine();
			ArrayList<Visitors> visitorsList = new ArrayList<Visitors>();
			while(scanner.hasNext()) {
				Visitors visiteurs = new Visitors(scanner.nextLine());
				visitorsList.add(visiteurs);
			}
			System.out.println(visitorsList);
		}
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
			
		}
	}
}

