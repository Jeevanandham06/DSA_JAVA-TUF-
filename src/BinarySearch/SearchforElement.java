package BinarySearch;
class Search{
    public static int searchforElement(int[]nums, int indextarget){
        int low =0 ;
        int high=nums.length-1;
        int ans =nums.length;
        while(low<=high){
            int mid =(low+(high-low)/2);
            if(indextarget<=mid){
                ans=nums[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans ;
    }

        }
public class SearchforElement {
    public static void main (String[]args){
        int[]nums={1,2,3,4,5,6,7,};
        int indextarget=3;
        int result=Search.searchforElement(nums,indextarget);
        System.out.print("Them element in that indexpostion is "+result);

        }
    }

