import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int pre = ++a;
        int post = b++;

        
        System.out.println("Pre increment:" + pre);
        System.out.println("Post increment:" + post);
        System.out.println("Final values:" + a+ " " + b);

        scanner.close();
    }
}
