package Recursion;

import java.util.ArrayList;

class Stringreverse {
    private void reverse(ArrayList<Character> s, int left, int right) {
        //base case ;
        if (left >= right) return;

        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        reverse(s, left + 1, right - 1);
    }

    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        int left = 0, right = s.size() - 1;
        reverse(s, left, right);
        return s;
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Stringreverse reverse = new Stringreverse();
        ArrayList<Character> s = new ArrayList<>();
        s.add('a');
        s.add('h');
        s.add('d');
        s.add('e');
        s.add('v');
        s.add('u');
        s.add('s');
        ArrayList<Character> reversed = reverse.reverseString(s);
        System.out.print(reversed);

    }
}
