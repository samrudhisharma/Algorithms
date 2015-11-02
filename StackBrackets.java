import java.util.*;
class StackBrackets{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         int length = input.length();
         char[] c = input.toCharArray();
         Stack<Character> s =  new Stack<Character>();
         for(int i=0;i<length;i++)
         {
        	 char current  = input.charAt(i);
        	 if(current=='{' || current=='[' || current=='(')
        	 {
        		 s.push(input.charAt(i));
        	 }
        	 
        	 if((current=='}' || current==']' || current==')' ))
        	 {
        		 if(s.empty())
        		 {
        			 s.push(current);
        		 }
        		 char prev = s.peek();
        		 
        		// System.out.println("Im here: "+prev+" count "+current);
        		 if(current=='}' && prev =='{' || current==']' && prev =='[' || current==')' && prev =='(')
            	  {
        			// System.out.println(s.peek());
        			 s.pop();
        			 
            	  }
        		 
        		
        	 }
        	 
        	 
         }
         
         if(s.isEmpty())
         {
        	 System.out.println("true");
         }
         else
         {
        	 System.out.println("false");
         }
      }
      
   }
}