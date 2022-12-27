package webdriverBasics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		
			String 	Fpath = "C:\\Users\\dell\\Desktop\\My Resume 2022\\Legal letter.docx";
			
			BufferedReader bf = new BufferedReader(new FileReader (Fpath));
			
			String सेवा;
			
			while ((सेवा = bf.readLine())!=null)
			{
				System.out.println(सेवा);
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
