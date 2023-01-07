import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String username="admin";
       String password="1234";

       String inputuser;
       String inputpass;

       Scanner input =new Scanner(System.in);

        System.out.println("Enter your username");
        inputuser=input.nextLine();
        System.out.println("enter your password");
        inputpass=input.next();

        if (inputuser.equals(username) )
        {
            if (inputpass.equals(password))
            {
                System.out.println("Login successful");
            }
            else
            {
                System.out.println("The password entered is incorrect");
                System.out.println("-----------------------------------");
                System.out.println("Press 1 to reset your password");
                int s=input.nextInt();
                 if (s == 1)
                 {
                     while(true) {
                         System.out.println("-----------------------------------");
                         System.out.println("Enter new password: ");
                         String newpass = input.next();

                         if (newpass.equals(password)) {
                             System.out.println("Your new password cannot be the same as your old password.");
                             System.out.println("Try again");
                         }
                         else
                         {
                             password=newpass;
                             System.out.println("Your new password has been created");
                             break;
                         }
                     }
                 }

            }
        }


    }
}