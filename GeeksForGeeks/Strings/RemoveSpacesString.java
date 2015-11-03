import java.util.*;
public class RemoveSpacesString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char iarr[] = input.toCharArray();
		int count = 0;
		int len = input.length();
		List<Character> s = new ArrayList<Character>(); 
		char farr[] = new char[len]; //Could create a list too, no need for count then
		for(int i=0;i<len;i++)
		{
			if(iarr[i] != ' ')
				{
				farr[count] = iarr[i];
				s.add(iarr[i]);
				count++;
				}
		}
		
		int len1 = farr.length;
		for(int j=0;j<len1;j++)
		{
			System.out.print(farr[j]);
		}
		
		System.out.println();
		for(Character o:s)
		{
			System.out.print(o.toString());
		}
		
	}

}
