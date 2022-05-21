import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int alpha[] = new int[26];
		Arrays.fill(alpha, 0);
		int temp=0, same =0;
		for (int i=0;i<str.length();i++)
		{
			if ((int)str.charAt(i)<97)
			{
				alpha[(int)(str.charAt(i)- 65)] +=1;
				if (alpha[(int)(str.charAt(i)- 65)]>alpha[temp]||temp == (int)(str.charAt(i)- 65))
				{
					temp = (int)(str.charAt(i)- 65);
					same=0;
				}
				else if (alpha[(int)(str.charAt(i)- 65)]==alpha[temp]&&temp != (int)(str.charAt(i)- 65))
				{
					temp = (int)(str.charAt(i)- 65);
					same=1;
				}
			}
			else
			{
				alpha[(int)(str.charAt(i)- 97)] +=1;
				if (alpha[(int)(str.charAt(i)- 97)]>alpha[temp]||temp == (int)(str.charAt(i)- 97))
				{
					temp = (int)(str.charAt(i)- 97);
					same =0;
				}
				else if (alpha[(int)(str.charAt(i)- 97)]==alpha[temp] && temp!=(int)(str.charAt(i)- 97))
				{
					temp = (int)(str.charAt(i)- 97);
					same=1;
				}
			}
		}
		if (same==1)
			System.out.println("?");
		else
		{
			char asciitochar = (char)(temp+65);
			System.out.println(asciitochar);
		}
		br.close();
	}	
}
