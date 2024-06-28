import java.util.*;
public class P3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		String ns ="";
		for(int i = s.length()-1; i>=0; i--)
		{
			ns = ns + s.charAt(i);
		}
		if(s.equals(ns))
			System.out.println("It is Palindrome!");
		else
			System.out.println("It is not a Palindrome :(");

	}

}
