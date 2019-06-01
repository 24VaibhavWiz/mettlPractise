package MediumLevel;
import java.util.*;
public class test2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number to find its sum upto single digit :- ");
		long num = sc.nextInt();
		int sum = 0;
		long temp = num; 
		if(num < 0)
			num*=-1;
		while(num > 0 || sum > 9)
		{
			if(num == 0)
			{
				num = sum;
				sum = 0;
			}
			
			sum += num % 10;
			num /= 10;
		}	
		
		if(temp < 0)
			System.out.println("Your answer :- "+sum*-1);
		else
			System.out.println("Your answer :- "+sum);
	}
}
