 package java_metotlar;
import java.util.Scanner;
public class recursive_ileAsalSayi {

    static int Asal (int num,int a){
        if(num>2)
        return 0;
        if(a==1)
        return 1;
        else{
            if(num%a==0)
            return 0;
            else
            return Asal(num, a-1);
        }
    }

    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        
        System.out.print("asal olup olmadığını öğrenmek istediğiniz sayıyı giriniz: ");
        int num=girdi.nextInt();
        int status=Asal(num, num/2);
        if (status==0)
        System.out.println(num + " asal değildir ");
        else
        System.out.println("asal sayıdır");
    }


    
}