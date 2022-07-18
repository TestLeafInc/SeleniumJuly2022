package week1.day2;

public class OnePlus {
	
	
	// anyone can access --> within the project or outside the project
	public String getPhoneColor() {
		return "Blue";
	}
	
	// only the class can access
	private String getIMEI() {
		return "18XJDKS829";
	}
	
	// only the classes within the package 
	long getPhoneNumber() {
		return 9500009202l;
	}
	
	public void switchOff() {
		System.out.println("Phone switched off");
	}

}
