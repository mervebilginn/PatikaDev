import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String adSoyad, sifre, secim;       
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Kullanıcı adınızı giriniz: ");
        adSoyad = scan.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre = scan.nextLine();
        
        if(adSoyad.equals("MerveBilgin") && sifre.equals("98765mb")){
            System.out.println("Sisteme başarılı bir şekilde giriş yapıldı..");
        }
        else{
            System.out.println("Hatalı giriş yaptınız...");
            
            System.out.print("Şifrenizi sıfırlamak ister misiniz?: ");
            secim = scan.nextLine();
            
            if(secim.equals("Evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                sifre = scan.nextLine();
                
                if (sifre.equals("98765mb")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                    sifre = scan.nextLine();        
                    System.out.println("Yeni şifreniz başarılı bir şekilde oluşturulmuştur..");
                }
                else {
                    System.out.println("Yeni şifreniz başarılı bir şekilde oluşturulmuştur..");
                }
            }
            else {
                System.out.print("Programdan çıkılıyor...");      
            }
        }
    }
}