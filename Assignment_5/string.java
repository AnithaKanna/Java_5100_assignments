
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution4
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean b = isValid(s);
        if(b)
        System.out.println("Valid");
        else
        System.out.println("INvalid");
    }
    static boolean isValid(String s)
    {
        char arr[] = new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch  = s.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
                arr[++top] = ch;
            else
            {
                switch (ch)
                {
                    case '}':
                        if(arr[top]=='{')
                            top--;
                        else return false;
                        break;
                   case ']':
                        if(arr[top]=='[')
                            top--;
                        else return false;
                        break;
                   case ')':
                        if(arr[top]=='(')
                            top--;
                        else return false;
                        break;
                   default:
                            return false;
                }
            }
        }
        if(top==-1)
        return true;
        else return false;
    }
}