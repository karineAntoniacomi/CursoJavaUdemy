package exemplo2reserva.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exemplo2reserva.model.entities.Reservation;

//Solução 1: MUITO RUIM  

public class Program {
	//throws ParseException : propaga/ delega o tratamento de 
	//  exceções p/ um outro método que chame ou também propague este	
	public static void main(String[] args) throws ParseException {		
		Scanner sc = new Scanner(System.in);	
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		System.out.print("Room number: ");	
		int number = sc.nextInt();			
		System.out.print("Check-in date (dd/MM/yyyy): ");	
		Date checkIn = sdf.parse(sc.next());			
		System.out.print("Check-out date (dd/MM/yyyy): ");		
		Date checkOut = sdf.parse(sc.next());			
	
		// Data de Check-Out deve ser posterior a data de Check-in	
		// after é um método de Date que testa se uma data é depois de outra	
		if (!checkOut.after(checkIn)) {			
			System.out.println("Error in reservation: Check-out date must be after check-in date.");
		} else {		
			Reservation reservation = new Reservation(number, checkIn, checkOut);			
			System.out.println("Reservation: " + reservation);				
			System.out.println();			
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");		
			checkIn = sdf.parse(sc.next());				
			
			System.out.print("Check-out date (dd/MM/yyyy): ");	
			checkOut = sdf.parse(sc.next());	
	
			// Impede que sejam digitadas datas anteriores a data atual (SOLUÇÃO RUIM)
			Date now = new Date(); // Cria data com horário de agora
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates.");
			// Verifica se a data de checkout não é posterior ao checkin
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date.");
			} else {			
			// Atualiza datas caso não haja nenhum erro			
			reservation.updateDates(checkIn, checkOut);	
			System.out.println("Reservation: " + reservation);
			}		
		}
		sc.close();
	}
}