import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		System.out.print(" ");	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] alpha = new int[26] ;
		Arrays.fill(alpha , -1);
		for (int i=0;i<str.length();i++)
		{
			if (alpha[((int)str.charAt(i))-97]==-1)
			alpha[((int)str.charAt(i))-97]=i;
		}
		for(int j=0;j<26;j++)
		{
			if (j!=0)
				System.out.print(" ");	
			System.out.print(alpha[j]);			
		}
		System.out.println(" ");	
		System.out.println("1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1");
	}	
}
