import java.util.*;
public class exampleString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		int len = str.length();
		int ctr = 0;
		
		System.out.println("Length of the given string is "+len);
		for(int i = 0; i < str.length(); i++)
	    {
			char ch=str.charAt(i);
	        if(ch == ' ')
	        	ctr++;
	    }
		System.out.println("Number of spaces present "+ctr);
		int newlen = len - ctr;
		System.out.println("Length of string without spaces is "+newlen);
		
		int sum = 0, n;
		if(newlen > 9)
		{
			while(newlen != 0)
			{
				n = newlen % 10;
            	sum = sum + n;
            	newlen = newlen / 10;
			}
            System.out.println("Pincode is sum "+sum);
		}
		
		else
			System.out.println("Pincode is newline "+newlen);
		
	}
}

