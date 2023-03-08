package EmployeeWage.utility;

import java.io.File;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHandlingOfSelf {

	static File file = new File("EmployeePayrolls.txt");

	//create file
	public void createFile() {
		try {
			file.createNewFile();
			System.out.println(" File Created :: " + file.getName());
		}catch(IOException e) {
			e.printStackTrace();
			System.err.println(" Unable to Create File");
		}
	}

	//write file
	public void writeFile(String stringInput) {
		try {
			FileWriter fileWriter = new FileWriter(file,true);
			fileWriter.append(stringInput+'\n');
			fileWriter.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	//read file
	public void readFile() {
		try {
			Scanner readFile = new Scanner(file);
			while(readFile.hasNextLine()) {
				String readLine = readFile.nextLine();
				System.out.println(readLine);
			}
			readFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	//delete file
	public void deleteFile() {
		if(file.delete()) {
			System.out.println(" File Discarded :: " + file.getName());
		}else {
			System.err.println(" Unable to delete file ");
		}
	}




}
