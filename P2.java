import java.util.*;
public class P2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an email id");
		String e = sc.nextLine();
		int c1 = 0, c2 = 0;
		boolean f = false;
		for(int i=0; i<=e.length()-1;i++)
		{
			int a = (int)e.charAt(i);
			if((a >= 48 && a<=57) || (a>=97 && a<=122) || a == 64 || a == 46)
			{
				if(a==64)
					c1++;
				if(a==46)
					c2++;
				f = true;
			}
			else
			{
				f = false;
				break;
			}	
		}	
		if(f == true && c1 == 1 && c2 == 1)
			System.out.println("It is correct");
		else
			System.out.println("It is not correct");
	}
}
