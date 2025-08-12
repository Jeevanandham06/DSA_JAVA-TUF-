package Recursion;


public class PrimeNumberCheck {
    public static void main(String[] args) {
        Prime checkprime = new Prime();
        int num = 8;
        boolean result = checkprime.checkprime(num);
        System.out.print(result);
    }
}

class Prime {
    public boolean checkprime(int num) {
        if (num <= 1) {
            return false;
        }
        return primechecker(num, 2);
    }

    private boolean primechecker(int num, int x) {
        if (x > Math.sqrt(num)) {
            return true;
        }
        if (num % x == 0) {
            return false;
        }
        return primechecker(num, x + 1);
    }


}

