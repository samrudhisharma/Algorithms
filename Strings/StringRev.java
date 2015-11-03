import java.io.*;
import java.util.*;

public class StringRev {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length();
        int len1 = 0;
        char c[] = A.toCharArray();
        for(int i=0;i<len/2;i++)
            {
            if(c[i]==c[len-i-1])
                {
                len1++;
            }
        }
        
       if(len%2 == 0 && len/2== len1)
       {
    	   System.out.println("Yes");
       }
       else if(len%2 !=0 && 2*len1 == len -1 )
       {
       System.out.println("Yes");
       }
       else
       {
       System.out.println("No");
       }
    }
}
