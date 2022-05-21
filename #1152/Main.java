import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		String[] N = br.readLine().split(" ");
		int count=0;
		int minus=0;
		try { while (N[count]!=null)
		{
			if (N[count]=="")
			{
				minus++;
			}
			count++;
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
		}
		System.out.println(count-minus);
		br.close();		
	}
}
