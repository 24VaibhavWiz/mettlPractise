import java.util.*;
public class yeardiffer {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the string :- ");
		String str1 = sc.nextLine();
		int sum = extractspaces(str1);
		System.out.println("your answer is "+sum);
	}
	
	static int extractspaces(String str1)
	{
		int ctr = 0;
		String space2 = "";
		String space1 = "";
		String str2[] = str1.split(" ");
		for(String space : str2)
		{
			if((check(space))&&(ctr == 0))
			{
				space1 = String.valueOf(space);
				ctr++;
			}
			
			else
				space2 = String.valueOf(space);
		}
		
		int sp1 = Integer.parseInt(space1);
		int sp2 = Integer.parseInt(space2);
		
		if(sp1 >= sp2)
			return sp1 - sp2;
		else
			return sp2 - sp1;
	}

	static boolean check(String str2)
	{
		if(str2.length() == 4)
		{
			if(str2.matches("-?\\d+"))
				return true;
		}

		else
			return false;
	
		return false;
	}
}
