package week1.day1;

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car toyota = new Car();
		Bike unicorn = new Bike();
		
		toyota.applyBrake();
		toyota.soundHorn();
		
		System.out.println("Bike class members" + unicorn.brakes + unicorn.tyres);
		

	}
	
	String brakes = "Strong Brakes";
	int tyres =2;		

}
