package Recursion;

class Factorial {
    public int FactorialN(int n) {
        // The Factorial of 0&1 is 1 ;
        if (n <= 1) return 1;
        //recursive of Factorial of N natural Number is
        return n * FactorialN(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        Factorial fact = new Factorial();
        System.out.print("The factorial of " + n + " is " + fact.FactorialN(n));

    }
}
