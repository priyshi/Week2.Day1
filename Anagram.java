package week2.day1;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		String text1 = "stops";
	    String text2 = "potss"; 
	    if (text1.length() == text2.length()) {

			System.out.println("Length of the strings are equal : " + text1.length());

			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			text1 = String.valueOf(arr1); 
			text2 = String.valueOf(arr2);

			System.out.println("Sorted array: " + text1);
			System.out.println("Sorted array : " + text2);

			if (text1.equals(text2)) {
				System.out.println("Strings are Equal");
			} else {
				System.out.println("Strings Not Equal");
			}
		} else {
			System.out.println("Length of the strings are not equal. ");
		}

	}

}
