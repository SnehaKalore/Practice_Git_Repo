import java.util.*;
import java.lang.*;
 
class ForgetCode
{  
    public static void main(String args[])
    {
    String chr="madam";
        String reverse="";
        int len=chr.length();
        
      
         for(int i=len-1;i>-1;i--)
        {
        reverse=reverse+chr.charAt(i);
        }
        System.out.println("Reversed String is: "+reverse);
 
        if(chr.equals(reverse))
        {
        System.out.println("The Given String is Palindrome");
        }else{
                 System.out.println("The Given String is not Palindrome");
        }
    }
}
