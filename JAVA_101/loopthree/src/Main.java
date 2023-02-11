
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= input.nextInt();
        System.out.println("Powers of 4:");
        for (int i=1;i<=num;i++)
        {
            int a= (int) Math.pow(4,i);
            System.out.println(a);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Powers of 5:");
        for (int j=1;j<=num;j++)
        {
            int b= (int) Math.pow(4,j);
            System.out.println(b);
        }



    }
}