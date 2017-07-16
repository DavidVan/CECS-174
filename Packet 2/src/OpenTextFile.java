/* Read with nextLine which will read over the white space and include it as well*/
import java.util.*;//for scanner
import java.io.*;//for opening text file
class OpenTextFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(new File("namesWithSpaces.txt"));//Mod. file
		PrintWriter pw = new PrintWriter(new File("newnamesver2.txt"));//External file
		String firstName, middleName, lastName;//The initializations outside the loop
		while (scanner.hasNext()) {
			String fullName = scanner.nextLine();//get the entire line
			StringTokenizer st = new StringTokenizer(fullName, " ");
			firstName = st.nextToken();
			middleName = st.nextToken();
			lastName = st.nextToken();
			//output to console and to the external file called "newnamesver2.txt""
			System.out.println(firstName.substring(0,1)+". "+middleName.substring(0,1)+". "+lastName);
			//goes to the external file here
			pw.println(firstName.substring(0,1)+". "+middleName.substring(0,1)+". "+lastName);
		}
		scanner.close();//Remember to close things up
		pw.close();
	}
}
