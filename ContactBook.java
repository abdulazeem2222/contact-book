import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add a new contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    // Update a contact
    public void updateContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) 
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter new phone number: ");
                contact.setPhone(scanner.nextLine());

                System.out.print("Enter new email: ");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // Delete a contact
    public void deleteContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // Search for a contact
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
