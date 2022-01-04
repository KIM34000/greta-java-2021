package array;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Scanner;

public class palidrome {
		
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//asking about write word
		System.out.println("write your word ");	
		// when is the scanner worl save here "word"
		String word = scanner.nextLine();
		String lowercaseword = word.toLowerCase();
		//worl length save to wordlength
		int wordlength =  word.length();
		// System.out.println(wordlength+word);
		//declair array
		char arr[];		
		//create array and seet length
		arr = new char[wordlength];
		//split of word and put each letter in to the array
		for(int i =0; i < wordlength; i++) {
		  arr[i] = lowercaseword.charAt(i);
		}
		// check for palidrome
		int count = 0;
		for(int i = 0; i < wordlength; i++) {
			// check first carecter of the array with last one
			// arr[0] == arr [4]
			// arr[1] == arr [3]
			//arr[i] == arr[wordlength -1-i]; 
			
			if(arr[i] == arr[wordlength -1-i]) {
				count++;
			}
		}
		if(count == wordlength) {
			System.out.println(word +" is a palindrome");
		}else {
			System.out.println(word +" is not a palindrome");
		}
	}

}
