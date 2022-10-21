package Passgen;

import java.util.Scanner;


public class Pass1 {

	public static void main(String[] args) {
		
		 /*String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		return new String(password);*/
		
		
		
		
		Pass1 generator = new Pass1();
		String upperCase, lowerCase, symbols, numbers, resultPassword = "";
		int characterNum;
		upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		lowerCase = "abcdefghijklmnopqrstuvwxyz";
		symbols = "!@#$%^&*()_+-*/?<>";
		numbers = "1234567890";
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Welcome Our Password Generator");
		
		System.out.println("");
		
		System.out.println("Would you like to include Upper case?\n"
				+ "If the Answer is Yes, Write how many you would like\n"
				+ "If the Answer is No, Write 0, Please\n");
		characterNum = in.nextInt();
		resultPassword = generator.randPassword(resultPassword, upperCase, characterNum);
		
		System.out.println("Would you like to include Lower case?\n"
				+ "If the Answer is Yes, Write how many you would like\n"
				+ "If the Answer is No, Write 0, Please\n");
		characterNum = in.nextInt();
		resultPassword = generator.randPassword(resultPassword, lowerCase, characterNum);
	
		
		System.out.println("Would you like to include Symbols?\n"
				+ "If the Answer is Yes, Write how many you would like\n"
				+ "If the Answer is No, Write 0, Please\n");
		characterNum = in.nextInt();
		resultPassword = generator.randPassword(resultPassword, symbols, characterNum);
	
		System.out.println("Would you like to include Numbers\n?"
				+ "If the Answer is Yes, Write how many you would like\n"
				+ "If the Answer is No, Write 0, Please\n");
		characterNum = in.nextInt();
		resultPassword = generator.randPassword(resultPassword, numbers, characterNum);
	
		System.out.println("Your password is: " +resultPassword);
		
	}
		public String randPassword(String resultPassword,String words, int num) {
			String[] arrayWord = words.split("");
			int randNum = 0;
			for (int i = 0; i < num; i++);{
				randNum = (int)(Math.random() * (arrayWord.length-1) + 0);
					
				
				resultPassword = resultPassword + arrayWord[randNum];
			}
			
			return resultPassword;
		}
}
	


