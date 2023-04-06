package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute; 
	private boolean format;
	
	

	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public boolean isFormat() {
		return format;
	}
	public void setFormat(boolean format) {
		this.format = format;
	}
	
	/**
	 * 
	 * @param hour between 0 and 23
	 * @param minute between 0 and 59
	 * @param format 12-hour or 24-hour format
	 */
	public Time (int hour, int minute, boolean format) {
		this.hour = hour;
		this.minute = minute;
		this.format = format;
	}
	
	public String toString() {
		if (this.format == true) {
			return this.hour + ":"+ this.minute;
		}
		else {
			if (this.hour > 12) {
				int newHour = this.hour - 12;
				return newHour + ":" + this.minute;}
			else {
				int newHour = this.hour;
				return newHour + ":" + this.minute;
			}
		}
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	
	public static void main(String[] args) {
		Time example = new Time (23, 11, false);
		Time example2 = new Time (23, 12, true);
		System.out.println(example.toString());
		System.out.println(example2.toString());
		
		System.out.println(example.equals(example2));
    }

}