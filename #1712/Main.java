import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		System.out.println();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int fixed = Integer.parseInt(st.nextToken());
		int cost = Integer.parseInt(st.nextToken());
		int value = Integer.parseInt(st.nextToken());
		int result=0;		
		if (cost>=value)
			result=-1;
		else
		{
			while(fixed>=0)
			{
				fixed-=value-cost;
				result+=1;
			}
		}		
		System.out.println(result);
		br.close();
	}
}
