import java.util.*;
public class oneDArrayHard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int len = sc.nextInt();
			int jump = sc.nextInt();
			int arr[] = new int[len];
			
			for(int j=0;j<len;j++)
			{
				arr[j] = sc.nextInt();
			}
			
			for(int k=0;k<len;k++)
			{
				if(k+jump > len)
				{
					System.out.println("Yes");
				}
				else if(arr[k+jump]==0)
				{
					if((k+jump)<len)
						k = k+jump;
					else
						System.out.println("Yes");
				}
				else
				{
					if(arr[k+1]==0)
						k++;
					else
						System.out.println("No");
				}
			}
		}
	}

}
