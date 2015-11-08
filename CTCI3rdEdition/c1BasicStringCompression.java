import java.util.*;
public class c1BasicStringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int count[] = new int[128]; //ASCII
		
		countComp(input, count);
		
	}

	static void countComp(String s, int count[])
	{
		StringBuffer s1 = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(int j=0;j<count.length;j++)
		{
			if(count[j]>=1)
			{
				char c = (char) j;
				s1.append(c);
				s1.append(count[j]);
			}
		}
		
		System.out.println(s1);
	}
}
