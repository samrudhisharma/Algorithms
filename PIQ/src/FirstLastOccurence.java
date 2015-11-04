import java.util.*;
public class FirstLastOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int item = sc.nextInt();
		int fo = FirstOccurenceBinarySearch(arr,n,item);
		int lo = LastOccurenceBinarySearch(arr,n,item);
		
		if(fo==-1 && lo==-1) System.out.println("Element doesn't occur in array");
		else if(fo==lo || fo==-1 && lo >= 0 || lo==-1 && fo >= 0 ) System.out.println("Element occurs only once ");
		else System.out.println("First occurence: "+fo+" Last occurence: "+lo);
	}
	
	public static int FirstOccurenceBinarySearch(int x[], int n, int item)
	{
		int low = 0;
		int high = n-1;
		int result = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(item==x[mid])
			{
				result = mid;
				high = mid-1;
			}
			else if(item<x[mid])
				high = mid-1;
			else
				low = mid+1;
		}
		
		return result;
	}
	
	public static int LastOccurenceBinarySearch(int x[], int n, int item)
	{
		int low = 0;
		int high = n-1;
		int result = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(item==x[mid])
			{
				result = mid;
				low = mid+1;
			}
			else if(item<x[mid])
				high = mid-1;
			else
				low = mid+1;
		}
		
		return result;
	}

}
