/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. 
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" 
değerini hesaplayıp ekrana yazdırın.
VKI=Kilo (kg) / Boy(m) * Boy(m)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double kilo, boy, VKI;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();
        
        VKI = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + VKI);

    }
}