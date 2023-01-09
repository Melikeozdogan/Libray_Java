import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter temperature value");
        heat=input.nextInt();
        input.close();

        if (heat <5)
        {
            System.out.println("Recommended activity: ");
            System.out.println("Skiing");
            
        }
        else if (heat >= 5 && heat <15)
        {
            System.out.println("Recommended activity: ");
            System.out.println("Cinema");
        }
        else if(heat >= 15 && heat <25)
        {
            System.out.println("Recommended activity: ");
            System.out.println("Picnic");
        }
        else if (heat >= 25)
        {
            System.out.println("Recommended activity: ");
            System.out.println("Swimming");
        }
        else
        {
            System.out.println("Sorry, we couldn't find any suggestions");
        }


    }
}