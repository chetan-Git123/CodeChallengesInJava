/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

Example 2:
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/


class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        //Dealing with an empty string
        if(s.equals(""))
        {
           return 0; 
        }
        
        //Dealing with empty strings with white space
        String checkingForWhiteSpace = s.replaceAll("\\s+","");
        if(checkingForWhiteSpace.length()==0)
        {
            return 1;
        }
        
        //Deling with strings which have lenhgth 1
        if(s.length()==1)
        {
            return 1;
        }
        
        //Other usecases. 
        /* Cosnider each substring. For each, get the biggest length of the substring*/
        int largestSubstringOfSpecificSubstring=0;
        int largestSubstringCandidate=1;
        
        for(int subStringCount=0; subStringCount<=s.length()-2; subStringCount++  )
        {
            largestSubstringOfSpecificSubstring = lengthOfTheLargestSubstringForThisIteration(s.substring(subStringCount));
            if(largestSubstringOfSpecificSubstring>=largestSubstringCandidate)
            {
                largestSubstringCandidate = largestSubstringOfSpecificSubstring;
            }
        }
        return largestSubstringCandidate ;
    }
    
     public int lengthOfTheLargestSubstringForThisIteration(String specificSubstring)
     {     
         int lengthOfLongestSubstring=1;
         for(int iterationCount=0,secondPointer=2; iterationCount<=specificSubstring.length()-2; iterationCount++)
         {
            if(iterationCount==0)
            {
               if( specificSubstring.charAt(iterationCount)==specificSubstring.charAt(iterationCount+1) )
               {
                   break;
               }
               else
               { 
                   lengthOfLongestSubstring++;
                   continue;
               }
                  
            }
            else
            {
               if(  specificSubstring.substring(0,secondPointer).contains(Character.toString(specificSubstring.charAt(secondPointer)))  ) 
                  {
                      break;
                  }
                else
                  {
                     secondPointer++;
                     lengthOfLongestSubstring++;
                     continue; 
                  }
                  
            }
        }
        return lengthOfLongestSubstring;
        
     }
    
    
}
