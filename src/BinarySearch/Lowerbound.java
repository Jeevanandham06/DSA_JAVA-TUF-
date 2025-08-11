package BinarySearch;
class lower{
    public static int  lowerBoundelmenetIndex(int[]nums,int x){
        int low=0 ,high=nums.length-1;
        int ans =0 ;
        while(low<=high){
            int mid= (low +(high-low)/2);
            if(nums[mid]>=x){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans ;
    }
}

public class Lowerbound {
    public static void main (String[]args) {
        int[] nums = {1, 2, 2, 3};
        int x = 2;
        int result = lower.lowerBoundelmenetIndex(nums, x);
        System.out.print("the Lowe element index: "+result);
    }
}
