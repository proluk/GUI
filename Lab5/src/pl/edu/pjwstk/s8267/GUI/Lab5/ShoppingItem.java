package pl.edu.pjwstk.s8267.GUI.Lab5;

public class ShoppingItem {
	protected String nazwa;
	protected double cena;

	public ShoppingItem(String nazwa, double cena) {
		this.nazwa = nazwa;
		this.cena = cena;
	}

	public void show(int nr) {
		System.out
				.println(String.format("%3d. %20s %6.2f zł", nr, nazwa, cena));
	}

	public static void printFooter(ShoppingItem[] items) {
		double total = 0;
		for (ShoppingItem i : items)
			total += i.cena;
		System.out.println("------------------------------------");
		System.out.println(String.format("%25s %.2f zł", "RAZEM:", total));
	}

	public static void main(String args[]) {
		ShoppingItem[] items = { new ShoppingItem("pieczywo", 4.3),
				new ShoppingItem("gazety", 9.2),
				new ShoppingItem("warzywa", 12.55),
				new ShoppingItem("mieso", 23),
				new ShoppingItem("kosmetyki", 121.50) };
		for (int i = 0; i < items.length; i++)
			items[i].show(i + 1);
		printFooter(items);
	}
}