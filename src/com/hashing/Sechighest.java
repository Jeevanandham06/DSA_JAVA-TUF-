package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class Sechighest {
    public static void main(String[] args) {
        int[] nums = {1};

        int result = Solution.SecondhighestOccuring(nums);
        System.out.print("Highest Occuring element of the array:" + result);

    }
    class Solution{
        public static int SecondhighestOccuring(int []nums){
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int num:nums){
                map.put(num, map.getOrDefault(num,0)+1);
            }
            int maxfreq = 0, secmaxfreq=0;
            int maxele=-1,  secmaxele=-1;
            for(Map.Entry<Integer,Integer>entry: map.entrySet()){
                int freq =entry.getValue();
                int ele =entry.getKey();

                if(freq>maxfreq){
                    secmaxfreq=maxfreq;
                    maxfreq=freq;
                    secmaxele=maxele;
                    maxele=ele;

                }
                else if (freq==maxfreq){
                    maxele=Math.min(maxele,ele);
                }
                else if(freq>secmaxfreq){
                    secmaxfreq=freq;
                    secmaxele=ele;
                }
                else if(freq==secmaxfreq){
                    secmaxele=Math.min(secmaxele,ele);
                }
            }
            return secmaxele;
        }


    }
}
