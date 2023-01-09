
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int month,day;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month you were born(1-12): ");
        month=input.nextInt();
        System.out.println("enter the day you were born(1-31): ");
        day=input.nextInt();

        if(month== 1)
        {
             if(day >= 1 && day <= 21)
             {
                 System.out.println("Your zodiac sign: ");
                 System.out.println("Capricorn/Oğlak");
             }
             else if (day >=22 && day <=31)
             {
                 System.out.println("Your zodiac sign: ");
                 System.out.println("Aquarius/Kova");
             }
             else
             {
                 System.out.println("Invalid day entered");
             }
        }
        else if (month == 2)
        {
            if(day >= 1 && day <= 19)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Aquarius/Kova");

            }
            else if (day >=20 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Pisces/Balık");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 3)
        {
            if(day >= 1 && day <= 20)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Pisces/Balık");

            }
            else if (day >=21 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Aries/Koç");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 4)
        {
            if(day >= 1 && day <= 20)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Aries/Koç");

            }
            else if (day >=21 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Taurus/Boğa");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 5)
        {
            if(day >= 1 && day <= 21)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Taurus/Boğa");


            }
            else if (day >=22 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Gemini/İkizler");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 6)
        {
            if(day >= 1 && day <= 22)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Gemini/İkizler");


            }
            else if (day >=23 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Cancer/Yengeç");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 7)
        {
            if(day >= 1 && day <= 22)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Cancer/Yengeç");


            }
            else if (day >=23 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Leo /Aslan");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 8)
        {
            if(day >= 1 && day <= 22)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Leo /Aslan");


            }
            else if (day >=23 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Virgo/Başak");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 9)
        {
            if(day >= 1 && day <= 22)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Virgo/Başak");


            }
            else if (day >=23 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Libra /Terazi");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 10)
        {
            if(day >= 1 && day <= 22)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Libra /Terazi");


            }
            else if (day >=23 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Scorpio/Akrep");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 11)
        {
            if(day >= 1 && day <= 21)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Scorpio/Akrep");


            }
            else if (day >=22 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Sagittarius /Yay");
            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else if (month == 12)
        {
            if(day >= 1 && day <= 21)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Sagittarius /Yay");


            }
            else if (day >=22 && day <=31)
            {
                System.out.println("Your zodiac sign: ");
                System.out.println("Capricorn/Oğlak");

            }
            else
            {
                System.out.println("Invalid day entered");
            }
        }
        else
        {
            System.out.println("İnvalid month entered try again");
        }


    }
}