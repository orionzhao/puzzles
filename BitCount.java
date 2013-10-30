import java.util.*;


public class BitCount {
	public static void main(String args[]) {
		Scanner user_input = new Scanner(System.in);
		int order = user_input.next();
		ArrayList<int> input = new ArrayList<int>();
		while (user_input.next() != null) {
			String input_string = user_input.next();
			int value = Integer.parseInt(input_string);
			input.add(value);
		}
		int output = compute(input, order);
		System.out.println(output);

//		a = Integer.highestOneBit(3);
	
	}
	static int compute(ArrayList input, int order) {
		int[][] table = new int[32][32];
		while (input.Iterator<int>.hasNext()) {
			int value = input.Iterator<int>.next();
			table[value.BitCount()][value.highestOneBit()] = value;
		}
		
		return input;
	}
}