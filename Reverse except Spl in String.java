import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) 
        {
            if (Character.isLetterOrDigit(ch)) 
            {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) 
        {
            if (Character.isLetterOrDigit(ch)) 
            {
                result.append(stack.pop());
            } else 
            {
                result.append(ch); 
            }
        }
        System.out.println(result.toString());
    }
}
