import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		String b=br.readLine();
		int sum=0;
		
		for(int i=0;i<a;i++)
		{
			sum+= Integer.parseInt(Character.toString(b.charAt(i)));
		}
		System.out.println(sum);		
	}	
}
