import java.util.Scanner;

public class program {

    public int secim;


    public program() {
        while (true) {
            System.out.printf("1-) Kahvaltı\n");
            System.out.println("2-) Öğle yemeği");
            System.out.println("3-)Akşam Yemeği\n");

            Scanner girdi1 = new Scanner(System.in);
            secim = girdi1.nextInt();

            switch (secim) {

                case 1:
                    System.out.println("Kahvaltı");
                    System.out.println("*******************************************************");
                    kahvalti();
        break;
                case 2:
                    System.out.println("Öğle Yemeği");
                    System.out.println("*******************************************************");
                    ogle();
        break;
                case 3:
                    System.out.println("Akşam Yemeği");
                    System.out.println("*******************************************************");
                    aksam();
        break;
                default:
                    System.out.println("Geçersiz işlem seçtiniz tekrar deneyin");
                    System.out.println("*******************************************************");
        break;
            }
        }

    }


    public void kahvalti()
    {
        //120
        int tkal=0;
        while(true)
        {
            System.out.println("Toplamda 120 kaloriyi aşmayacak şekilde terciklerinizi yazınız:");
            System.out.println("1-) 1 Kibrit kutusu peynir(50 kal)");
            System.out.println("2-) 1 adet haşlanmış yumurta(50 kal)");
            System.out.println("3-) 1 dilim tam buğday ekmeği(20 kal)");
            System.out.println("4-) 5 adet siyah zeytin (25 kal)");
            System.out.println("5-) 1 tatlı kaşığı tereyağ(25 kalori)");
            System.out.println("6-) 3 çay kaşığı reçel , pekmez veya marmelat(25 kalori)");
            System.out.println("7-) 1 dilim esmer ekmek (25 kalori)");
            System.out.println("8-) Bol yeşillik (yağsız)");

            System.out.println("*******************************************************");
            System.out.println("*******************************************************");

            System.out.println("Eklemek istediğiniz seçimi  giriniz: ");
            Scanner input =new Scanner(System.in);
            int a;
            a= input.nextInt();

            switch (a)
            {
                case 1:
                    if (tkal+50>120)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        System.out.println("*******************************************************");
                        break;

                    }
                    else
                    {
                        tkal += 50;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+tkal);
                        System.out.println("*******************************************************");
                        break;
                    }
                case 2:
                    if (tkal+50>120)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        System.out.println("*******************************************************");
                        break;
                    }
                    else
                    {
                        tkal += 50;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+tkal);
                        System.out.println("*******************************************************");
                        break;
                    }
                case 3:
                    if (tkal+20>120)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        System.out.println("*******************************************************");
                        break;
                    }
                    else
                    {
                        tkal += 20;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+tkal);
                        System.out.println("*******************************************************");
                        break;
                    }
                case 4:
                    if (tkal+25>120)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        System.out.println("*******************************************************");
                        break;
                    }
                    else
                    {
                        tkal += 25;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+tkal);
                        System.out.println("*******************************************************");
                        break;
                    }
                case 5:
                    if (tkal+25>120)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        System.out.println("*******************************************************");
                        break;
                    }
                    else
                    {
                        tkal += 25;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+tkal);
                        System.out.println("*******************************************************");
                        break;
                    }
                case 6:
                    if (tkal+25>120)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        System.out.println("*******************************************************");
                        break;
                    }
                    else
                    {
                        tkal += 25;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+tkal);
                        System.out.println("*******************************************************");
                        break;
                    }
                case 7:
                    if (tkal+25>120)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        System.out.println("*******************************************************");
                        break;
                    }
                    else
                    {
                        tkal += 25;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+tkal);
                        System.out.println("*******************************************************");
                        break;
                    }
                case 8:
                    System.out.println("bu seçimden istediğiniz kadar seçebilirsiniz");
                    System.out.println("*******************************************************");
                    break;




            }

            if (tkal==120)
            {
        break;
            }











        }



    }

    public void ogle()
    {
        //180
        int tkal1 =0;
        while(true)
        {
            System.out.println("Toplamda 180 kaloriyi aşmayacak şekilde terciklerinizi yazınız:");
            System.out.println("1-) 1 Kepçe Çorba (60 kal)");
            System.out.println("2-) 1 dilim tam buğday ekmeği(20 kal)");
            System.out.println("3-) 2 köfte kadar et veya tavuk(100 kal)");
            System.out.println("5-) Yarım su bardağı çökelek-lor(100 kal)");
            System.out.println("6-) 2 dilim beyaz peynir(100 kal)");
            System.out.println("7-) salata (yağsız,havuç,mısır,patates yok)");



            System.out.println("Eklemek istediğiniz seçimi  giriniz: ");
            Scanner input =new Scanner(System.in);
            int a;
            a= input.nextInt();

            switch (a)
            {
                case 1:
                    if (tkal1 +60>180)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;

                    }
                    else
                    {
                        tkal1 += 60;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal1);
                        break;
                    }
                case 2:
                    if (tkal1 +20>180)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;
                    }
                    else
                    {
                        tkal1 += 20;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal1);
                        break;
                    }
                case 3:
                    if (tkal1 +100>180)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;
                    }
                    else
                    {
                        tkal1 += 100;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal1);
                        break;
                    }
                case 4:
                    if (tkal1 +100>180)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;
                    }
                    else
                    {
                        tkal1 += 100;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal1);
                        break;
                    }
                case 5:
                    if (tkal1 +100>180)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;
                    }
                    else
                    {
                        tkal1 += 100;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal1);
                        break;
                    }
                case 6:
                    if (tkal1 +100>180)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;
                    }
                    else
                    {
                        tkal1 += 100;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal1);
                        break;
                    }
                case 7:
                    System.out.println("bu seçimden istediğiniz kadar seçebilirsiniz");
                    break;







            }

            if (tkal1 ==180)
            {
        break;
            }











        }



    }


    public void aksam()
    {
        //180
        int tkal2 =0;
        while(true)
        {
            System.out.println("Toplamda 100 kaloriyi aşmayacak şekilde terciklerinizi yazınız:");
            System.out.println("1-) 3 Kaşık yoğurt (15 kal)");
            System.out.println("2-) 1 dilim tam buğday ekmeği(20 kal)");
            System.out.println("3-) 1 köfte kadar et veya 1 dilim beyaz peynir(50 kal)");
            System.out.println("4-) 1 kepçe çorba veya 4 yk kurubaklagil yemeği(30 kal)");
            System.out.println("5-) 4 yk sebze yemeği veya 1tk zeytinyağı");




            System.out.println("Eklemek istediğiniz seçimi  giriniz: ");
            Scanner input =new Scanner(System.in);
            int a;
            a= input.nextInt();

            switch (a)
            {
                case 1:
                    if (tkal2 +15>100)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;

                    }
                    else
                    {
                        tkal2 += 15;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal2);
                        break;
                    }
                case 2:
                    if (tkal2 +20>100)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;
                    }
                    else
                    {
                        tkal2 += 20;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal2);
                        break;
                    }
                case 3:
                    if (tkal2 +50>100)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;
                    }
                    else
                    {
                        tkal2 += 50;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal2);
                        break;
                    }
                case 4:
                    if (tkal2 +30>100)
                    {
                        System.out.println("Toplam kalori 120'yi aşamaz ekleme işlemi başarısız");
                        break;
                    }
                    else
                    {
                        tkal2 += 30;
                        System.out.println("Ekleme işlemi başarılı toplam kaloriniz:  "+ tkal2);
                        break;
                    }
                case 5:
                    System.out.println("bu seçimden istediğiniz kadar seçebilirsiniz");
                    break;










            }

            if (tkal2 ==100)
            {
        break;
            }











        }



    }




}








