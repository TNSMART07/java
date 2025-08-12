import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        sc.nextLine(); 
        String word = sc.nextLine();
        if (word.contains(String.valueOf(a)))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
    }
}
