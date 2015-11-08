import java.util.*;
/**
 * Salient Features of Selection Sort:
 * -> In place sorting
 * -> O(n2)
 * */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
			
		SelectionSort(arr,n);
	}
	
	static void SelectionSort(int arr[], int n)
	{
		int minpos;
		for(int i=0;i<n-1;i++)
		{
			minpos = i; //set as first position of i
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] < arr[minpos])
				{
					minpos = j;
				}
			}
			
			if(minpos != i)
			{
				swap(arr,i, minpos);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}	
		
	}
	
	static void swap(int arr[], int a, int b)
	{
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
