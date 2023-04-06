package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	
    public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isHoliday() {
		return holiday;
	}
	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}
	
	/**
	 * 
	 * @param month between 1 and 12
	 * @param day between 1 and 31
	 * @param year 
	 * @param holiday
	 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday= holiday;
	}
	
	public String toString() {
		String descrip = this.month + "/" + this.day + "/" + this.year + " Holiday = " + this.holiday; 
		return descrip;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
	public static void main(String[] args) {
		Date example = new Date (4, 6, 2023, false);
		Date example2 = new Date (4,7, 2023, true);
		Date example3 = new Date (5,7, 2021, true);
		
		Date example4 = new Date (7,7, 2099, false);
		Date example5 = new Date (7,7, 2099, false);
		
		System.out.println(example.toString());
		
		System.out.println(example.equals(example2));
		
		LinkedList<Date> dateList = new LinkedList <Date> ();
		dateList.add(example);
		dateList.add(example2);
		dateList.add(example3);
		System.out.println(dateList);
		
		dateList.add(example4);
		dateList.add(example5);
		dateList.add(example4);
		System.out.println(dateList);
		
		HashSet<Date> dateSet = new HashSet<Date>();
		dateSet.add(example4);
		dateSet.add(example5);
		dateSet.add(example4);
		System.out.println(dateSet);
    }
	
	

}
