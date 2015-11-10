import java.util.*;
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		QuickSort(arr,0,n-1);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	static void QuickSort(int arr[], int p, int r)
	{
		if(p<=r)
		{
			int q = partition(arr,p,r);
			QuickSort(arr,p,q-1);
			QuickSort(arr,q+1,r);
		}
	}
	
	static int partition(int arr[], int p, int r)
	{
		int x = arr[r];
		int i = p-1;
	
		for(int j=p;j<=r-1;j++)
		{
			if(arr[j]<=x)
				{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
		}
		
		
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		return i+1;
	}

}
