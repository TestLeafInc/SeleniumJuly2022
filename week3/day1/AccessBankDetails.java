package week3.day1;

public class AccessBankDetails {

	public static void main(String[] args) {
		
		
		MyBank bnk = new MyBank();
		
		MyBank.acctNumber = "00002992920DJS";
		System.out.println(MyBank.acctNumber);
		
		System.out.println(bnk.getCreditCard());

	}

}
