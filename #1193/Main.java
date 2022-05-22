import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num =Integer.parseInt(br.readLine());
		int temp=1;
		while(temp<num)
		{
			num-=temp;
			temp++;			
		}
		if(temp%2==0)
			System.out.println(num+"/"+(temp-num+1));
		else
			System.out.println((temp-num+1)+"/"+num);
		br.close();
	}
}
