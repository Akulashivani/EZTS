package Vehicle_oops;

public class Main {
	public static void main(String[] args) 
	{
		Master vehicle = new Master(2010,999,"red");
		System.out.println(vehicle.toString());
		vehicle.Masterout();
		
		Bike b = new Bike(2010,00,"blue","Sports");
		System.out.println(b.toString());
		b.Bikeout();
		Car c = new Car(2011,486,"pink","Diesel");
		System.out.println(c.toString());
		c.CarOut();
		Bus s = new Bus(2011,00,"pink",54);
		System.out.println(s.toString());
		s.BusOut();
	}
}
	
