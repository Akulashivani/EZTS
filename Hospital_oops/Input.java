package Hospital_oops;

public class Input {
	public static void main(String args[])
	{
		Person p=new Person("Shivani",20,"Female");
		System.out.println(p.toString());
		p.PersonOut();
		Doctor d=new Doctor("Shivani",20,"Female","pediatric");
		System.out.println(d.toString());
		d.DoctorOut();
		Patient pa=new Patient("Shivani",20,"Female","Cancer",23);
		System.out.println(pa.toString());
		pa.PatientOut();
		Nurse n=new Nurse("Shivani",20,"Female",23,3);
		System.out.println(n.toString());
		n.NurseOut();
	}

}
