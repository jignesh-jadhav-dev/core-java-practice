package day_29_File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File_Handling {

	public static void main(String[] args) {
		try {
			File file = new File("Jignesh.txt");  // create a file
			
			if(file.createNewFile()) {  // this method is use to create a new file
				System.out.println("file is created : "+file.getName()+"\n");  // this method is to get file name
			}else {
				System.out.println("file alredy exists \n");
			}
			
			
			FileWriter fw = new FileWriter(file);  // this is class use to provide method for writing the data inside file 
			fw.write("Hello Java \n");
			fw.write("This is File Handling Example \n");
			fw.write(".write()  is use to write the data inside file \n");
			fw.write("This is Created by Jignesh Jadhav It-self \n");
			fw.close();   // Mandatory to close after writing data into file
			
			
			FileReader fr = new FileReader(file); // this is class use to provide method for Reading the data from file
			
			int i;
			
			System.out.println("Reading file content \n");
			
			while ((i=fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();    // Mandatory to close after Reading file
			
			if(file.delete()) {
				System.out.println("file is deleted successfully \n");
			}else {
				System.out.println("failed to delete the file \n");
			}
			
			
		} catch (IOException e) {
		}
	}
}
