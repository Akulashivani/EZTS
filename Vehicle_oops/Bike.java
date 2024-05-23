package Vehicle_oops;

public class Bike extends Master {
	private String Type;
	
	public Bike(int model,int engine,String color,String type) {
		super(model,engine,color);
		Type = type;
		
	}
     
     @Override
	public String toString() {
		return "Bike [Type=" + Type + "]";
		   
	}
     
     void Bikeout() {
    	 super.Masterout();
    	 System.out.println("Type ="+Type);
     }
     
 
	

}
