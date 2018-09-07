package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readFile {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis =new FileInputStream("temp.txt");
			int i;
		
				while((i=fis.read())!=-1)
				{
					System.out.print((char)i);
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
