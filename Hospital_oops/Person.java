package Hospital_oops;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person(String n,int a,String g) {
		this.name=n;
		this.age=a;
		this.gender=g;
	}
		
		
		@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}


		void PersonOut() {
			
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Gender="+gender);
	}

}
