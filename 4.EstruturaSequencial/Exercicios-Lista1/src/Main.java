import java.util.Locale;

public class Main {

	public static void main(String args[]) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;

		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;

		System.out.printf("Products: \n" + "%s which price is $ %.2f%n" + "%s which price is $ %.2f%n", product1,
				price1, product1, price2);

		System.out.printf("\nRecord: %d years old, code %d and gender: %c%n", age, code, gender);

		System.out.printf("\nMeasue with eight decimal places: %.8f%n" + "Roudes (three decimal places:  %.3f%n"
				+ "US decimal point: %.3f", measure, measure, measure);

	}

}