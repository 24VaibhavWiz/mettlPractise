import java.util.*; 
import java.util.Arrays;
public class codepractise1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		System.out.print("Please enter the size of your array :- ");
		Scanner sc = new Scanner (System.in);

		int num, ctr = 0, sum = 0, min, ctr2 = 0;
		int n = sc.nextInt();
		int arr[] = new int [n];


		System.out.print("Please enter your array's elements :- ");
		for (int i = 0;i < n; i++) 
		{
			arr[i] = sc.nextInt();
			if(primes(arr[i]))
				ctr++;
		}

		int arr2[] = new int [ctr];

		for (int i = 0, j = 0; i < arr.length; i++) 
		{
			if((primes(arr[i]))&&(j<ctr))
			{
				arr2[j] = arr[i];
				j++;
			}
		}
		
		System.out.println();
		System.out.print("Array Provided : ");
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");
		
		System.out.println("\n");
		System.out.println("Total primes present :- "+ctr);
		if(ctr > 0)
			System.out.println("\nPrime number status - *positive*");
		if(ctr > 1)
		{
			System.out.println();
			System.out.print("Modified Array (containing only prime numbers) : ");

			for (int i = 0; i < ctr; i++) 
				System.out.print(arr2[i]+" ");	
			System.out.println();

			min = Arrays.stream(arr2).min().getAsInt();

			for (int i = 0; i < ctr;) {
				if(arr2[i] == min)
				{
					i++;
					ctr2++;
				}
				else
				{
					sum += arr2[i];
					i++;
				}
			}
			System.out.println();
			System.out.print("Smallest Prime Number Present :- "+min+" and Duplicates of its :- "+ctr2);

			if(ctr2 == ctr)
			{
				System.out.println("\n");
				System.out.println("All prime numbers are Identicle, so sum :- 0");
				System.exit(1);
			}

		}

		else if(ctr == 1)
		{
			System.out.println();
			System.out.println("Only 1 Prime Number is present (smallest)");
		}

		else
		{
			System.out.println();
			System.out.println("Prime Number status - *negetive*\n");
			System.out.println("Sum :- 0");
			System.exit(1);
		}

		System.out.println();
		System.out.println("sum of all the prime numbers in the array except the smallest :- "+sum);
	}
	
	public static boolean primes(int num)
	{
		if(num < 2)
			return false;

		if(num == 2 || num == 3) 
			return true;

		if(num % 2 == 0 || num % 3 == 0) 
			return false;

		long sqrtN = (long)Math.sqrt(num)+1;

		for(long i = 6L; i <= sqrtN; i += 6) 
			if(num%(i-1) == 0 || num%(i+1) == 0)
				return false;

		return true;
	}
}

