package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class readFileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Scanner sc = new Scanner(System.in);
			FileWriter fw=new FileWriter("Write.txt");
			BufferedWriter br=new BufferedWriter(fw);
			
			while(true)
			{
				String str=sc.nextLine();
				if(str.equals("stop"))
				{
					break;
				}
				else
				{
					br.write(str+"\n");
				}
			}
			sc.close();
			br.close();
			fw.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
