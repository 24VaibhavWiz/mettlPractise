
public class tset6 {
	public static void main(String[] args) {
		//String str = "12342352397235823050237238523";

		StringBuilder sb = new StringBuilder();

		int input1 = 12;
		int input2 = 34;
		int input3 = 56;
		int input4 = 7;
		
		sb.append(input1);
		sb.append(input2);
		sb.append(input3);
		sb.append(input4);
		
		String str = sb.toString();
		System.out.println(str);

		int frequency[] = new int[100];
		for(int i = 0; i < str.length(); ++i)
		{
			int digit = str.charAt(i) - '0';
			frequency[digit] ++;
		}
		for(int i = 0; i < str.length(); ++i)
			System.out.println(frequency[i]);

		int maxFrequency = 0;
		int index = 0;
		for(int i = 0; i <= str.length(); ++i){
			if(frequency[i] >= maxFrequency){
				maxFrequency = frequency[i];
				index = i;
			}
		}
		System.out.println("The highest occuring digit is " + index + " occuring " + maxFrequency + " time(s)");
		//return index 
	}

}
