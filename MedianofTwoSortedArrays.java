/* 
Problem Statement: There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example1
nums1 = [1, 3]
nums2 = [2]
The median is 2.0

Example2
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5

*/

class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        //Declrations
        double median = 0.0;
        
        //Put all elements in a big array
        int assortedArray[] = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, assortedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, assortedArray, nums1.length, nums2.length);
        
        //Sort the array
        Arrays.sort(assortedArray);
        
        //Dealing with assortedArray which has 2 elements
        if(assortedArray.length==2)
        {
           median =  (assortedArray[0]+assortedArray[1])/2.0;
           return median;
        }
        
        /* Dealing with assortedArray which has more than 2 elements */
        //Even number of elements
        if(assortedArray.length%2==0)
        {
            median = ( assortedArray[assortedArray.length/2]+assortedArray[(assortedArray.length/2)-1] )/ 2.0;
            return median;
        }
        //Odd number of elements
        if(assortedArray.length%2!=0)
        {
            return assortedArray[assortedArray.length/2];
        }
        
        System.out.println("Following inputs were not processed so we will retunr 0.0 by default");
        System.out.println("Input1->"+ Arrays.toString(nums1));
        System.out.println("Input2->"+ Arrays.toString(nums2));
        return 0.0;
    
        
    }
}
