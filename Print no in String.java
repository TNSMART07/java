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
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i);
            if (Character.isDigit(c)) 
            {
                result.append(c);
            }
        }
        if (result.length() == 0) 
        {
            System.out.println(0);
        } else 
        {
            System.out.println(result.toString());
        }
    }
}
