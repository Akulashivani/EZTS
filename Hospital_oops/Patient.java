package Hospital_oops;

public class Patient extends Person{
	private String Disease;
	private int Bedno;
	
	public Patient(String name,int age,String gender,String disease,int bedno) {
		super(name,age,gender);
		this.Disease=disease;
		this.Bedno=bedno;
	}
	
	
		
		@Override
	public String toString() {
		return "Patient [Disease=" + Disease + ", Bedno=" + Bedno + "]";
	}



		void PatientOut() {
			super.PersonOut();
			System.out.println("Disease="+ Disease);
			System.out.println("Bedno="+Bedno);
		}

}
