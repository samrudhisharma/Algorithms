import java.util.*;
public class c1CheckStringIfPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		
		boolean result = isPermutation(input1, input2);
		System.out.println(result);
	}
	
	static boolean isPermutation(String input, String input1)
	{
		int len = input.length();
		int len1 = input1.length();
		
		if(len!=len1)
			return false;
		
		else
		{
			int count[] = new int[128];
			for(int i=0;i<len;i++)
			{
				count[input.charAt(i)]++;
			}
			
			for(int i=0;i<len;i++)
			{
				if(count[input1.charAt(i)]<1)
					return false;
				else
					count[input1.charAt(i)]--;
			}
		}
		
		return true;	
	}

}
