/*

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:


'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

 

Example 1:

Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".
Example 2:

Input: words = ["a"]
Output: 1
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 12
words[i] consists of lowercase English letters.

*/

class Solution 
{
    public int uniqueMorseRepresentations(String[] words) 
    {
        //Declarations
        Set<String> transformedWords = new TreeSet<String>();
        
        //Convert each word into morse code. Save the morse code into a TreeSet
        for(int count=0; count<=words.length-1; count++)
        {
            String currentWordInMorseCode = convertWordInMorseCode(words[count]);
            transformedWords.add(currentWordInMorseCode);
        }
        
        return transformedWords.size();
          
    }
    
    public String convertWordInMorseCode(String specificWord)
    {
        String[] morseCodeLib = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character, String> morseCodeMap = new HashMap<Character,String>();
        morseCodeMap.put('a',morseCodeLib[0]); morseCodeMap.put('b',morseCodeLib[1]); 
        morseCodeMap.put('c',morseCodeLib[2]); morseCodeMap.put('d',morseCodeLib[3]); 
        morseCodeMap.put('e',morseCodeLib[4]); morseCodeMap.put('f',morseCodeLib[5]); 
        morseCodeMap.put('g',morseCodeLib[6]); morseCodeMap.put('h',morseCodeLib[7]);
        morseCodeMap.put('i',morseCodeLib[8]); morseCodeMap.put('j',morseCodeLib[9]); 
        morseCodeMap.put('k',morseCodeLib[10]); morseCodeMap.put('l',morseCodeLib[11]); 
        morseCodeMap.put('m',morseCodeLib[12]); morseCodeMap.put('n',morseCodeLib[13]); 
        morseCodeMap.put('o',morseCodeLib[14]); morseCodeMap.put('p',morseCodeLib[15]);
        morseCodeMap.put('q',morseCodeLib[16]); morseCodeMap.put('r',morseCodeLib[17]); 
        morseCodeMap.put('s',morseCodeLib[18]); morseCodeMap.put('t',morseCodeLib[19]); 
        morseCodeMap.put('u',morseCodeLib[20]); morseCodeMap.put('v',morseCodeLib[21]); 
        morseCodeMap.put('w',morseCodeLib[22]); morseCodeMap.put('x',morseCodeLib[23]);
        morseCodeMap.put('y',morseCodeLib[24]); morseCodeMap.put('z',morseCodeLib[25]);
        String specificWordInMorseCode = "";
        for(int count=0; count<=specificWord.length()-1;count++)
        {
            char specificCharacter = specificWord.charAt(count);   
            specificWordInMorseCode = specificWordInMorseCode+morseCodeMap.get(specificCharacter);
        }
        return specificWordInMorseCode;
    }
}
