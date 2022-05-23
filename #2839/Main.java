import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		System.out.println();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result=0;
		result+=num/5;
		int temp=num%5;
		while(true)
		{
			if (temp%3==0)
			{
				result+=temp/3;
				break;
			}			
			else if(result>0)
			{
				result-=1;
				temp += 5;
			}
			else
			{
				result=-1;
				break;
			}
		}
		System.out.println(result);
		br.close();
	}
}
