import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String input[]= new String[2];
		input[0] = st.nextToken();
		input[1] = st.nextToken();
		
		int num[][] = new int[2][3];
		int temp;
		int reverseInput[] = new int[2];
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				num[i][j] = Integer.parseInt(Character.toString(input[i].charAt(j)));
			}
			temp = num[i][0];
			num[i][0]=num[i][2];
			num[i][2]=temp;		
			reverseInput[i]=100*num[i][0]+10*num[i][1]+num[i][2];
		}
		if (reverseInput[0]>reverseInput[1])
			System.out.println(reverseInput[0]);
		else 
			System.out.println(reverseInput[1]);
		br.close();
	}
}
