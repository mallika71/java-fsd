package fileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class readFile {

	public static void main(String[] args) throws IOException {
		char[] data = new char[100];
		try {
			FileReader input = new FileReader("data.txt");
			input.read(data);
			System.out.println("data is received from a file");
			System.out.println(data);
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("file read error...");
		}
		

	}

}
