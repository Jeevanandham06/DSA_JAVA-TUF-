package Recursion;

import java.util.Scanner;
class Summ {
    public int NnumbersSum(int N) {
        // Base case: if N is 0, return 0
        if (N == 0) return 0;
        // Recursive case: add N to the sum of N-1
        return N + NnumbersSum(N - 1);
    }

    public static void main(String[] args) {
        Summ sum = new Summ ();
        int n = 4;
        System.out.println("Sum of first " + n + " numbers is " + sum.NnumbersSum(n));
    }
}
