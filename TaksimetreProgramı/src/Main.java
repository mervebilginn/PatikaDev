import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        double tutar, total, kilomt;
	Scanner scan = new Scanner(System.in);

	System.out.print("Mesafe(km): ");
	kilomt = scan.nextDouble();
	tutar = 10+(kilomt*2.20);

	total = (tutar <20) ? 20 : tutar;
	System.out.println("Toplam tutar" + total);
    }
}