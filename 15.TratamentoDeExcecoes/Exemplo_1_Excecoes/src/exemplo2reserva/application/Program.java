package exemplo2reserva.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exemplo2reserva.model.entities.Reservation;
import model.exceptions.DomainException;

//Solução 1: MUITO RUIM 
//Solução 2: RUIM 
//Solução 3: BOA 

public class Program {
	
	public static void main(String[] args) {		
	
		Scanner sc = new Scanner(System.in);			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		try {		
			// Leitura dos Dados
			System.out.print("Room number: ");	
			int number = sc.nextInt();			
			System.out.print("Check-in date (dd/MM/yyyy): ");	
			Date checkIn = sdf.parse(sc.next());			
			System.out.print("Check-out date (dd/MM/yyyy): ");		
			Date checkOut = sdf.parse(sc.next());			
		
			// Exibe dados lidos
			Reservation reservation = new Reservation(number, checkIn, checkOut);			
			System.out.println("Reservation: " + reservation);				
			System.out.println();					
		
			// Leitura dos Dados da Atualizaçãop de reserva
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");		
			checkIn = sdf.parse(sc.next());				
			
			System.out.print("Check-out date (dd/MM/yyyy): ");	
			checkOut = sdf.parse(sc.next());	
				
			// Atualiza datas caso não haja nenhum erro			
			reservation.updateDates(checkIn, checkOut);	
			System.out.println("Reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format.");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error.");
		}
		
		sc.close();
	}
}