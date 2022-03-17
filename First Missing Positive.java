class Solution 
{
  public int firstMissingPositive(int[] nums) 
  {
      //Sort the data structure. Remove the duplicate elements
      Set<Integer> inputSet = new TreeSet<Integer>();
      for(int count=0; count<=nums.length-1; count++)
      {
          inputSet.add(nums[count]);
      }
      
      //Remove non positive numbers
      Iterator<Integer> iteratorForInputSet = inputSet.iterator();
      while( iteratorForInputSet.hasNext() )
      {
          Integer currentElement = iteratorForInputSet.next();
          if(currentElement<1)
          {
              iteratorForInputSet.remove();
          }
      }
      List<Integer> inputList = new ArrayList<Integer>(inputSet);
      
      //Usecases. Datastructure has no elements
      if(inputList.size()==0)
      {
          return 1;
      }
      
      //Usecases. Datastructure has 1 element
      if(inputList.size()==1)
      {
            if(  inputList.get(0)>1 )
            {
                return 1;
            }
            if(  inputList.get(0)==1 )
            {
                return 2;
            }  
      }
      
      //Usecases. Datastructure has multiple element
      int currentElement;
      int prevElement;
       for(int count=0; count<=inputList.size()-1; count++)
       { 
           if( count==0 )
           {
               continue;
           }
           
           currentElement = inputList.get( count );
           prevElement = inputList.get(count-1);
                
           if( (currentElement-prevElement)>1  )
           {
              if(inputList.get(0)>1)
                {
                 return 1;   
                }
               return (prevElement+1);
           }
           
           if(count==inputList.size()-1)
           {
                if(inputList.get(0)>1)
                {
                 return 1;   
                }
                return (currentElement+1);
           }
             
       }
      
      System.out.println( "This input was Not processed->"+Arrays.toString(nums) );
      System.out.println("So return 1 by default");
      return 1;
      
      
      
      
      
      
      
      
      
      
      
      
  }
}
