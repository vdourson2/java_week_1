package java_week_1;
import java.time.LocalDate;
import java.util.Arrays;

public class Visitors {
	private LocalDate date;
	private Integer cardioCount, radioCount, visitCount;
	//private String testClass;
	
	public Visitors(String entry) {
		//this.testClass = entry;
		String[] entriesOfDay = entry.split(",");
		System.out.println(Arrays.toString(entriesOfDay));
		this.date = LocalDate.parse(entriesOfDay[0]);
		this.cardioCount = Integer.valueOf(entriesOfDay[1]);
		this.radioCount = Integer.valueOf(entriesOfDay[2]);
		this.visitCount = Integer.valueOf(entriesOfDay[3]);
	}
	
	public LocalDate getDate() {
		return date;	
	}
	
	public String toString() {
		return date.toString() +" "+ cardioCount +" "+ radioCount +" "+ visitCount;
	}
	
}//class Visitors
