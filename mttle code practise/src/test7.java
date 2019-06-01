import java.util.*;
class test7
{
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your String :- ");
		String str = sc.nextLine();
		System.out.println(secondWordUpperCase(str));
	}


	@SuppressWarnings("unused")
	public static String secondWordUpperCase(String input1)
	{
		// Read only region end
		int i,c;
		String first,second,remaining;

		for(i = 0, c = 0; i < input1.length(); i++)
		{
			char ch = input1.charAt(i);
			if(ch == ' ')
				c++;
		}

		if(!input1.contains(" "))
		{
			String str = "LESS";
			return str;
		}

		else 
		{		
			input1 = input1.trim();
			int space = input1.indexOf(" ") + 1;
			int secspace = input1.indexOf(" ",space + 1);
			int len = input1.length();
			
			if(c > 1)
			{
				first = input1.substring(0,space);
				second = input1.substring(space,secspace);
				remaining = input1.substring(secspace,len);
			}
			
			else
			{
				first = input1.substring(0,space);
				second = input1.substring(space,len);
			}
		}
		return second.toUpperCase();
	}
}