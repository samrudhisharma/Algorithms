import java.util.*;
//Assume anti-clockwise direction(towards right)
// 2 3 5 8 11 12
// 12 2 3 5 8 11
// 11 12 2 3 5 8 -- sorted twice in anti-clockwise direction
// here the index of the smallest element gives the solution

//consider clockwise direction(towards left)
// 2 3 5 8 11 12
// 3 5 8 11 12 2
// 5 8 11 12 2 3 n-k , where k is current pos of smalles

//Linear Search is a valid solution, but optimization is possible using binarysearch
//For binarysearch - the smallest element has the property (pivot property) that both
//its adjacent elements are greater than it.( Unless all elements are equal, but
// a given constraint is that the no duplicates are allowed in the array).

public class TimesSortedArrayRotated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		
		//int pos = LinearSearch(a,n);
		//if(pos<0) System.out.println("Array is not rotated");
		//else System.out.println("Array is rotated "+pos+" number of times");
		
		int pos = BinarySearchModified(a,n);
		if(pos<0) System.out.println("Array is not fulfilling the circular array property");
		else System.out.println("Array is rotated "+ pos+" no of times");
		
	}
	
	public static int LinearSearch(int x[],int n)
	{
		int minelement = x[0];
		int minpos = -1;
		
		for(int i=1;i<n;i++)
		{
			if(x[i]<minelement)
			{
				minelement = x[i];
				minpos = i;
			}
		}
		//O(n), plus we haven't used the property that the array is sorted.
		//Can binary search be applied? O(log n) possible ?
		return minpos;
	}
	
	public static int BinarySearchModified(int x[], int n)
	{
		int low = 0; 
		int high = n-1;
	
		
			while(low<=high)
			{
				if(x[low]<=x[high])
					return low;
				
				int mid = (low+high)/2;
				int next = (mid+1) % n;
				int prev = (mid +n-1) % n;
				//One more property added as per circular property
				if(x[mid]<= x[next] && x[mid] <= x[prev])
				{
					return mid;
				}
				else if(x[mid] <= x[high])
				{
					high = mid-1;
				}
				else
				{
					low = mid+1;
				}
				
			}
		
		return -1;
	}

}
