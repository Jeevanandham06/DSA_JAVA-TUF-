package Recursion;
class fibonacci{
    public static int fibb(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fibb(n-1)+fibb(n-2);
    }
}
public class FibonacciNumber {
    public static void main(String[]args){
        int n =6;
        fibonacci fibb=new fibonacci();
        int result=fibb.fibb(n);
        System.out.print("The Fibonacci Number: "+result);
    }
}
