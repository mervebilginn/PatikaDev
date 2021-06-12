/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin 
kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       
       Scanner scan = new Scanner(System.in);
       double armut, elma, domates, muz, patlican, toplam = 0;
        
       System.out.print("Armut kaç kilo?: ");
       armut = scan.nextDouble();
       System.out.print("Elma kaç kilo?: ");
       elma = scan.nextDouble();
       System.out.print("Domates kaç kilo?: ");
       domates = scan.nextDouble();
       System.out.print("Muz kaç kilo?: ");
       muz = scan.nextDouble();
       System.out.print("Patlıcan kaç kilo?: ");
       patlican = scan.nextDouble();
        
       toplam = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
        
       System.out.print("Toplam tutar :" + toplam);
   } 
}
