package Hashing;

import java.util.HashMap;

public class Hashing {
    public static  void main(String[]args){
        int [] nums ={4,1,2,1,2};
        int result=finduniqueElement (nums);
         System.out.println("Unique Element: "+result);
    }
   public  static int finduniqueElement(int[]nums){
        HashMap<Integer ,Integer>map=new HashMap<>();
        for(int num :nums){
            map.put(num, map.getOrDefault(num,0)+1);

        }
        for(int num:nums){
            if(map.get(num)==1){
                return  num;
            }
        }
        return -1;
   }
}
