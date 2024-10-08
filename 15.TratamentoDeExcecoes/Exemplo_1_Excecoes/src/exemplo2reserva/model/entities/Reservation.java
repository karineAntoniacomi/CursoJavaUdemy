package exemplo2reserva.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

// Solu��o 1: MUITO RUIM�
// Solu��o 2: RUIM�
// Solu��o 3: BOA

public class Reservation {
	
	private Integer roomNumber;	
	private Date checkIn;	
	private Date checkOut;	
	
	// static p/ n�o ser instanciado um novo objeto SimpleDateFormat p/ cada objeto reservation	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {	
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date.");
		}
		this.roomNumber = roomNumber;	
		this.checkIn = checkIn;		
		this.checkOut = checkOut;	
	}	
	
	public Integer getRoomNumber() {	
		return roomNumber;
	}	
	
	public void setRoomNumber(Integer roomNumber) {	
		this.roomNumber = roomNumber;	
	}		
	
	public Date getCheckIn() {	
		return checkIn;	
	}	
	
	public Date getCheckOut() {	
		return checkOut;	
	}		
	
	// Calcula a diferen�a entre duas datas em milissegundos	
	public long duration() {		
		// getTime devolve a qnttd de milissegundos da data		
		long diff = checkOut.getTime() - checkIn.getTime();	
		
		// Converter milissegundos p/ dias		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);	
	}	
	
	public void updateDates(Date checkIn, Date checkOut) {	
		// Impede que sejam digitadas datas anteriores a data atual (SOLU��O RUIM)
		Date now = new Date(); // Cria data com hor�rio de agora
		
		if(checkIn.before(now) || checkOut.before(now)) {
			// IllegalArgumentException - quando argumentos passados para o m�todo s�o inv�lidos
			throw new DomainException("Reservation dates for update must be future dates.");
		// Verifica se a data de checkout n�o � posterior ao checkin
		} 
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date.");
		}
					
		// checkIn do Objeto recebe o checkIn que veio como argumento	
		this.checkIn = checkIn;		
		this.checkOut = checkOut;	
		// Se retornar null n�o houve erro, caso retorne String, deu algum erro.
	}
	
	@Override
	public String toString() {	
		return 	
		"Room " + roomNumber		
		+ ", check-in: " + sdf.format(checkIn)		
		+ ", check-out: " + sdf.format(checkOut)		
		+ ", " + duration()		
		+ " nights";	
	}
}
