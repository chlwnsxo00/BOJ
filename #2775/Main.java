import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		System.out.println();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int apart[][]=new int[15][15];
		for(int i=0;i<15;i++)
		{
			apart[i][1]=1;
			apart[0][i]=i;
		}
		for(int i=1;i<15;i++)
		{
			for(int j=2;j<15;j++)
			{
				apart[i][j]=apart[i-1][j]+apart[i][j-1];
			}
		}
		
		int N=Integer.parseInt(br.readLine());
		while(N-->0)
		{
			int floor = Integer.parseInt(br.readLine());
			int room = Integer.parseInt(br.readLine());	
			System.out.println(apart[floor][room]);
		}
		br.close();
	}
}
