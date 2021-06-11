
import java.util.Scanner;

public class Patika2 {

    public static void main(String[] args) {
        
        double tutar, kdv, kdvTutari, kdvliTutar;
        
	Scanner scan = new Scanner(System.in);
        
        System.out.print("Ücret tutarını giriniz: ");
	tutar = scan.nextDouble();
	  
	if(tutar>0) {
            kdv = (tutar > 0 && tutar < 1000) ? 0.18 : 0.8;
            kdvTutari = tutar*kdv;
            kdvliTutar = tutar + kdvTutari;
            System.out.println("KDV Oranı: " + kdv);
            System.out.println("KDV Tutarı: " + kdvTutari);
            System.out.println("KDV'li Tutar: " + kdvliTutar); 
        }
        else {
           System.out.println("Geçersiz işlem, programdan çıkılıyor... ");  
        } 
    }
}
    

