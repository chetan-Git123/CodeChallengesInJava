
/*
Problem Statement: Suppose you are given a String of letters, compress this String into its base form. 
Example1- aabbbcccc would return a2b3c4
Example2- abbcc would return ab2c2 (Note that we did not put a1 since 1 would Not provide useful information)
*/
import java.util.*;

class Compression
{
	public static void main(String args[])
	{
		String inputString="ffffcccbbaalzz";
		String compressedString = returnCompressedString(inputString);
		System.out.println("compressedString is->"+compressedString);
	}
	
	public static String returnCompressedString(String inputString)
	{
		//Put all the elements from the input String into a TreeSet. This will sort the collection and remove duplicate elements
		Set<Character> inputSet = new TreeSet<Character>();
		char[] inputStringAsCharArray = inputString.toCharArray();
		for(int count=0; count<=inputStringAsCharArray.length-1; count++)
		{
			inputSet.add(inputStringAsCharArray[count]);
		}
		
		//Convert the input Set into an ArrayList 
                List<Character> inputSetAsList = new ArrayList<Character>(inputSet);
      
		
		//Find the occurence of each unique element in the input String
		List<Integer> occurenceRepository = new ArrayList<Integer>();
		for(int count=0; count<=inputSetAsList.size()-1; count++)
		{
			int numOfOccur = numberOfOccurenceOfCharInInputString(inputStringAsCharArray,inputSetAsList.get(count));
			occurenceRepository.add(numOfOccur);
		}
		System.out.println("inputSetAsList is ->"+inputSetAsList.toString());
		System.out.println("occurenceRepository is ->"+occurenceRepository.toString());
		
		//Combine occurenceRepository & inputSetAsList to construct the final output
		String outputString = "";
		for(int count=0; count<=inputSetAsList.size()-1; count++)
		{
			outputString = outputString+inputSetAsList.get(count).toString();
			if(  occurenceRepository.get(count).toString().equals("1")  )
			{
				continue;
			}
			outputString = outputString+occurenceRepository.get(count).toString();
		}
		return outputString ;
	}
	
	public static int numberOfOccurenceOfCharInInputString(char[] inputStringAsCharArray, char specificChar)
	{
		int numOfOccur=0;
		for(int count=0; count<=inputStringAsCharArray.length-1;  count++)
		{
			if(inputStringAsCharArray[count]==specificChar)
			{
				numOfOccur++;
			}
		}
		return numOfOccur;
	}
	
	
	
	
}
