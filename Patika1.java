
import java.util.Scanner;

public class Patika1 {
    public static void main(String[] args) {
        
        int mat, fizik, kimya, türkçe, tarih, müzik;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Mat notu: ");
        mat=scan.nextInt();
        
        System.out.print("Fizik notu: ");
        fizik=scan.nextInt();
        
        System.out.print("Kimya notu: ");
        kimya=scan.nextInt();
        
        System.out.print("Türkçe notu: ");
        türkçe=scan.nextInt();
        
        System.out.print("Tarih notu: ");
        tarih=scan.nextInt();
        
        System.out.print("Müzik notu: ");
        müzik=scan.nextInt();
        
        double ort=(fizik+mat+kimya+türkçe+tarih+müzik)/6;
        System.out.println("Ortalama: "+ort);
        
        String geçtiMi=(ort>60)? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(geçtiMi);
        
    }
}
