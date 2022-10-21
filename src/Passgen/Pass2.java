package Passgen;

public class Pass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passw generator = new Passw();
		String upperCase, lowerCase, symbols, numbers, resultPassword = "";
		int characterNum;
		upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		lowerCase = "abcdefghijklmnopqrstuvwxyz";
		symbols = "!@#$%^&*()_+-*/?<>";
		numbers = "1234567890";
		String answer;
		Scanner in = new Scanner(System.in);
		
		do {
		
		System.out.println("Would you like to include Lower case?:"
				+ "If the Answer is Yes, Write how many you would like"
				+ "If the Answer is No, Write 0, Please");
		answer = in.next();
		if (answer.equalsIgnoreCase("Yes")){
			System.out.println("Great Decision Your Password Will Be Strong");
		} else if (answer.equalsIgnoreCase("No")){
			System.out.println("It's fine. Let's continue");
		} else  {
			System.out.println("Error!!! You must type Yes or No");
		}
		
		System.out.println("Would you like to include Upper case?:"
				+ "If the Answer is Yes, Write how many you would like"
				+ "If the Answer is No, Write 0, Please");
		answer = in.next();
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("Great Decision Your Password Will Be Strong");
		} else if (answer.equalsIgnoreCase("No")){
			System.out.println("It's fine. Let's continue");
		}else {
			System.out.println("Error!!! You must type Yes or No");
		}
		
		System.out.println("Would you like to include Symbols?: Yes || No"
				+ "If the Answer is Yes, Write how many you would like"
				+ "If the Answer is No, Write 0, Please");
		answer = in.next();
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("Great Decision Your Password Will Be Strong");
		} else if (answer.equalsIgnoreCase("No")){
			System.out.println("It's fine. Let's continue");
		}else {
			System.out.println("Error!!! You must type Yes or No");
		}
		
		System.out.println("Would you like to include Numbers:  Yes || No");
		answer = in.next();
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("Great Decision Your Password Will Be Strong");
		} else if (answer.equalsIgnoreCase("No")){
			System.out.println("It's fine. Let's continue");
		}else {
			System.out.println("Error!!! You must type Yes or No");
		}
		
		System.out.println("Your new Password is: "+resultPassword);
		
		System.out.println("Would you like to get another one?: Yes || No");
		
	}while(answer.equalsIgnoreCase("Yes"));
	
	if (answer.equalsIgnoreCase("No")) {
		System.out.println("Thank you for Use our program");
	} else {
		System.out.println("Error!!! You must type Yes or No");
	}
	}
}
	}

}
