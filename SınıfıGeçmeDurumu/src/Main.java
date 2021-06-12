/*
Java koşullu ifadeler ile kullanıcının not durumuna göre 
sınıfı geçme durumunu hesaplayan program yapımı.
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int mat, fizik, turkce = 0, kimya, muzik;
        int toplam=0, dersler=0;
        float ort;
        
        System.out.print("Matematik notununuz: ");
        mat = scan.nextInt();
        toplam += (mat>100 || mat < 0) ? 0 : mat;
        dersler+= (mat>100 || mat < 0) ? 0 : 1;

        System.out.print("Fizik notununuz: ");
        fizik = scan.nextInt();
        toplam += (fizik>100 || fizik < 0) ? 0 : fizik;
        dersler += (fizik>100 || fizik < 0) ? 0 : 1;
        
        System.out.print("Türkçe notununuz: ");
        turkce = scan.nextInt();
        toplam += (turkce>100 || turkce < 0) ? 0 : turkce;
        dersler += (turkce>100 || turkce < 0)? 0 : 1;
        
        System.out.print("Kimya notununuz: ");
        kimya = scan.nextInt();
        toplam += (kimya>100 || kimya < 0) ? 0 : kimya;
        dersler += (kimya>100 || kimya < 0)? 0 : 1;
        
        System.out.print("Müzik notununuz: ");
        muzik = scan.nextInt();
        toplam += (muzik>100 || muzik < 0) ? 0 : muzik;
        dersler += (muzik>100 || muzik < 0) ? 0 : 1;
        
        ort = toplam/dersler;
        
        if(ort > 55){
            System.out.println("Tebrikler, sınıfı geçtiniizzz!...");
        }
        else {
            System.out.println("Sınıfta kaldınız...");
        }
        System.out.println("Not ortalamanız: " + ort);
    }
}