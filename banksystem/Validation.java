/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
package banksystem;

//Pascalcase for class name 
public class Validation {
    // camelcase for method name
    public static boolean validateName(String name) {

        // Check if name length is between 5 and 20 characters
        if (name.length() < 3 || name.length() > 20) {
            System.out.println("Make sure your Lenght name is between 5 and 20 ");
            return false;

        }

        // Check if each character in the name is alphabetic
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i)) && name.charAt(i) != ' ') {
                System.out.println("Make sure your name is Alphabetic ");
                return false;
            }
        }

        return true;
    }

    public static boolean validatePass(String pass) {
        if (!(pass.length() >= 8)) {

            System.out.println("Make sure your password " + pass + " is more than 8 characters ");
            return false;
        }
        if (!(pass.length() <= 20)) {
            System.out.println("Make sure your password " + pass + " is less than 20 characters ");
            return false;
        }
        return true;
    }

    public static boolean validateBalance(double balance) {
        if (balance > 0)
            return true;
        return false;
    }

    public static boolean validateSalary(double salary) {

        // Define the maximum salary limit.
        // snak_case for constant name
        final double MAX_SALARY = 10000000.0;

        if (salary > 0 && salary <= MAX_SALARY) {
            return true;
        } else {
            return false;
        }
    }
}
