import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();         
        String word = sc.nextLine();
        n = n % word.length();
        String rotated = word.substring(n) + word.substring(0, n);
        System.out.println(rotated);
    }
}
