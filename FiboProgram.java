/*
Problem Statement:
Print the famous Fibonacci series.
0,1,1,2,3,5,8,13,21,34,55....
*/

class FiboProgram
{
	public static void main(String args[])
	{

	    //Predefined declarations
	    int prevPrevEntry = 0; 
		int prevEntry = 1; 
		
		//Usual declarations
		int currentSum = 0; 
			
		for(int count=0; count<=10; count++)
		{
			//Printing the 0th iteration
			if(count==0)
			{
				System.out.println("Iteration Number->"+count);
				System.out.println("currentSum ->"+0);
				System.out.println("\n");
				continue;
			}
			
			//Printing the 1st iteration
			if(count==1)
			{
				System.out.println("Iteration Number->"+count);
				System.out.println("currentSum ->"+1);
				System.out.println("\n");
				continue;
			}
			
			//From 2nd iteration, use this procedure 
			System.out.println("Iteration Number->"+count);
			currentSum = prevPrevEntry+prevEntry; 
		    System.out.println("currentSum ->"+currentSum);
			System.out.println("\n");	
			prevPrevEntry = prevEntry;
			prevEntry = currentSum;
			
	    }
	}
}



