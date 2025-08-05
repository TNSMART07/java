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
        long num = scanner.nextLong();
        System.out.println(leastPrimeFactor(num));
        scanner.close();
    }

    public static long leastPrimeFactor(long n) 
    {
        if (n <= 1) 
        {
            return -1; 
        }

        if (n % 2 == 0)
        {
            return 2;
        }

        for (int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0) 
            {
                return i;
            }
        }
        return n;
    }
}
