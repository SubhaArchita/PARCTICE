import java.util.*;
public class P4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		System.out.println("Enter the new character ");
		char c = sc.next().charAt(0);
		System.out.println("Enter the index number");
		int i = sc.nextInt();
		System.out.println(s.substring(0,i-1)+c+s.substring(i));
	}

}
