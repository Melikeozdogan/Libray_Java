import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int year,cal;


        Scanner input =new Scanner(System.in);
        System.out.println("Enter year of birth");
        year=input.nextInt();

        cal=year % 12;

        switch (cal)
        {
            case 0:
                System.out.println("Your Chinese Zodiac: "+ "Monkey");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac: "+ "Cockerel");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac: "+ "Dog");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac: "+ "Pig");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac: "+ "Mouse");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac: "+ "Steer");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac: "+ "Tiger");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac: "+ "Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac: "+ "Dragon");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac: "+ "Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac: "+ "Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac: "+ "Sheep");
                break;



        }





    }
}