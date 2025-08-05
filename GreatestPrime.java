import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = greatestPrimeFactor(num);
        System.out.println(result);
        scanner.close();
    }

    public static int greatestPrimeFactor(int n) 
    {
        int maxPrime = -1;

        // Remove all factors of 2
        while (n % 2 == 0) 
        {
            maxPrime = 2;
            n /= 2;
        }

        // Check for odd factors from 3 to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) 
        {
            while (n % i == 0) 
            {
                maxPrime = i;
                n /= i;
            }
        }

        // If n is still greater than 2, then n itself is prime
        if (n > 2) 
        {
            maxPrime = n;
        }

        return maxPrime;
    }
}
