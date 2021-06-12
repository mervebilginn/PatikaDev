/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
YAni 12 ye bölünen sayılara dikkat edeceğiz..
*/
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int sayi;
        int sayac = 0, toplam = 0;
        double ortalama;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Girilen sayınız: ");
        sayi = scan.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 12 == 0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("0 dan " + sayi + " a kadar olan sayıların 3e ve 4 e bölünenlerin ortalaması : " + ortalama);
    }
}
