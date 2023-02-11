import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter n number:");
        int n=input.nextInt();
        System.out.println("Enter r number: ");
        int r=input.nextInt();

        int fn=1,fr=1,fnr=1;

        for (int i = 1; i <= n; i++) {
            fn *= i;
        }
        for (int i = 1; i <= r; i++) {
            fr *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            fnr *= i;
        }

        double cal=fn / (fr * fnr);
        System.out.println("C(n,r) ="+cal);









    }
}