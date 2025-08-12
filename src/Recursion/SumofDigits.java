package Recursion;
class digitssumed{
    public static  int sumofdigts(int num){
         if(num<10){
             return num;
         }
         int sum=adddigts(num);
         return sumofdigts(sum);
    }
    private static  int adddigts(int num) {
        if (num==0) {
            return 0;
        }
        return (num%10)+adddigts(num/10);
    }
}

public class SumofDigits {
    public static void main(String[]args){
        int num=529;
        int result = digitssumed.sumofdigts(num);
        System.out.print("the Sum of digits are: "+result);
    }
}
