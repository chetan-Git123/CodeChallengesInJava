/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
        return false;
        }
        
        if(x<10)
        {
            return true;
        }
        
        //Declarations
        String inputIntegerAsString = Integer.toString(x);
        int lengthOfInputString = inputIntegerAsString.length();
        char[] reverseCharArray = new char[lengthOfInputString];
        
        //Reverse the string
        for(int count=0, anotherCount=lengthOfInputString-1; count<=inputIntegerAsString.length()-1; count++,anotherCount--)
        {
            reverseCharArray[anotherCount] = inputIntegerAsString.charAt(count);
        }
        String reversedString = new String(reverseCharArray);
        if( inputIntegerAsString.equals(reversedString) )
        {
            return true;
        }
        
        return false;
        
        
    }
}
