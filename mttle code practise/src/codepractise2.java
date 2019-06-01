import java.util.*;
public class codepractise2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Please enter the size of the Array :- ");

		int sum = 0;
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Please enter the Array's elements : ");
		for (int i = 0; i < arr.length; i++) 
			arr[i] = sc.nextInt();
		
		for (int i = 0; i < arr.length;) {
			if(primes(i))
			{
				sum += arr[i];
				i++;
			}
			
			else
				i++;
		}
		System.out.print("Sum of Prime Indexed number :- "+sum);
	}
	
	public static boolean primes(int num)
	{
		if(num < 2)
			return false;

		if(num == 2 || num == 3) 
			return true;

		if(num % 2 == 0 || num % 3 == 0) 
			return false;

		long sqrtN = (long)Math.sqrt(num) + 1;

		for(long i = 6L; i <= sqrtN; i += 6) 
			if(num % (i - 1) == 0 || num % (i + 1) == 0)
				return false;

		return true;
	}
}
