import java.util.*;
class test3
{
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your String :- ");
		String str = sc.nextLine();

		if(!str.contains(" "))
			System.out.println("LESS");

		else
		{
			str = str.trim();
			int space = str.indexOf(" ") + 1;
			int secspace = str.indexOf(" ", space + 1);
			//int nextline = str.indexOf("\n");
			int len = str.length();

			String first = str.substring(0,space);
			String second = str.substring(space,secspace);
			String remaining = str.substring(secspace,len);
			//String nexln = str.substring(0,nextline);
			
			int val = Integer.parseInt(second);
			int val2 = Integer.parseInt(second);
			
			if(val == val2)
				System.out.println(second); 
			else 
			{
				System.out.println();
				System.out.println("Your output :- ");
				System.out.println(second.toUpperCase());
			}
		}
	}
}