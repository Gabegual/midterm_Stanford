import java.util.ArrayList;
import java.util.Scanner;

public class problem5 {
	public static void main(String[] args) {
		Scanner Names = new Scanner(System.in);
		while (true) {
			System.out.print("Input numbers: ");
			String n = Names.nextLine();
			if (n.equals("")) {
				break;
			} else {
				removeDoubleLetters(n);
			}
		}
	}

	public static void removeDoubleLetters(String n) {
		char c = n.charAt(0);
		String temp = null;
		StringBuilder temp2 = new StringBuilder();
		for (int x = 0; x < n.length(); x++) {
			if ((x + 1) < n.length()) {
				c = n.charAt(x);
				if (c == n.charAt(x + 1)) {
					if (temp == null) {
						temp = n.substring(0, x) + n.substring(x + 1, n.length());
						temp2.append(temp);
					} else {
						temp2.replace(x - 1, n.length(), n.substring(x + 1, n.length()));
					}
				}
			}
		}
		System.out.println(temp2.toString());
	}
}
