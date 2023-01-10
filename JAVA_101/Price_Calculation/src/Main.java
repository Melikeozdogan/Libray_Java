
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int distance,age,trip;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the distance: ");
        distance=input.nextInt();

        System.out.println("Enter your age: ");
        age= input.nextInt();

        System.out.println("Enter the type of trip (1 => One Way, 2 => Round Trip):");
        trip= input.nextInt();


        if (distance<0 || age<0 || trip <0 || trip >2)
        {
            System.out.println("You entered wrong data");
        }
        else
        {
            double price=distance * 0.10;

            if (age <12)
            {
                double a= price * 0.50;
                price=price-a;
            }
            else if(age>=12 && age <= 24)
            {
                double b=price * 0.10;
                price=price-b;

            }
            else if (age >=65)
            {
                double c=price * 0.30;
                price=price-30;

            }



            if (trip==1)
            {
                System.out.println("Total amount: "+ price);
            }
            else
            {
                price=price*2;
                double d=price * 0.20;
                price=price-d;

                System.out.println("Total amount: "+ price);


            }

        }














    }
}