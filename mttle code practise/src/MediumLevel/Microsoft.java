package MediumLevel;
import java.util.*;
public class Microsoft {

	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the size of the array :- ");
		
		int n = sc.nextInt();
		int array[] = new int[n];
		//int arr[] = new int[n];
		System.out.println("Please enter the elements of the array :- ");
		
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < n;) {
			int j = 1;
			if(array[i] == array[j])
			{
				array[i] = 2*array[i];
				array[j] = 0; 
				i++;j++;
			}
			else
			{
				i++;
			}
		}
		System.out.println("Your answer is :- ");

		for (int j = 0; j < n; j++)
		{
			System.out.print(" "+array[j]);
		}
/*
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(array[i] != 0)
				array[count++] = array[i];
			while(count < n)
				array[count++] = 0;
		}
*/
		System.out.println("\nYour answer is :- ");

		for (int j = 0; j < n; j++)
		{
			System.out.print(" "+array[j]);
		}

	}
}
