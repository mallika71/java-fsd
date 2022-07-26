package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcepHan {

	public static void main(String[] args)  {
		
		ExcepHan obj = new ExcepHan();
		try {
			obj.readFromFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	void readFromFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("c:\\temp\\tes.txt");
	}

}