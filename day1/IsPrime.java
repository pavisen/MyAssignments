package week2.day1;

public class IsPrime {
	static void Number(int num) {
		for (int i = 2; i <=2 ; i++) {
			if(num%i ==0) {
				
				System.out.println(num + " is prime number");
			}
			
			else {
				
				System.out.println((num+" is not a prime number"));
			}
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsPrime obj = new IsPrime();
		obj.Number(10);
		obj.Number(9);

	}

}
