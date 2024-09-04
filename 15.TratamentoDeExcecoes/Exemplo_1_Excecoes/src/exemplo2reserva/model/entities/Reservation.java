package exemplo2reserva.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Solução 1: MUITO RUIM 
public class Reservation {
	private Integer roomNumber;	
	private Date checkIn;	
	private Date checkOut;	
	
	// static p/ não ser instanciado um novo objeto SimpleDateFormat p/ cada objeto reservation	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {	
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
	
	// Calcula a diferença entre duas datas em milissegundos	
	public long duration() {		
		// getTime devolve a qnttd de milissegundos da data		
		long diff = checkOut.getTime() - checkIn.getTime();	
		
		// Converter milissegundos p/ dias		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);	
	}	
	
	public void updateDates(Date checkIn, Date checkOut) {		
		// checkIn do Objeto recebe o checkIn que veio como argumento	
		this.checkIn = checkIn;		this.checkOut = checkOut;		
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
