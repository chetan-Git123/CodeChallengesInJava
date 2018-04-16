import java.util.Arrays;
/*
Problem Statement: Input 2 Strings. Return true if they are anagrams. Retrurn false otherwise.
*/
class ProgramAnagram
{
 public static void main(String args[])
 {
  boolean isAnagram = isAnagram("rail safety","fairy tales");
  System.out.println("Anagram status is->"+isAnagram);
 }
 
 public static boolean isAnagram(String s1, String s2)
 {	 
  s1 = s1.replaceAll("\\s","");
  s2 = s2.replaceAll("\\s","");
  if(s1.length()!=s2.length())
  {
	System.out.println("Length of the 2 Strings are Not equal. So they cannot be anagrams");
	return false;
  }
  char[] s1AsCharArray = s1.toCharArray();
  char[] s2AsCharArray = s2.toCharArray();
  Arrays.sort(s1AsCharArray);
  Arrays.sort(s2AsCharArray);
  System.out.println("s1AsCharArray) is->"+Arrays.toString(s1AsCharArray));
  System.out.println("s2AsCharArray) is->"+Arrays.toString(s2AsCharArray));
  if(Arrays.equals(s1AsCharArray,s2AsCharArray))
  {
   return true;
  }
  else
  {
  return false;
  }
 }
}
