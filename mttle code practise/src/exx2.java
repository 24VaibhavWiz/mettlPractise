class usercode
{
	public class result
	{
		public final int output1;
		public final int output2;
		
		public result(int out1, int out2)
		{
			output1 = out1;
			output2 = out2;
		}
	}
	
	public result find(int[] input1, int input2)
	{
		int [] arr = new int[input2];
		int sum = con(arr,input1,input2); 
		result ob = new result(arr[0],sum);
		return ob;
		
		
	}
	
	int con(int arr[], int pair[], int n)
	{
		int sum = 0;
		arr[0] = (pair[0]+pair[1]-pair[n-2])/2;
		for(int i = 1; i<n; i++)
			arr[i] = pair[i-1]-arr[0];
		for(int i = 1; i<n; i++)
			sum += arr[i];
		return sum;
	}
}
public class exx2 {

	public static void main(String[] args) {
		int n = 5;
		//int[] arr = new int[n];
		int arr[] = {2,3,4,5,6}; 
		usercode ob2 = new usercode();
		System.out.println(" "+ob2.find(arr,n));
	}
}
