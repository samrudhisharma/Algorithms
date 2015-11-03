//To do
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListWrong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named ArrayListWrong. */
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	ArrayList<ArrayList<Integer>> group = new ArrayList<ArrayList<Integer>>();
    	
    	for(int i=0;i<n;i++)
    	{
    		ArrayList<Integer> temp = new ArrayList<Integer>();
    		int k = sc.nextInt(); //Imp step was messing this up!
    			while(k!=0)
    			{
    				temp.add(sc.nextInt());
    				k--;
    			}
    			
    		group.add(temp);			
    	}
    	int n1 = sc.nextInt();
    	int query[][] = new int[n1][2];
    	for(int y=0;y<n1;y++)
    	{
    		query[y][0] = sc.nextInt();
    		query[y][1] = sc.nextInt();
    	}
    	for(int j=0;j<n1;j++)
    	{
    		if(query[j][1]-1>group.get(query[j][0]-1).size())
    		{
    			System.out.println("ERROR!");
    		}
    		else
    		{
    			System.out.println(group.get(query[j][0]-1).get(query[j][1]-1));
    		}
    			
    	}
    	  	   	
    }
    
}