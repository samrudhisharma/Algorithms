import java.util.*;
public class FindElementInCircularSortedArray {

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
		
		int pos = circularBinarySearch(arr,n, item);
		if(pos<0) System.out.println("Element not found.");
		else System.out.println("Element found at position: "+pos);
		
	}
	
	static int circularBinarySearch(int x[], int n, int item)
	{
		int low = 0, high = n-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(x[mid]==item) return mid; //found
			if(x[mid]<=x[high]) //right half is sorted
			{
				if(item > x[mid] && item <= x[high])
				{
					low = mid + 1;
				}
				else
					high =  mid - 1;
			}
			else //left half is sorted
			{
				if(x[low]<=x[mid]) high = mid -1 ;
				else low = mid +1 ;
			}
		}
		return -1;
	}

}
