import java.util.*;
public class Flights {

	private String city;
	private String arrCity;
	private String depTime;
	private String arrTime;
	private String date;
	private String duration;
	private String type;
	private String cost;
	private String totalSeats;
	private String availableSeats;
	private String seats;
	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}
	static ArrayList<Flights> flights = new ArrayList<>();
	
public ArrayList<Flights> getFlights() {
		return flights;
	}

	public void setFlights(ArrayList<Flights> flightss) {
		flights = flightss;
	}

public Flights(String city, String arrCity, String depTime, String arrTime, String date, String duration,
		String type, String cost, String totalSeats, String availableSeats,String seats) {
	this.city = city;
	this.arrCity=arrCity;
	this.depTime = depTime;
	this.arrTime = arrTime;
	this.date = date;
	this.duration = duration;
	this.type=type;
	this.cost=cost;
	this.totalSeats = totalSeats;
	this.availableSeats = availableSeats;
	this.seats=seats;
}
Flights(){
	
}

public String getCost() {
	return cost;
}

public void setCost(String cost) {
	this.cost = cost;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
public String getArrCity() {
	return arrCity;
}

public void setArrCity(String arrCity) {
	this.arrCity = arrCity;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public String getDepTime() {
	return depTime;
}
public void setDepTime(String depTime) {
	this.depTime = depTime;
}
public String getArrTime() {
	return arrTime;
}
public void setArrTime(String arrTime) {
	this.arrTime = arrTime;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(String totalSeats) {
	this.totalSeats = totalSeats;
}
public String getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(String availableSeats) {
	this.availableSeats = availableSeats;
}

}
