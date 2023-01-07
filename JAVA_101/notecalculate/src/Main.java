import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double math,physics,turkish,chemistry,music,avg = 0;
        int i= 0;
        Scanner input=new Scanner(System.in);

            System.out.println("Enter your math grade:");
            math=input.nextDouble();

            if (math >=0 && math <=100)
            {
                avg=avg+math;
                i++;

            }

            System.out.println("Enter your physics grade:");
            physics=input.nextDouble();

            if (physics >=0 && physics <=100)
            {
                avg=avg+physics;
                i++;

            }

            System.out.println("Enter your turkish grade:");
            turkish=input.nextDouble();

            if (turkish >=0 && turkish <=100)
            {
                avg=avg+turkish;
                i++;

            }

            System.out.println("Enter your chemistry grade:");
            chemistry=input.nextDouble();

            if (chemistry >=0 && chemistry <=100)
            {
                avg=avg+chemistry;
                i++;

            }

            System.out.println("Enter your music grade:");
            music=input.nextDouble();

            if (music >=0 && music <=100)
            {
                avg=avg+music;
                i++;

            }


        double v = avg / i;
        System.out.println("Your average: " + v);

        if(avg >= 55)
        {
            System.out.println("You passed");
        }
        else
        {
            System.out.println("You stayed");
        }




















    }
}