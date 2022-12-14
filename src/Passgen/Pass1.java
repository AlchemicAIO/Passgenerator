package Passgen;

import java.util.Scanner;
import java.util.*;


public class Pass1 {

	public static String randPassword(String upperCaseAns, String lowerCaseAns, String symbolsAns, String digitsAns) {


		char[] upperCase = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] lowerCase = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] symbols = new char[]{'!','@','#','$','%','^','&','*','(',')','_','+','-','*','/','?','<','>'};
		char[] digits = new char[]{'1','2','3','4','5','6','7','8','9','0'};

		StringBuilder password = new StringBuilder();
		int typesOfChars = 4;
		int numOfUpperCaseChars = 0;
		int maxLengthOfPassword = 128;
		int minLengthOfPassword = 8;

		int maximumCharsPerType = maxLengthOfPassword / typesOfChars;
		
		// Generate a random number of upper case characters to use in the password
		if(upperCaseAns.equalsTo('y')) {
			// Generate a random number from 0 - 30;
			numOfUpperCaseChars = generateRandomInt(maximumCharsPerType);
		}
		
		password = password.append(generateRandomChars(upperCase, numOfUpperCaseChars))
				.append(generateRandomChars(lowerCase, numLowerCase))
				.append(generateRandomChars(symbols, numSymbols))
				.append(generateRandomChars(digits, numDigits));

		return password.toString();
	}
	
	/** 
	 * Helper function that generates a random string of characters from an array of characters, chars
	 * It generates the number of characters numCharsToGenerate
	 * This function uses generateRandomInt to generate a random integer from 0 to the last index of array chars
	 **/
	public static StringBuilder generateRandomChars(char[] chars, int numCharsToGenerate) {
		int counter = 1;
		int lastArrayIndex = chars.length - 1;
		StringBuilder randomChars = new StringBuilder();
		int index = 0;

		while(counter <= numCharsToGenerate) {
			index = generateRandomInt(lastArrayIndex);
			randomChars = randomChars.append(chars[index]);
			counter++;
		}
		
		return randomChars;
	}

	/**
	 * Helper function that generates a random number from 0 to max
	 */
	public static int generateRandomInt(int max) {
		int min = 0;
		
		// Generates an index between 0 and max, where max is the last index of the array
		int randomInt = (int)Math.floor(Math.random() * (max - min + 1) + min);
		return randomInt;
	}


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome Our Password Generator");
		
		System.out.println("");
		
		System.out.println("Would you like to include Upper case?\n");
		String upperCaseAns = in.nextString();
		
		System.out.println("Would you like to include Lower case?\n");
		String lowerCaseAns = in.nextString();
		
		System.out.println("Would you like to include Symbols?\n");
		String symbolsAns = in.nextString();
	
		System.out.println("Would you like to include Numbers\n?");
		String digitAns = in.nextString();
		
		String resultPassword = randPassword(upperCaseNum, lowerCaseNum, symbolsNum, digitsNum);
	
		System.out.println("Your password is: " +resultPassword);
		
	}

}
	


