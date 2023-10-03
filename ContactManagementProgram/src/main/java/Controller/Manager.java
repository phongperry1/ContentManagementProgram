
package Controller;

import Model.Contact;
import View.Validate;
import java.util.ArrayList;


public class Manager {
    Validate vl = new Validate();
    public int menu() {
        System.out.println("1. Add a contact.");
        System.out.println("2. Display all contact.");
        System.out.println("3. Delete a contact");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = vl.checkInputIntLimit(1, 4);
        return choice;
    }
    
    public void createContact(ArrayList<Contact> lc) {
        System.out.print("Enter id contact: ");
        int contactId = vl.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = vl.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = vl.checkInputString();
        System.out.print("Enter group: ");
        String group = vl.checkInputString();
        System.out.print("Enter address: ");
        String address = vl.checkInputString();
        System.out.print("Enter phone: ");
        String phone = vl.checkInputPhone();
        lc.add(new Contact(contactId, lastName, group, address, phone, firstName, lastName));
        System.out.println("Add successful");
    }
    
    public void printAllContact(ArrayList<Contact> lc) {
        System.out.printf("%-10s%-30s%-25s%-25s%-25s%-25s%-25s\n", "Id", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (Contact contact : lc) {
            System.out.printf("%-10s%-30s%-25s%-25s%-25s%-25s%-25s\n", contact.getContactid(), contact.getFullName(), contact.getFirstname(), contact.getLastname(), contact.getGroup(), contact.getAddress(), contact.getPhone());
            
        }
    }
    
    public void deleteContact(ArrayList<Contact> lc) {
        System.out.print("Enter id: ");
        int idDelete = vl.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if(contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.out.println("Delete successful.");
    }
    
    public Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if(contact.getContactid() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}
