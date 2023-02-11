
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();;
        int c = 0,total=0;
        for (int i=0;i<num;i++)
        {

            if(i % 3==0 && i % 4==0)
            {
              c++;
              total=total+i;


            }


        }

        double avg=total/c;
        System.out.println("Average: "+avg);





    }
}