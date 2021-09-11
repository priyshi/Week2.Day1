package week2.day1;

public class Findtypes {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
	//	int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/

		// Print the count here
		//System.out.println("letter: " + letter);
		//System.out.println("space: " + space);
		//System.out.println("number: " + num);
		//System.out.println("specialCharcter: " + specialChar);


	public static void main(String[] args) {
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		String testString= "$$ Welcome to 2nd Class of Automation $$";
		      
		char[] arr1=testString.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			if(Character.isLetter(arr1[i])) {
		         letter++;
			}
			else if(Character.isDigit(arr1[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(arr1[i]))
			{
				space++;
			}
			else
			{
				specialChar++;
			}
			
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

		}



	}


