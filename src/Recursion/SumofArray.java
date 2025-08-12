package Recursion;

class ArraySum{
    public static   int sumofarrays(int []nums){
        return sum (nums,0);
    }
    private static int  sum(int []nums ,int left){
        if(left>=nums.length){
            return 0 ;
        }
        return nums[left]+sum(nums,left+1);
    }
}
public class SumofArray{
    public static void main (String[]args){
        int []nums={1,2,5,6,6};
         int result = ArraySum.sumofarrays(nums);
         System.out.print("The Sum of Array is "+result);

    }
}
