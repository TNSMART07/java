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
        String word = sc.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) 
        {
            if (!Character.isLetterOrDigit(word.charAt(i)))
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
