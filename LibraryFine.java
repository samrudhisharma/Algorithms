import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LibraryFine. */
        Scanner sc = new Scanner(System.in);
        String rd  = sc.nextLine();
        String ed = sc.nextLine();
        int len = rd.length();
        int len1 = ed.length();
        
        int space[] = new int[2];
        int space1[] = new int[2];
        int k=0;
        for(int i=0;i<len;i++)
            {
            if(rd.charAt(i)==' ')
                {
                space[k] = i;
            
                k++;
            }
            
            if(k==2)break;
        }
        k=0;
         for(int i=0;i<len1;i++)
            {
            if(ed.charAt(i)==' ')
                {
                space1[k] = i;
             
                k++;
            }
            
            if(k==2)break;
        }
        
          int returnday = Integer.parseInt(rd.substring(0,space[0]));
          int expectedday = Integer.parseInt(ed.substring(0, space1[0]));
          int returnmonth = Integer.parseInt(rd.substring(space[0]+1, space[1]));
          int expectedmonth = Integer.parseInt(ed.substring(space1[0]+1,space1[1]));
          int returnyear = Integer.parseInt(rd.substring(space[1]+1, len));
          int expectedyear = Integer.parseInt((ed.substring(space1[1]+1, len1)));
        
        
        
        int fine =0;
        if(returnyear<expectedyear)
        {
        	fine = 0;
        }
        else if(returnyear>expectedyear)
            {
            fine = 10000;
        }
        else
            {
            if(returnmonth>expectedmonth)
                {
                fine = 500 * (returnmonth-expectedmonth);
            }
            else if(returnmonth == expectedmonth && returnday > expectedday)
                {
                fine = 15 * (returnday-expectedday);
            }
            else
            {
            	fine = 0;
            }
        }
        
        System.out.println(fine);
    }
    
}