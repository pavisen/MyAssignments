package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		
		int input =235;
		int output =0;
		for (int i = input; i >0; i=i/10) {
			
			int lastNum =i%10;
			output=(output*10)+lastNum;
		}
			System.out.println(output);
		}
			
		}

