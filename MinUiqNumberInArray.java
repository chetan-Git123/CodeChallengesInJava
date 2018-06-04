import java.util.Arrays;

class MinUiqNumberInArray
{
	public static void main(String arga[])
	{
		int[] inputArray = {1,1,5,5,1,8,8,3,3};
		int minNum =  minUniqNumberInArray(inputArray);
		System.out.println("minNum is ->"+minNum);
	}
	
	public static int minUniqNumberInArray(int[] inputArray)
	{
		//Sort the array
		Arrays.sort(inputArray);
		int[] copyOfInputArray = inputArray.clone();
		
		boolean didElemOccurMoreThaOnce;
		//Each element. Did it occur more than once? If yes then delete
		for(int count=0; count<=inputArray.length-1;count++)
		{
			didElemOccurMoreThaOnce = didElementOccurMorethanOnceInArray(inputArray[count],inputArray);
			if(didElemOccurMoreThaOnce==true)
			{
				int elemToBeRemoved = inputArray[count];
				copyOfInputArray =   Arrays.stream(copyOfInputArray).filter(d -> d != elemToBeRemoved).toArray();
			}
		}
		System.out.println("Array after processing->"+Arrays.toString(copyOfInputArray));
		
		//Return the smallest number in the Collection
		if(copyOfInputArray.length==0)
		{
			System.out.println("After proessing Array is empty. So returning 0");
			return 0;
		}
		return copyOfInputArray[0];
	}
	
	public static boolean didElementOccurMorethanOnceInArray(int specificElement, int[] inputArray)
	{
		int numOfOccur = 0;
		for(int count=0; count<=inputArray.length-1; count++)
		{
			if(inputArray[count]==specificElement)
			{
				numOfOccur++;
			}	
			if(numOfOccur>1)
			{
				break;
			}
		}
		if(numOfOccur>1)
		{
			return true;
		}
		return false;
	}
}
