package maxNum;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// I have an array, tell me how you can find the max value inside the array?
		
		int [] digitSet = {-5,-6,-2,-55};
		
		System.out.println(MaxNumberValue(digitSet));
		
	}
	
	public static int MaxNumberValue(int[] numbers) {
		
		int max = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			
			//System.out.println(numbers[i]);
			
			if (max < numbers[i]) {
				max = numbers[i];
			}
			
		}
		return max;
		
	}

}
