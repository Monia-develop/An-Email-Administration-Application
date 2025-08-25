import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departement;
    private int mailboxCapacity;
    private String AlternateEmail;



    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call a method asking for the departement - return the departement
        this.departement = setDepartement();
    }

    //ask for the departement
    private String setDepartement() {
        System.out.print("Enter the departement\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        }
        else if (depChoice == 2){
            return "dev"; 
        }
        else if (depChoice == 3) {
            return "acct";
        }
        else {
            return "";
        }
    }
    //Generate a random password 
    //Set the mailbox capacity
    //Set the alternate email
    //Change the password
}