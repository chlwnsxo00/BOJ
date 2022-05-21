import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int time=0;
		for(int i=0;i<line.length();i++)
		{
			if((int)(line.charAt(i))<80)
			time += ((int)(line.charAt(i))-65)/3+3;
			else if ((int)(line.charAt(i))<84)			
				time +=8;
			else if ((int)(line.charAt(i))<87)
				time +=9;
			else if (((int)(line.charAt(i))-65)<91)
				time +=10;
		}
		System.out.println(time);
		br.close();
	}
}
