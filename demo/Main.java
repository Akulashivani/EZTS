package demo;

import java.Vehicle;

public class Main {
	public static void main(String[] args ) {
		Vehicle vh = new Vehicle();
		vh.Model= 2010;
		vh.engine=999;
		vh.color= "Red";
		System.out.println(vh.Model + " "+" "+vh.engine+" "+" "+vh.color);
	}			

}
