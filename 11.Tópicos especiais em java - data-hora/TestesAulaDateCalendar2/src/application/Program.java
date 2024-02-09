package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //  Formato UTC
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		// Calendario já com a data instanciada
		cal.setTime(d);
		
		
		// ---- Somando uma unidade de tempo ----
		// Acrescentar 4 horas na data
		cal.add(Calendar.HOUR_OF_DAY, 4);
		// Atualiza variavel d
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		System.out.println("\n----------------------\n");
		
		// ---- Obtendo uma unidade de tempo ----
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
}
