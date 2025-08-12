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
        String input = sc.nextLine();
        int count = 0;

        try 
        {
            while (true) 
            {
                input.charAt(count); // Try accessing each character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) 
        {
            
            // Reached the end of the string
        }

        System.out.println(count);
    }
}
