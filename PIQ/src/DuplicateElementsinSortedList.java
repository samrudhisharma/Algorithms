import java.util.*;
public class DuplicateElementsinSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
	    for(int i=0;i<n;i++) arr[i] = sc.nextInt();
	    int item = sc.nextInt();
	    
	    //First Approach
	    //int count = LinearSearch(arr, n,item);
	    //if(count>0) System.out.println("Number of times: "+count);
	    //else System.out.println("Element not found.");
	    
	    //Second Approach
	    
	    int fo = LOBinarySearch(arr,n,item,true);
	    int lo = LOBinarySearch(arr,n,item,false);
	    
	    if(fo==-1 && lo == -1)
	    {
	    	System.out.println("Element is not present.");
	    }
	    else if(fo==-1 && lo>=0 || fo>=0 && lo==-1 || fo==lo)
	    {
	    	System.out.println("Element occurs once.");
	    }
	    else
	    {
	    int diff = lo-fo;
	    int time = fo+diff;
	    System.out.println("Number of times: "+ time);
	    }
		
	}
	
	static int LinearSearch(int arr[],int n, int item)
	{
		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(item==arr[i]) count++;
			else if(item<arr[i]) break;
		}
		
		//O(n) 
		//Whenever you see sorted data - think can Binary Search be applied i.e. O(logn) possible?
		return count;
	}
	
	static int LOBinarySearch(int x[],int n, int item,boolean flag)
	{
		int result = -1;
		int low = 0;
		int high = n-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(x[mid] == item)
			{
				result = mid;
				if(flag==true)
				high = mid-1;
				else
				low = mid+1;
			}
			else if (item<x[mid])
			{
				high = mid-1;
			}
			else
				{low = mid+1;}
		}
		return result;
	}
}
