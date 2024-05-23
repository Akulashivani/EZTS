package Hospital_oops;

public class Nurse extends Person {
	private int Roomno;
	private int Floor;
	 
	public Nurse(String name,int age,String gender,int roomno,int floor) {
		super(name,age,gender);
		this.Roomno=roomno;
		this.Floor=floor;
	}
		
		void NurseOut() {
			super.PersonOut();
			System.out.println("Roomno="+Roomno);
			System.out.println("Floorno="+Floor);
			
		}
}
