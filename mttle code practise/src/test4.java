import java.util.*;
public class test4 {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number to check if it is palindrome");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		String str = sc.nextLine();
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
