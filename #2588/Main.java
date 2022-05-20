import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			int  a = sc.nextInt();
			int  b = sc.nextInt();
			
			System.out.println((a%10)*b);
			System.out.println(((a/10)%10)*b);
			System.out.println((a/100)*b);
			System.out.println(a*b);
		}
	}	
}
