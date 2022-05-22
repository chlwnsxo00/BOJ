import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		while(N-->0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int floor = Integer.parseInt(st.nextToken());
			int roonNum = Integer.parseInt(st.nextToken());
			int personNum = Integer.parseInt(st.nextToken());
			if (personNum%floor!=0)
				System.out.println(personNum%floor*100+personNum/floor+1);
			else
				System.out.println(floor*100+personNum/floor);
		}
		br.close();
	}
}
