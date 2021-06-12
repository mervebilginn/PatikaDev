import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int km, yas, tip;
        double kmFiyat = 0.1, biletFiyat;
        
        System.out.print("Mesafe (km): ");
        km = scan.nextInt();
        System.out.print("Yaş: ");
        yas = scan.nextInt();
        System.out.print("Yolculuk tipi: (1=>Tek Yön, 2=>Gidiş Dönüş): ");
        tip = scan.nextInt();
        
        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            biletFiyat = kmFiyat * km;
            if ((tip==1) && yas < 12){
                biletFiyat = biletFiyat*0.5;
            }
            else if ((tip==2) && yas < 12){
                biletFiyat = biletFiyat*0.5;
                biletFiyat = 2*(biletFiyat*0.8);
            }
            else if ((tip==1) && (yas>12 && yas <= 24)){
                biletFiyat = biletFiyat*0.9;
            }
            else if ((tip==2) && (yas>12 && yas <= 24)){
                biletFiyat = biletFiyat*0.9;
                biletFiyat = 2*(biletFiyat*0.8);
            }
            else if(tip==1 && yas>65){
                biletFiyat = biletFiyat*0.7;
            }
            else if (tip==2 && yas>65){
                biletFiyat = biletFiyat*0.7;
                biletFiyat = 2*(biletFiyat*0.8);
            }
            System.out.println("Toplam Tutar = " + biletFiyat);

        } else{
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}