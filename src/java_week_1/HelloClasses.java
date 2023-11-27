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
			
			System.out.println("These are the numbers of visitors in cardiology in the last " + visitorsList.size() + " days :");
			for (Visitors visitors:visitorsList) {
				System.out.println(visitors.getCardioCount());
			}
			
			//Print the total visitors of the day
			totalVisitorsOfDay(visitorsList);
		}
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
			
		}
	}
	
	public static void totalVisitorsOfDay(ArrayList<Visitors> visitorsList) {
		Scanner myDate = new Scanner(System.in);
		System.out.println("What day do you need (YYYY-MM-dd) ?");
		String date = myDate.nextLine(); 
		Visitors visitorsofDay = new Visitors();
		for(Visitors visitors:visitorsList) {
			if (date.equals(visitors.getDate().toString())) {
				visitorsofDay = visitors;
			}
		}
		System.out.println("This is the total count of visitors on this day : ");
		System.out.println(visitorsofDay.getCardioCount() + visitorsofDay.getRadioCount() + visitorsofDay.getvisitCount());
	}
}

