import java.util.HashMap;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        HashMap<Integer,String> kart=new HashMap<Integer, String>();
        kart.put(4789,"Talya");
        kart.put(89565,"Selim");
        kart.put(8894,"Enes");
        kart.put(18227,"Talha");
        kart.put(56468,"Cabbar");

        int para_s=1000;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Isminizi giriniziz");
        String isim=scan2.nextLine();
        System.out.println("Sifrenizi giriniziz");
        int sifre=scan.nextInt();
        while(true)
        {
            if(kart.containsValue(isim)&& kart.containsKey(sifre))
            {
                System.out.println("1-)Para ekleme");
                System.out.println("2-)Para cekme");
                System.out.println("3-)Cıkma");
                System.out.println("4-)Bakiye kontrol");
                System.out.println("Hangi islemi yapmak istiyorsunuz");
                int islem=scan.nextInt();

                switch (islem) {
                    case 1: {
                        System.out.println("Ne kadar para ekleyeceksiniz");
                        int ekle=scan.nextInt();
                        para_s=para_s+ekle;
                        break;
                    }
                    case 2:{
                        System.out.println("Ne kadar para cekeceksiniz");
                        int cikar=scan.nextInt();
                        para_s=para_s - cikar;
                        break;
                    }
                    case 3:{
                        break;
                    }
                    case 4:{
                        System.out.println(para_s);
                        break;
                    }
                    default:{
                        System.out.println("Yanlis secim");
                        break;
                    }
                }
                if(islem==3)
                {
                    break;
                }
            }

        }

    }

}