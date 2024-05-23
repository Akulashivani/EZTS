package Vehicle_oops;

public class Bus extends Master {
	public int seats;
	
	public Bus(int Model,int engine,String color,int seats); {
		super(Model,engine,color);
		this.seats = seats;
	}
	

	@Override
	public String toString() {
		return "Bus [seats=" + seats + "]";
	}


	void BusOut() {
		super.Masterout();
		System.out.println("seats:"+seats);
	}
	
}
