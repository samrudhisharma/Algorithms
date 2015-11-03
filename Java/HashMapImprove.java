//Complete this code or write your own from scratch
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

class HashMapImprove{
   public static void main(String []argh) throws IOException
   {
      //Scanner in = new Scanner(System.in);
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      //in.nextLine();
      Map<String, Integer> phone_book =  new HashMap(); 
      for(int i=0;i<n;i++)
      {
         //String name=in.nextLine();
    	  String name = br.readLine();
         //int phone=in.nextInt();
    	  int phone = Integer.parseInt(br.readLine());
         phone_book.put(name, phone);
         //in.nextLine();
      }
      while(true)
      {
         String s=br.readLine();
         if(phone_book.containsKey(s))
         {
        	 System.out.println(s+"="+phone_book.get(s)); //Nice !
         }
         else
         {
        	 System.out.println("Not found");
         }
         
      }
   }
}
