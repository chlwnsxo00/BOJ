import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		System.out.println();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int count=0;
		for (int j=0;j<line.length();j++)
		{
			if(line.length()>j+1)
			{
			 if ((line.charAt(j)=='c'&&line.charAt(j+1)=='=')||(line.charAt(j)=='c'&&line.charAt(j+1)=='-')||(line.charAt(j)=='d'&&line.charAt(j+1)=='-')||(line.charAt(j)=='l'&&line.charAt(j+1)=='j')||(line.charAt(j)=='n'&&line.charAt(j+1)=='j')||(line.charAt(j)=='s'&&line.charAt(j+1)=='=')||(line.charAt(j)=='z'&&line.charAt(j+1)=='='))
			{
				count++;
				j++;
			}	
			 else if(line.length()>j+2)
			 {
				 if (line.charAt(j)=='d'&&line.charAt(j+1)=='z'&&line.charAt(j+2)=='=')
					{
					 	count++;
						j+=2;
					}	
				 else
						count++;
			 }
			 else
					count++;
			}
			else
				count++;
		}
			
		System.out.println(count);
		br.close();
	}
}
