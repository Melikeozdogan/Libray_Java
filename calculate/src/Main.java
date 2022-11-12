
import java.util.Collection;
import java.util.Scanner;

public class Main {




    public static void main(String[] args)
    {
        System.out.println("Enter the first number: ");
        Scanner input1=new Scanner(System.in);
        int num1= input1.nextInt();
        System.out.println("Enter the second number: ");
        Scanner input2=new Scanner(System.in);
        int num2=input2.nextInt();

        System.out.println("1)Collection");
        System.out.println("2)Extraction");
        System.out.println("3)Impact");
        System.out.println("4)Divide");

        System.out.println("enter the process number: ");
        Scanner input3=new Scanner(System.in);
        int num3=input3.nextInt();

        switch (num3)
        {
            case 1:

                System.out.println(collection(num1,num2));
                break;
            case 2:

                System.out.println(extraction(num1,num2));
                break;
            case 3:

                System.out.println(impactt(num1,num2));
                break;
            case 4:

                System.out.println(divide(num1,num2));
                break;
            default:
                System.out.println("Your enter input false try again ");
                break;

        }


    }

    public static int collection(int a,int b)
    {
        return a + b;
    }

    public static int extraction(int a,int b)
    {
        if (a>b)
        {
            return a-b;
        }
        else
        {
            return b-a;
        }
    }

    public static int impactt(int a,int b)
    {
        return a*b;
    }

    public static int divide(int a,int b)
    {
        return a/b;
    }
}