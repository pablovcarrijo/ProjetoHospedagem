package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	//CONSTRUCTORS MOTOD
	
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		setRoomNumber(roomNumber);
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	//SETS AND GETS METOD
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

	 //OTHERS METOD
	public long duration() {
		long diff = getCheckOut().getTime() - getCheckIn().getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDate(Date checkIn, Date checkOut) {
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}
	
	//TOSTRING
	public String toString() {
		return "Reservation: Room "
				+ getRoomNumber()
				+ ", check-in: "
				+ sdf.format(getCheckIn())
				+ ", check-out: "
				+ sdf.format(getCheckOut())
				+ ", " + duration() + " nights";
	}
	
	
}
