package java_week_1;
import java.time.LocalDate;
import java.util.Arrays;

public class Visitors {
	private LocalDate date;
	private Integer cardioCount, radioCount, visitCount;
	
	public Visitors() {
		this.date = null;
		this.cardioCount = 0;
		this.radioCount = 0;
		this.visitCount = 0;
	}
	
	public Visitors(String entry) {
		String[] entriesOfDay = entry.split(",");
		this.date = LocalDate.parse(entriesOfDay[0]);
		this.cardioCount = Integer.valueOf(entriesOfDay[1]);
		this.radioCount = Integer.valueOf(entriesOfDay[2]);
		this.visitCount = Integer.valueOf(entriesOfDay[3]);
	}
	
	public LocalDate getDate() {
		return date;	
	}
	
	public Integer getCardioCount() {
		return cardioCount;	
	}
	
	public Integer getRadioCount() {
		return radioCount;	
	}
	
	public Integer getvisitCount() {
		return visitCount;	
	}
	
	public String toString() {
		return date.toString() +" "+ cardioCount +" "+ radioCount +" "+ visitCount;
	}
	
}//class Visitors
