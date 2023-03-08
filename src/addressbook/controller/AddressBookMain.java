package addressbook.controller;



import java.util.Scanner;



import addressbook.interfaces.InterfaceAddressBook;
import addressbook.model.Contacts;
import addressbook.services.AddressBookImplementation;
import addressbook.utility.FileHandlingOfSelf;

public class AddressBookMain {


	private static Scanner getUserInput= new Scanner(System.in);


	public static void main(String[] args) {

		InterfaceAddressBook adressBook=new AddressBookImplementation();

		Contacts contacts = null;

		FileHandlingOfSelf fileHandlingOfSelf = new FileHandlingOfSelf();

		adressBook.welcomeMessage();

		byte menueChoice=0;

		do {
			System.out.println("  ::>>>Adress Book<<<::  ");
			System.out.println("1.Create File");
			System.out.println("2.Add New Contacts");
			System.out.println("3.Show all Contact");
			System.out.println("4.Delete all Contact");

			byte userChoice=getUserInput.nextByte();
			switch (userChoice) 
			{ 
			case 1:
				fileHandlingOfSelf.createFile();
				break;
			case 2:
				contacts = getContacts();
				int index = adressBook.createContacts(contacts);
				System.out.println(" Contact_ID :: " + index+'\n'+contacts);

				break;
			case 3:
				System.out.println("Show All Contacts :: ");
				adressBook.showAllContacts();
				break;
			case 4:
				System.out.println("Delete File ::");
				fileHandlingOfSelf.deleteFile();
				break;

			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Press 1 to continue "+'\n'+"Press any number to exit");
			menueChoice=getUserInput.nextByte();


		} while (menueChoice==1);


	}
	private static Contacts getContacts()
	{
		Contacts contacts= new Contacts();
		System.out.println("Enter First Name");
		String firstName =getUserInput.next();
		contacts.setFirstName(firstName);

		System.out.println("Enter Last Name");
		String lastName =getUserInput.next();
		contacts.setLastName(lastName);

		System.out.println("Enter PhoneNumber");
		long phoneNumber =getUserInput.nextLong();
		contacts.setPhoneNumber(phoneNumber);

		System.out.println("Enter EmailId");
		String email =getUserInput.next();
		contacts.setEmail(email);

		System.out.println("Enter Adress");
		String adress =getUserInput.next();
		contacts.setAddress(adress);

		System.out.println("Enter City");
		String city =getUserInput.next();
		contacts.setCity(city);

		System.out.println("Enter State");
		String state =getUserInput.next();
		contacts.setState(state);

		System.out.println("Enter Zipcode");
		int zip =getUserInput.nextInt();
		contacts.setZip(zip);

		System.out.println(" Enter Aadhar_Number:");
		long adhar=getUserInput.nextLong();
		contacts.setAadharCardNumber(adhar);


		return contacts;

	}

}
