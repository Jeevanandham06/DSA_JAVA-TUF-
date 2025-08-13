package BinarySearch;
class searchInsert{
    public static int searchforInsertpostion(int[]nums,int target){

        int low=0 ;
        int high =nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid =(low+(high-low)/2);
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}

public class SearchforInsertPostion {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = searchInsert.searchforInsertpostion(nums, target);
        System.out.print("the Index postion for the elemnt is "+result);
    }
}
