import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Contact Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, phone, email);
                    contactBook.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter name of the contact to update: ");
                    String updateName = scanner.nextLine();
                    contactBook.updateContact(updateName);
                    break;

                case 3:
                    System.out.print("Enter name of the contact to delete: ");
                    String deleteName = scanner.nextLine();
                    contactBook.deleteContact(deleteName);
                    break;

                case 4:
                    System.out.print("Enter name of the contact to search: ");
                    String searchName = scanner.nextLine();
                    contactBook.searchContact(searchName);
                    break;

                case 5:
                    contactBook.displayContacts();
                    break;

                case 6:
                    System.out.println("Exiting Contact Book. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
