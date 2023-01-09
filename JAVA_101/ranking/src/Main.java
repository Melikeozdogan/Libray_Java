
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num1,num2,num3;
        Scanner input=new Scanner(System.in);

        System.out.println("Hello , please enter 3 numbers below");
        System.out.println("enter number one : ");
        num1=input.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("enter number two : ");
        num2=input.nextInt();
        System.out.println("----------------------------------------------");

        System.out.println("enter number three : ");
        num3=input.nextInt();


        if (num1 > num2)
        {
            if (num1 > num3)
            {
                System.out.println("Largest number: "+num1);
            }
            else
            {
                if(num3>num2)
                {
                    System.out.println("Largest number: "+num3);

                }
            }
        }
        else
        {
            if (num2>num3)
            {
                System.out.println("Largest number: "+num2);

            }
            else
            {
                if (num3>num1)
                {
                    System.out.println("Largest number: "+num3);

                }
                else
                {
                    System.out.println("Largest number: "+num1);

                }
            }
        }






    }
}