

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomWord {

	/*
	 * public static void main(String[] args) {
	 * System.out.println(Math.random());
	 * 
	 * System.out.println(Math.random()*100);
	 * 
	 * 
	 * for (int i = 0; i < 50; i++) { System.out.println(generateWord()); }
	 * 
	 * }
	 */

	public static String generateWord() {
		String[] beforeShuffle = new String[] { "0", "1", "2", "3", "4", "5",
				"6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H",
				"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z" };
		List<String> list = Arrays.asList(beforeShuffle);
		Collections.shuffle(list);
		StringBuilder sb = new StringBuilder();
		for (String str : list) {
			sb.append(str);
		}

		return sb.toString().substring(5, 9);
	}
}
