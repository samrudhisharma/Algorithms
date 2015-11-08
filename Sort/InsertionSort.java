import java.util.*;
/*
 * Salient Features:
 * -> Much better than other quadratic sorts - selection and bubble sort
 * -> Stable
 * 	-> In-place
    -> Insert in correct position by comparing with current value 
    -> http://courses.cs.washington.edu/courses/cse373/01wi/slides/Measurement/sld010.htm
 */
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		intInsertionSort(arr);
	}
	
	static void intInsertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp = arr[i];
			int j = i;
			for(j = i-1;j>=0 && temp < arr[j];j--)
			{
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
