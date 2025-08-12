import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid1 = n / 2;
        int mid2 = (n % 2 == 0) ? mid1 - 1 : mid1;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i == mid1 || i == mid2 || j == mid1 || j == mid2)
                {
                    System.out.print("0");
                } else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
