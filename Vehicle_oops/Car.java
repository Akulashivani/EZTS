package Vehicle_oops;

public class Car extends Master {
	private String fuelType ;
	
	public Car(int Model,int engine,String color,String fueltype) {
	super(Model,engine,color);
	this.fuelType = fueltype;
	}	
	


	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + "]";
	}



	void CarOut() {
		super.Masterout();
		System.out.println("FuelType ="+fuelType);
	}
}