package metotlar;

import java.util.Scanner;

public class Gelismis_Hesap_Makinesi {

    static int toplama(int a, int b){
        int result=a+b;
        System.out.println("toplam :"+result);
        return result;
    }
    static int çıkarma(int a, int b){
        int result=a-b;
        System.out.println("çıkartma :"+result);
        return result;
    }
    static int çarpma(int a, int b){
        int result=a*b;
        System.out.println("çarpma :"+result);
        return result;
    }
    static int bölme(int a, int b){
        if(b==0){
            System.out.println("İkinci sayı 0 dan farklı olmalı");
            return 0;
        }
        int result=a/b;
        System.out.println("bölme :"+result);
        return result;
    }
    static int üslü(int a, int b){
        int result=1;
       for (int i=1; i<=b ; i++){
        result *=a;
       }
        return result;
    }
    static int modAlma(int a, int b){
       return a%b;
    }
    static void dikdörtgen(int a, int b) {
        int çevre = (2 * a) + (2 * b);
        int alan = a * b;
        System.out.println("Çevresi: " + çevre);
        System.out.println("Alan: " + alan);
    }
    
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        int select;
        String menu = "1 - toplama işlemi\n"
        + "2 - çıkarma işlemi \n"
        + "3 - çarpma işleimi \n"
        + "4 - bölme işlemi \n"
        + "5 - üslü sayı hesaplama \n"
        + "6 - mod alma \n"
        + "7 - dikdörtgen alan ve çevre hesabı \n"
        + "0 - çıkış yap";
        System.out.println(menu);

        while(true) {
            System.out.print("Bir işlem seçiniz :");
            select=girdi.nextInt();
            if(select==0){
                break;
            }
            System.out.print("İlk sayıyı giriniz:");
            int a=girdi.nextInt();
            System.out.print("İkinci sayıyı giriniz:");
            int b=girdi.nextInt();

            switch (select){
                case 1:
                  toplama(a, b);
                  break;
                case 2:
                  çıkarma(a, b);
                  break;
                case 3:
                  çarpma(a, b);
                  break;
                case 4:
                  bölme(a, b);
                  break;
                case 5:
                  System.out.print("üs hesabı"+üslü(a, b));
                  break;
                case 6:
                   System.out.print("mod alma hesabı:"+modAlma(a, b));
                   break;
                case 7:
                   dikdörtgen(a, b);
                   break;
                   default:
                   System.out.println("geçersiz değer girdiniz ");



                 
            }      
        }
    }
}
