import java.util.*;
public class LongestSumContiguousSubarray {

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
		
		int max_so_far = 0;
		int max_ending_here = 0;
		
		for(int j=0;j<n;j++)
		{
			max_ending_here += arr[j];
			
			if(max_ending_here <0)
				max_ending_here = 0;
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			
		}
		
		System.out.println(max_so_far);

	}

}
