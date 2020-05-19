import java.util.ArrayList; 
import java.util.List; 

/*Is Scrambled Palindrome
Write a function that, given a string of letters, returns true or false for whether the letters in the string could be arranged to form a palindrome.
E.g. For “torro”, the answer is True, because the letters can be rearranged to spell “rotor”.
*/

class ScatteredPalidrome
{
	public static void main(String args[])
	{
		String inputString = "hajjah";
		System.out.println("Input Sring is->"+inputString);
		System.out.println("Is input String palindrome->"+isInputStringPalindrome(inputString));
	}
	
	public static boolean isInputStringPalindrome(String inputString)
	{
		//Decalring a List of Characters
		List<Character> monitorList = new ArrayList<Character>();
		
		/* Traverse through all characters of the String. If the character is Not present in the List, include it in the List. 
		   If the character is in the List, then remove that character. 
		   To qualify as a scattered palindrome, for a String with odd number of characters, the length of the monitoring List should be 1.
                   To qualify as a scattered palindrome, for a String with even number of characters, length of the monitiring list should be 0.	   
		*/
		for(int count=0; count<inputString.length(); count++)
		{
			if ( monitorList.contains(inputString.charAt(count)) )
			{
				monitorList.remove( (Character)inputString.charAt(count) );
			}
			else
			{
				monitorList.add( inputString.charAt(count) );
			}
		}
		
		if(inputString.length()%2==0 && monitorList.isEmpty())
		{
			return true;
		}
		
		if(inputString.length()%2==1 && monitorList.size()==1)
		{
			return true;
		}
		
		return false;
		
	}
	
	
}
