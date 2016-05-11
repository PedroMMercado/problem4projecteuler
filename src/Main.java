
public class Main {

	public static void main(String[] args) {
		// Largest palindrome product
		// Find the largest palindrome made from the product of two 3-digit numbers.
		String temp = "";
		StringBuilder tempReversed = new StringBuilder();
		int currentMax = -1;
		for(int i = 100; i < 1000;i++){
			for(int j = 100; j < 1000;j++){
				temp = "" + i * j;
//				System.out.println(temp);
				tempReversed.append(temp);
				tempReversed.reverse();
//				System.out.println(tempReversed);
				if(temp.equals(tempReversed.toString())){
					if(i * j > currentMax)
						currentMax = i * j;
					System.out.println(temp);
				}
				temp = "";
				tempReversed.setLength(0);
			}
		}
		System.out.println("Max product is " + currentMax);
	}

}
