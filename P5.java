import java.util.*;
public class P5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("Enter a string to be compared to");
		String c = sc.nextLine();
		s=s.trim();
		c=c.trim();
		if(s.compareTo(c) == 0)
			System.out.println("First string same as last string!!");
		else
			System.out.println("First string is not same as last string :(");
		// this can also be done using System.out.println(s.equalsIgnoreCase(c));
		System.out.println("Is the string empty? "+s.isEmpty());
		System.out.println("length of string  = "+s.length());
		System.out.println("Character at first position  = "+s.charAt(0));
		System.out.println("Character at last position  = "+s.charAt(s.length()-1));
		System.out.println("Elements of string from half to last  = "+s.substring(((int)s.length()/2)));
		System.out.println("Does the string starts with a? "+s.startsWith("a"));
		System.out.println("Does the string end with s? "+s.endsWith("s"));
		System.out.println("Position where first s is found "+s.indexOf('s'));
		System.out.println("Position where last s is found "+s.lastIndexOf('s'));
		System.out.println("Replaces all m characters with n = "+s.replace('m','n'));
		System.out.println("In all lower case "+s.toLowerCase());
		System.out.println("In all upper case "+s.toUpperCase());
		System.out.println("Enter a string to be concatenated");
		String con = sc.nextLine();
		System.out.println(s.concat(con));
		
	}

}
