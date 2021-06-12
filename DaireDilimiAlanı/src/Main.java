/*
Yarıçapı r, merkez açısısının a ölçüsü  olan daire 
diliminin alanı bulan programı yazınız.
a sayısını = 3.14 alınız.
Formül : (pi * (r*r) * a) / 360
*/
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        int r, a;
        double pi=3.14, alan;
        Scanner scan= new Scanner(System.in);
    
        System.out.print("Dairenin yarıçapını giriniz: "); 
        r = scan.nextInt();
        
        System.out.print("Merkez açısının ölçüsünü giriniz: "); 
        a = scan.nextInt();
        
        alan = (pi*(r*r)*a)/360;
        
        System.out.print("Alan: " + alan);
    } 
    
}
