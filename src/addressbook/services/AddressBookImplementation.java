package addressbook.services;



import java.util.Scanner;


import addressbook.interfaces.InterfaceAddressBook;
import addressbook.model.Contacts;
import addressbook.utility.FileHandlingOfSelf;




public class AddressBookImplementation implements InterfaceAddressBook

{

	private static Scanner getDetailInput = new Scanner(System.in);
	FileHandlingOfSelf selHandling = new FileHandlingOfSelf();//FileHandling


	public void welcomeMessage() 
	{
		System.out.println("<<<<<Welcome To AdressBook>>>>>");	
	}

	//FileHandling
	public int createContacts(Contacts contacts) {
		System.out.println(" List of All the Contscts ");
		return selHandling.writeFile(contacts);	
		
	}		
	//FileHandling
	public void showAllContacts() 
	{
		System.out.println(" Contacts We Have ");
		selHandling.readFile();				
	}

	







}
