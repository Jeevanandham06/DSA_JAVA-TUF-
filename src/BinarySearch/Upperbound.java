package BinarySearch;


class upper{
    public static int upperBoundelmenetIndex(int[]nums, int x){
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

public class Upperbound {
    public static void main (String[]args) {
        int[] nums = {3,5,8,15,19};
        int x = 9;
        int result = upper.upperBoundelmenetIndex(nums, x);
        System.out.print("the Lowe element index: "+result);
    }
}
