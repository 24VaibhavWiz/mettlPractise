import java.util.*; 

class test5 { 

	static int totalchar = 256; 

	static boolean palindromePossibility(int str) { 

		String str1 = Integer.toString(str);
		
		int pallin[] = new int[totalchar]; 
		Arrays.fill(pallin, 0); 

		for (int i = 0; i < str1.length(); i++) 
			pallin[(int)(str1.charAt(i))]++; 

		int odd = 0; 
		for (int i = 0; i < totalchar; i++)  
		{ 
			if ((pallin[i] & 1) == 1) 
				odd++; 

			if (odd > 1) 
				return false; 
		} 

		return true; 
	} 

	public static void main(String args[]) 
	
	{ 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your string to check");
		int str1 = sc.nextInt();
		
		if (palindromePossibility(str1)) 
			System.out.println("Possible"); 
		else
			System.out.println("Not Possible"); 

	} 
} 