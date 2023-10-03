/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;

/**
 *
 * @author AN515-57
 */
public class Validate {
    public int checkInputIntLimit(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int result = Integer.parseInt(sc.nextLine().trim());
            try {
            if(result < min || result > max) {
                throw new NumberFormatException();
            }
            return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "] ");
                System.out.print("Enter again");
            }
    }
    }
    
    public String checkInputString() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String result = sc.nextLine().trim();
            if(result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    public boolean checkInputYN() {
        while(true) {
            String result = checkInputString();
            if(result.equalsIgnoreCase("Y")) {
                return true;
            } 
            if(result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again");
        }
    }
    
    public int checkInputInt() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public String checkInputPhone() {
        String VALID_PHONE = "^[0-9()-\\. ]{10,}$";
        while(true) {
            String result = checkInputString();
            if(result.matches(VALID_PHONE)) {
                return result;
            }
            System.err.println("""
                               Please input Phone flow
                                12345678
                                123-456-7890 
                                123-456-7890 x1234
                                123-456-7890 ext1234
                                (123)-456-7890
                                123.456.7890
                                123 456 7890""");
            System.out.print("Enter again: ");
        }
    }
}
