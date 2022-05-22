import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		System.out.println();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		int count=0;
		String word[]=new String[N];
		for(int i=0;i<N;i++)
		{
			int check[]=new int[26];
			Arrays.fill(check, 0);
			word[i]=br.readLine();
			for(int j=0;j<word[i].length();j++)
			{
				if(check[(int)word[i].charAt(j)-97]==1)
				{
					if(word[i].charAt(j)!=word[i].charAt(j-1))
					{
						count--;
						break;
					}
				}
				else
					check[(int)word[i].charAt(j)-97]=1;
			}
			count++;
		}
		System.out.println(count);
		br.close();
	}
}
