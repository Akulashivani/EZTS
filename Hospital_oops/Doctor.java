package Hospital_oops;

public class Doctor extends Person {
	private String Speciality;
	
	public Doctor(String name,int age,String gender,String speciality) {
	super(name,age,gender);
	this.Speciality=speciality;
	}		

	@Override
	public String toString() {
		return "Doctor [Speciality=" + Speciality + "]";
	}

	void DoctorOut() {
		super.PersonOut();
		System.out.println("Speciality="+Speciality);
	}
	

}
