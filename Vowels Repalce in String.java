import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // Replace all vowels with space
        String replacedstring = word.replaceAll("[aeiouAEIOU]", " ");

        // Print the result
        System.out.println(replacedstring);
    }
}
