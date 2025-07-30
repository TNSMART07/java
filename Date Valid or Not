import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] d = date.split("/");
        int day =Integer.parseInt(d[0]);
        int month =Integer.parseInt(d[1]);
        int year =Integer.parseInt(d[2]);
        if((year>=1900)&&(year<=9999))
        {
            if((month==1 || month==3 || month==5 || month==7 || month==8 ||  month==10)&&(day>=0&& day<=31))
               {
                   System.out.println("Valid");
               }
             else if((month== 4 || month==6 || month==9 || month==11 || month==12)  && (day>0 && day<=30))
                     {
                         System.out.println("Valid");
                     }
              else if((month==2) && (day>0 && day<=29) && year%4==0)
                     {
                         System.out.println("Valid");
                     }
              else
                     {
                         System.out.println("Invalid");
                     }
        }
        else
            {
                 System.out.println("Invalid");
            }
                     
                     }
                     }
