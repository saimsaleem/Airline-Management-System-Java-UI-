import java.util.*;
public class Passenger {

	private String name;
	private String age;
	private String cnic;
	private String password;
	private int seatnumber;
	private String username;
	private String seats;
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	static ArrayList<Flights> flight = new ArrayList<Flights>();
	static ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(ArrayList<Passenger> passengerss) {
		passengers = passengerss;
	}
	
	public ArrayList<Flights> getFlight() {
		return flight;
	}
	public void setFlight(ArrayList<Flights> flight) {
		this.flight = flight;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	
public Passenger(String name, String age, String cnic, String password, String username) {
		this.name = name;
		this.age = age;
		this.cnic = cnic;
		this.password = password;
		this.username=username;
	}
Passenger(){
}

}
