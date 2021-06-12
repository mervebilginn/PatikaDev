
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int n1, n2, select;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("İlk sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scan.nextInt();
        
        System.out.println("Toplama için 1'i\nÇıkartma için 2'yi\nÇarpma için 3'ü\nBölme için 4'ü\nseçiniz");
        System.out.print("Seçiminiz: ");
        select = scan.nextInt();
        switch (select) {
            case 1: 
                System.out.println("Toplam = " + (n1+n2)); 
                break;
            case 2: 
                System.out.println("Fark = " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım = " + (n1*n2));
                break;
            case 4: 
                if(n2 != 0){
                    System.out.println("Bölüm = " + ((float)n1/n2));
                }
                else {
                    System.out.println("Herhangi bir sayı 0 a bölünemez");
                }
                break;
        default:
            System.out.println("Yanlış seçim yaptınız, tekrar deneyiniz..");
        }
    }
    
}
