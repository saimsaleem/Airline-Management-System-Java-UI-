
public class RunApp {
public static void main(String[] args) {
	Flights flights = new Flights();
	Flights flight1 = new Flights("Islamabad","Lahore","09:00","10:00","18-12-2021","60 min","Local","5,000","60","60","0");
	Flights flight2 = new Flights("Lahore", "NewYork", "00:00", "14:00", "20-12-2021", "14 hrs", "International","80,000", "60", "60","0");
	flights.getFlights().add(flight1);
	flights.getFlights().add(flight2);
	Passenger schedule = new Passenger();
	Passenger user1 = new Passenger("Saim Saleem","20","1234567890123","plastic123","saim");
	schedule.getPassengers().add(user1);
	Start start = new Start();
	start.setVisible(true);
}
}
