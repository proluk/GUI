package pl.edu.pjwstk.s8267.GUI.Lab5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class DaysToRemember implements Iterable<Calendar>, Iterator<Calendar> {
	private Calendar c;
	private int month;
	private int year;

	public DaysToRemember(int day, int month, int year) {
		this.month = month-1;
		this.year = year;
		setDayWeek(day);
	}

	public void setDayWeek(int day) {
		c = new GregorianCalendar(year, month, 1);
		while(c.get(Calendar.DAY_OF_WEEK) != day) {
			c.roll(Calendar.DAY_OF_YEAR, false);
		}
	}

	@Override
	public boolean hasNext() {
		c.roll(Calendar.WEEK_OF_YEAR, true);
		return c.get(Calendar.MONTH) == month;
	}

	@Override
	public Calendar next() {
		return c;
	}

	@Override
	public void remove() {

	}

	@Override
	public Iterator<Calendar> iterator() {
		return this;
	}

	public static void main(String[] args) {
		DaysToRemember notForget = new DaysToRemember(Calendar.SUNDAY, 3, 2011);
		System.out.println("Hipotetycznie wolne: \n");
		for (Calendar a : notForget)
			System.out.printf("%1$td.%1$tm.%1$tY\n", a);

		notForget.setDayWeek(Calendar.MONDAY);
		System.out.println("\nGUI: \n");
		for (Calendar a : notForget)
			System.out.printf("%1$td.%1$tm.%1$tY\n", a);

		notForget.setDayWeek(Calendar.TUESDAY);
		System.out.println("\nnot GUI: \n");
		for (Calendar a : notForget)
			System.out.printf("%1$td.%1$tm.%1$tY\n", a);

		notForget.setDayWeek(Calendar.THURSDAY);
		System.out.println("\nMały piatek: \n");
		for (Calendar a : notForget)
			System.out.printf("%1$td.%1$tm.%1$tY\n", a);

		notForget.setDayWeek(Calendar.FRIDAY);
		System.out.println("\nPiatek: \n");
		for (Calendar a : notForget)
			System.out.printf("%1$td.%1$tm.%1$tY\n", a);
	}
}
