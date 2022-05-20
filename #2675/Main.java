import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		System.out.println("");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while(--N!=-1)
		{
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for(int i=0;i<str.length();i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(str.charAt(i));
				}
			}
			System.out.println("");
		}
	}	
}
