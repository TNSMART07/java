import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        int number = scanner.nextInt();

        // Check if it is a perfect square
        if (isPerfectSquare(number)) 
        {
            System.out.println("Perfect Square");
        } else 
        {
            System.out.println("Not");
        }

        scanner.close();
    }

    // Function to check for perfect square
    public static boolean isPerfectSquare(int num) 
    {
        if (num < 0) return false; // Negative numbers are not perfect squares

        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
