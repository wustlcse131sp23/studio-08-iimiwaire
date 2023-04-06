package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	
	private Date date;
	private Time time;
	private String title;

	public Appointment (Date date, Time time, String title) {
		this.date = date;
		this.time = time;
		this.title = title;
		
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(date, time, title);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time)
				&& Objects.equals(title, other.title);
	}

	public String toString() {
		return this.date.toString() + " " + this.time.toString() + " " + this.title;
	}

	public static void main(String[] args) {
		Date d1 = new Date (4, 6, 2023, false);
		Time t1 = new Time (23, 12, true);
		Appointment example = new Appointment(d1, t1, "class");
		Date d2 = new Date (4, 7, 2023, false);
		Time t2 = new Time (23, 15, true);
		Appointment example2 = new Appointment(d1, t1, "class again");
		
		HashSet <Appointment> Calendar = new HashSet<Appointment>();
		Calendar.add(example);
		Calendar.add(example2);
		
		System.out.println(Calendar);

	}

}
