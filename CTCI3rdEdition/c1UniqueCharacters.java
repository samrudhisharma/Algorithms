import java.util.*;
public class c1UniqueCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		String s = sc.next();
		
		boolean value = uniqueCharacter(s);
		System.out.println(value);
	}
	
	static boolean uniqueCharacter(String input)
	{
	//Assuming ASCII - 128

	int len = input.length();

	if(len>128)
		return false;
	else
		{
		int count[] = new int[128];
		
		for(int i=0;i<len;i++)
		{
			if(count[input.charAt(i)]>=1)
			return false;
			else
			++count[input.charAt(i)];
		}
		}

	return true; //if all fails 
	}

}
