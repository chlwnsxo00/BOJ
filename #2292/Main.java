import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		System.out.println();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num =Integer.parseInt(br.readLine());
		int result=0;
		int i=0;
		while(num>0)
		{
			if(result==0)
				num-=1;		
			else
				num-=6*++i;
			result++;
		}
		System.out.println(result);
		br.close();
	}
}
