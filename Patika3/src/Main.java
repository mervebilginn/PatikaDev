/*Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin 
alanını hesaplayan programı yazınız.*/  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
	Scanner scan = new Scanner(System.in);
        int a, b, c, cevre;
        double u, alan;
                
	System.out.print("1. kenar uzunluğunu giriniz: ");
	a = scan.nextInt();
	System.out.print("2. kenarı uzunluğunu giriniz: ");
	b = scan.nextInt();
	System.out.print("3. kenarı uzunluğunu giriniz: ");
	c = scan.nextInt();
                
	cevre = a+b+c;
	u = cevre/2;
	alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
	System.out.println("Alan: " + alan);
    }
}