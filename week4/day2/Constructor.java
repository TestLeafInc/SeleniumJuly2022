package week4.day2;

public class Constructor {
	
	
	{
		System.out.println("I am a block");
		
	}
	
	static {
		System.out.println("I am a static block");

	}
	
	// constructor is a like method
	// does not have a return type
	// name of the method = name of the class
	public Constructor() {
		System.out.println("I am inside a constructor");
	}
	
	public Constructor(String arg) {
		System.out.println("I am inside a constructor with arg ");
	}
	
	// Purpose of the constructor
	// I have common task to perform everytime when I create an object
	
	public static void main(String[] args) {
		System.out.println("I am a main method");
		Constructor con = new Constructor("hello");
	}
	
	// ChromeDriver driver = new ChromeDriver();
	// chrome browser launch !!
	
	/*
	 * ChromeDriver constructor does the following:
	 * 
	 * 1) Find the free port available
	 * 2) Find the chromedriver executable
	 * 3) Launch the chrome binary using API
	 * 
	 */

}

/*
 * 
 *  Execution sequence
 *
 * 1) static block
 * 2) main method
 * 3) object -> block
 * 4) constructor
 * 5) method
 * 
 * 
*/