/*
Problem Statement: Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/
class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        //Declarations
        int[] initialPosition =  {0,0};
        int[] finalPosition =    {0,0};
        
        
        for(int count=0; count<=moves.length()-1; count++)
        {
            char currentMove = moves.charAt(count);
            finalPosition = changeThePositionOfTheCoordinate(finalPosition,currentMove);
        }
        System.out.println("Initial Position is->"+Arrays.toString(initialPosition));
        System.out.println("Final Position is->"+Arrays.toString(finalPosition));
        if(Arrays.equals(initialPosition,finalPosition))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int[] changeThePositionOfTheCoordinate(int[]finalPosition,char currentMove )
    {
        if(currentMove=='R')
        {
            finalPosition[1]=finalPosition[1]+1; 
        }
        else if(currentMove=='L')
        {
             finalPosition[1]=finalPosition[1]-1; 
        }
        else if(currentMove=='U')
        {
             finalPosition[0]=finalPosition[0]+1; 
        }
        else if (currentMove=='D')
        {
             finalPosition[0]=finalPosition[0]-1; 
        }
        else
        {
            System.out.println("Undefined move->"+currentMove);
            System.exit(1);
        }
        
            
        return   finalPosition;
    }
}
