
package View;

import Controller.Manager;
import Model.Contact;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Contact> lc = new ArrayList<>();
        Manager mn = new Manager();
        lc.add(new Contact(1, "Nam Phong", "Diamond", "Viet Nam", "1234567890", "Nam", "Phong"));
        lc.add(new Contact(2, "Lyoko Satoru", "Star", "Japan", "1234567890", "Lyoko", "Satoru"));
        lc.add(new Contact(3, "Paul Sanchez", "Diamond", "Spain", "1234567890", "Paul", "Sanchez"));
        while(true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.createContact(lc);
                    break;
                case 2:
                    mn.printAllContact(lc);
                    break;
                case 3:
                    mn.deleteContact(lc);
                    break;
                case 4:
                    return;
                    
            }
        }
    }
}
