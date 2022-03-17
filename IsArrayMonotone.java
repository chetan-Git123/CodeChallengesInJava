/*
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 

Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
 

Constraints:

1 <= nums.length <= 105
-105 <= nums[i] <= 105
*/

class Solution 
{
    public boolean isMonotonic(int[] A) 
    {
        //Declarations
        boolean statusOfMonotone = false;
        int numberOfIncreasoingorder = 0;
        int numberOfDecreasingOrder = 0;
        
        //Browse through the array. Account for the number of orders
        for(int count=0; count<=A.length-1; count++)
        {
            //All iterations have executed
            if(count==A.length-1)
            {
                if(numberOfIncreasoingorder==0 && numberOfDecreasingOrder==0)
                {
                    statusOfMonotone = true;
                }
                else if(numberOfIncreasoingorder>0 || numberOfDecreasingOrder>0)
                {
                    statusOfMonotone = true;
                }
                else
                {
                   statusOfMonotone = false ;
                }
                continue;
            }
                
            if(A[count+1]>A[count])
            {
               numberOfIncreasoingorder++ ;
            }
             if(A[count+1]<A[count])
            {
               numberOfDecreasingOrder++ ;
            }
            
           if(numberOfIncreasoingorder>0 && numberOfDecreasingOrder>0)
            {
                statusOfMonotone= false;
                break;
            }
        }
        
        return statusOfMonotone;
        
    
    }
}
