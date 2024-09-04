package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// Data no formato UTC -> timezone GMT
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		// Operação parse recebe um dado no formato de string e converte na data formatada 
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		// Data com instante atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		// Passando número de milisegundos qualquer
		Date x3 = new Date(0L);
		// 1 segundo tem mil milisegundos * 60 = 1 min * 60 = 1 hora
		Date x4 = new Date(1000L * 60L * 60L * 5L); // Data = 5 da manhã de 1970
		
		// Data instanciada no formato ISO 8601 no padrão UTC
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("------------------------");
		System.out.println("y1: " + y1);
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + y2);
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));

		System.out.println("\nx1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		
		System.out.println("------------------------");
		System.out.println("y1: " + y1);
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + y2);
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

		System.out.println("\nx1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
	}
}
