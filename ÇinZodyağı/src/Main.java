import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Doğum Yılınızı giriniz : ");
        year = scan.nextInt();
        
        if((year % 12)==0){
            System.out.print("Maymun");
        }
        else if((year % 12)==1){
            System.out.print("Horoz");
        }
        else if((year % 12)==2){
            System.out.print("Köpek");
        }
        else if((year % 12)==3){
            System.out.print("Domuz");
        }
        else if((year % 12)==4){
            System.out.print("Fare");
        }
        else if((year % 12)==5){
            System.out.print("Öküz");
        }
        else if((year % 12)==6){
            System.out.print("Kaplan");
        }
        else if((year % 12)==7){
            System.out.print("Tavşan");
        }
        else if((year % 12)==8){
            System.out.print("Ejderha");
        }
        else if((year % 12)==9){
            System.out.print("Yılan");
        }
        else if((year % 12)==10){
            System.out.println("At");
        }
        else if((year % 12)==8){
            System.out.print("Koyun");
        }
        else{
            System.out.print("Yanlış değer girdiniz..");
        }
    }
}