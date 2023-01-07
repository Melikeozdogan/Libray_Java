import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,act;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1=input.nextInt();
        System.out.println("Enter the second number: ");
        num2=input.nextInt();
        System.out.println("1) Collection\n2) Extraction \n3) Multiplication \n4) Division");
        System.out.println("Select the action: ");
        act=input.nextInt();
        input.close();

        switch (act)
        {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("İnvalid transaction number entered");
                break;

        }




    }
}