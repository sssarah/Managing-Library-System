package Library_Management_System;

import Library_Management_System1.Admin;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main_Library_Methods {
    static String documentName= null;
	static Book_Store BS = new Book_Store();
	static Scanner in = new Scanner(System.in);
	static Boolean Operating = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 while(Operating){
	 System.out.println("\n Enter 0 for load a Book_Store."+
 "\n Enter 1 for save and exite" + 
			 "\n Enter 2 for List all Publication in Book_Store"+ 
			 "\n Enter 3for add_Publication to Book_Store ");
	 
	 int outcome = in.nextInt();
	 switch(outcome){
	 case 0:
		 System.out.println("Enter the document name to load");
		documentName = in.next();
		 LoadScript(documentName);
		 break;
		 
	 case 1:
		 SaveAndExite();
		 break;
	 case 2:
		 System.out.println(BS.toString());
		 break;
     case 3:
    	 addPublication();
    	 
		 
     	 break;
}	  
		 
	 }
	System.exit(0);
	

}
 private static void addPublication() {
		// TODO Auto-generated method stub
	    int isbn;
		String heading, writer;
		double fees;
		System.out.println("\nEnter heading: ");
		heading = in.next();
		
		System.out.println("\nEnter writer: ");
		writer = in.next();
		
		System.out.println("\nEnter isbn: ");
		isbn = in.nextInt();
		
		System.out.println("\nEnter fees: ");
		fees = in.nextDouble();
		
		Puplication p = new Puplication(isbn, heading, writer, fees);
	BS.Add_Publication(p);
	}
	

	private static void SaveAndExite() {
		// TODO Auto-generated method stub
		System.out.println("Enter document name: ");
		documentName = in.next()+ ".ser";
		Operating = false;
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(documentName + ".ser");
			out = new ObjectOutputStream(fos);
			out.writeObject(BS);
			fos.close();
			out.close();
			
		}catch (FileNotFoundException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
			}
		}
	
	
	
	private static void LoadScript(String name) {
		
		// TODO Auto-generated method stub
		{
			FileInputStream fis = null;
			 ObjectInputStream in = null;
			 
			 File document= new File(documentName);
			 if (document.exists()){
			 try {
				fis = new FileInputStream(document);
				in = new ObjectInputStream(fis);
				BS = (Book_Store) in.readObject();
				fis.close();
				in.close();
			 } 
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 }else {
				 System.out.println("/n this document does not exisit!");
				
		 }
	}
	}

	//try to borrow a publication
		Admin A= new Admin();
		
		Puplication p = A.borrowPublication();
		
		System.out.println("borrowed publication: " + p);
		System.out.println("Updated publication list: " + A);

		
	
}


				
		
			
				
	
	
		
	
	 
	 
	
	 