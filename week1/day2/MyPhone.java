package week1.day2;

public class MyPhone {
	
	public static void main(String[] args) {
		
		// ClassName obj_name = new ClassName(); // object is created 
		OnePlus myPhone = new OnePlus();
		
		// Call a method
		String phoneColor = myPhone.getPhoneColor();
		System.out.println(phoneColor);
		
		System.out.println(myPhone.getPhoneNumber());
		
		myPhone.switchOff();

		
	}

}
