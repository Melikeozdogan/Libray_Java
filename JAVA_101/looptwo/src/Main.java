
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num;
        int total=0;
        boolean a=true;

        do{
            Scanner input=new Scanner(System.in);
            System.out.println("Enter number: ");
            num=input.nextInt();

            if (num % 2==0 ){

            if ( num % 4==0)
            {
                total+=num;
            }}
            else
            {
                a=false;

            }




        }while (a);

        System.out.println("Total:"+total);
    }
}