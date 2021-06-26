package phase1.core.java.project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Project {

	public static String CurDir = "Simplelearn_Project_example";
	
	public static void DevDetails() {
		System.out.println("Welcome to my Project1");
		System.out.println("Developer details:");
		System.out.println("Name: Duc Tran");
		System.out.println("Email: tranducquang196@gmail.com\n");
	}
	public static void Menu() {
		System.out.println("\nWorking Directory = " + CurDir);
		System.out.println("\nPlease choose one of the below options.");
		System.out.println("1. Return current file names in ascending order.");
		System.out.println("2: Add file.");
		System.out.println("3. Delete file.");
		System.out.println("4. search a file.");
		System.out.println("5. Exit");
		System.out.println("Please select an option (1>5): ");
	}


	public static void listFilesInFolder() {
		List<String> results = new ArrayList<String>();


		File[] files = new File(CurDir).listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		    if (file.isDirectory()) {
		    	results.add(file.getName());
		    }
		}
		Collections.sort(results);
 
		for(int i = 0; i < results.size(); i++) {   
		    System.out.println(results.get(i));
		}  
	}
	
	public static void  CreateFile( String fileName) {
		String name = CurDir.concat("/"+fileName);
		try {
            File file = new File(name);
            if(file.createNewFile())
                System.out.println(fileName +" created successfull");
            else
                System.out.println("Error while creating File, " + fileName+ " already exists in specified path");
        }
        catch(IOException io) {
            io.printStackTrace();
        }

	}
	
	public static void DeleteFile (String fileName) {
		String name = CurDir.concat("/"+fileName);
		
		try  {         
			File f= new File(name);           //file to be delete  
			if(f.delete()) {  
				System.out.println(fileName + " deleted");   //getting and printing the file name  
			}  
			else {  
				System.out.println(fileName + " doesn't exist or has been deleted");
			}  
		}  catch(Exception e) {  
			e.printStackTrace(); 	 
		}  
	}
	
	public static void SearchFile(String fileName) {
		List<String> results = new ArrayList<String>();


		File[] files = new File(CurDir).listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		    if (file.isDirectory()) {
		    	results.add(file.getName());
		    }
		}
		
		if( results.contains(fileName)) {
			System.out.println(fileName + " has been found");
		}else {
			System.out.println(fileName + " doesn't exist in the directory");
		}
	}
	public static void main(String[] args) {
		DevDetails();
		
		Menu();
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		String fileName;
		String secondChoice;
		
		while (choice > 0 && choice < 5) {
			switch(choice) {
			
			case 1:
				listFilesInFolder();
				
				//go back to main menu
				System.out.println("\nBack to main menu(B) or exit application(E)");
				secondChoice  = input.next();
				
				//exit the application
				if(secondChoice.equalsIgnoreCase("E")) {
					choice = 5;
					continue;
				}
				break;
				
			case 2: 
				do {
					System.out.println("Enter file name: ");
					fileName = input.next();
					CreateFile(fileName);
					
					System.out.println("\n Add more file(A) or exit(E)");
					secondChoice  = input.next();
					
				} while (secondChoice.equalsIgnoreCase("A"));
				break;
				
			case 3: 
				do {
					System.out.println("Enter file name: ");
					fileName = input.next();
					
					DeleteFile(fileName);
					
					System.out.println("\n Delete more file(D) or exit(E)");
					secondChoice  = input.next();
					
				} while (secondChoice.equalsIgnoreCase("D"));
				break;
				
			case 4:
				do {
					System.out.println("Enter file name: ");
					fileName = input.next();
					SearchFile(fileName);
					
					System.out.println("\n Search another file(S) or exit(E)");
					secondChoice  = input.next();
					
				} while (secondChoice.equalsIgnoreCase("S"));
				break;
			
			}
			
			
			Menu();
			choice = input.nextInt();
		}
		
		System.out.println("Thank you for using our applicaiton!");

	}

}
