import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yıl = scan.nextInt();
        
        boolean artikYıl = false;
        if(yıl % 100 == 0){
            if(yıl % 400 == 0){
                artikYıl = true;
            }
        }
        else if(yıl % 4 == 0){
            artikYıl = true;
        }

        if(artikYıl){
            System.out.println(yıl+" artık bir yıldır!");
        }
        else{
            System.out.println(yıl+" artık bir yıl değildir!");
        }
    }
}