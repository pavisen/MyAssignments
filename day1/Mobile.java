package week1.day1;

public class Mobile {
	
	String mobileModel;
	float mobileWeight;
	
	boolean isFullyCharged;
	int mobileCost;
	
	public void makeCall() {
		
		mobileModel = "apple iphone";
		mobileWeight = 150.5f;
		
		System.out.println("making a call...");
		
	}
	
	public void sendMsg() {
		
		isFullyCharged = true;
		mobileCost = 50000;
		
		System.out.println("Sending a message");
		
	}
	
	public static void main(String[]args) {
		
		Mobile myMobile = new Mobile();
		
		myMobile.makeCall();
		myMobile.sendMsg();
		
		System.out.println("This is my mobile");
	}
		
	}

