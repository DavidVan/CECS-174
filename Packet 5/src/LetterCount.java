// Demonstrates the relationship between arrays and strings.
import java.util.Scanner;
public class LetterCount { // Reads a sentence from the user and counts the number of
	public static void main(String[] args) { // upper and lowercase letters contained in it.
		final int NUMCHARS = 26;
		Scanner scan = new Scanner(System.in);
		int[] upper = new int[NUMCHARS];
		int[] lower = new int[NUMCHARS];
		char current; // the current character being processed
		int other = 0; // counter for non-alphabetics
		System.out.println("Enter a sentence: ");
		String line = scan.nextLine(); // SHows how to get a complete line of text.
		// Count the number of each letter occurence.
		for (int ch = 0; ch < line.length(); ch++) {
			current = line.charAt(ch); // traverse through the array
			if (current >= 'A' && current <= 'Z') {
				upper[current-'A']++; // 'E' = 69 is the current char then by UNICODE 'A' = 65
			}						  // so the index is correct 69-65 = position 4
			else if (current >= 'a' && current <= 'z') {
					lower[current-'a']++; // Hre the' UNICODE is not 65 but 97
				}						  // and the offset is correct again for the index number.
			else {
				other++;
			}
		}
		// Print the results
		System.out.println();
		for (int letter = 0; letter < upper.length; letter++) {
			System.out.print((char)(letter + 'A'));
			System.out.print(": " + upper[letter]);
			System.out.print("\t\t" + (char)(letter + 'a'));
			System.out.println(": " + lower[letter]);
		}
		System.out.println();
		System.out.println("Non-alphabetic characters: " + other);
	}
}
