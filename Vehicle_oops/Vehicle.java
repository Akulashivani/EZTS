package Vehicle_oops;

public class Vehicle {
	int Model;
	int engine;
	String color;
	 
	void VehicleInput(int a,int b,String c) {
		this.Model=a;
		this.engine=b;
		this.color=c;
	}
	void VehicleOutput() {
		System.out.println("model="+this.Model);
		System.out.println("engine="+this.engine);
		System.out.println("color="+this.color);
	}
		
}
	
