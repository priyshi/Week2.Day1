package week2.day1;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not   
		/*
		 * Pseudo Code		
		 * a) Declare A String value as"madam"		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 	 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	public static void main(String[] args) {
 
		 String str="madam";
		 String revvalue="";
		 for (int i=str.length()-1; i>=0; i--) {
			 revvalue = revvalue + str.charAt(i);
			}
			
			System.out.println("Reversed String : "+revvalue);
			
			if(str.equals(revvalue)) {
				System.out.println(str+" is Palindrome String.");
			}else {
				System.out.println(str+" is not a Palindrome String.");
		}
		

	}

}
