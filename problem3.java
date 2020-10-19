import java.util.ArrayList;
import java.util.Scanner;

/*This program grabs the largest and second largest numbers from the users input.
 * Created by Robert Johns
 */
public class problem3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> names = new ArrayList<Integer>();
		while (true) {
			System.out.print("Input numbers: ");
			String n = s.nextLine();
			if (n.equals("")) {
				break;
			} else {
				names.add(Integer.parseInt(n));
			}
		}
		
		System.out.println();
		System.out.println("Values: ");
		System.out.println();
		int largest = largestNumber(names);
		int secondLargest = secondLargestNumber(names);
		
		
	}
	
	public static int secondLargestNumber(ArrayList<Integer> n) {
		int temp = n.get(0);
		int temp2 = n.get(1);
		for (int z : n) {
			if (z >= temp) {
				temp2 = temp;
				temp = z;
			}
		}
		System.out.println("Second Largest: " + temp2);
		return temp2;
	}

	public static int largestNumber(ArrayList<Integer> n) {
		int temp = n.get(0);
		for (int z : n) {
			if (z >= temp) {
				temp = z;
			}
		}
		System.out.println("Largest: " + temp);
		return temp;
	}
}
