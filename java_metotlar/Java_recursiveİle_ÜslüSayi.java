
package java_metotlar;
import java.util.*;
public class Java_recursiveİle_ÜslüSayi {

    static int UsAlma(int taban, int us){
        if(us==0)
            return 1;
            else 
            return taban * UsAlma(taban, (us-1));
        
    }
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.print("tabanı giriniz: ");
        int taban=girdi.nextInt();
        System.out.print("üs değerini giriniz: ");
        int us=girdi.nextInt();
        System.out.println(UsAlma(taban, us));
    }
}