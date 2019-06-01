//CodeChef Problem 1
package MediumLevel;
import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class TreeMex {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Please enter the number of samples");
		n = sc.nextInt();
		int arr[] = new int[n];
		int arr2[] = new int[n];
		
		for (int i = 0; i < n; i++)
			arr2[i] = -1;
		
		for (int i = 0; i < n; i++) {
			arr2[i] = MEX()
		}
		
	}
	
	public static int MEX(int arr[],int i,int arr2[])
	{
		int j = i+1;
		if((arr2[j] == -1)&&(arr[i-1] == -1))
			return 0;
		else if((arr[j-1] != -1) && (arr[j+2] != -1))
		{
			int temp = Math.max(arr2[j-1], arr2[j+2]);
			
			if(temp - 1 != -1)
				return temp - 1;
			else
				return temp + 1;
		}
		
		if(arr[j] == )
	}
}
