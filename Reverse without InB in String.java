import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String c = "";
        for(int i = a.length()-1;i>=0;i--)
        {
            c =c+a.charAt(i);
        }
        System.out.println(c);
    }
}
