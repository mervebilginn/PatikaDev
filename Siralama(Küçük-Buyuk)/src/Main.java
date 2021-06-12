import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int s1, s2, s3;
        System.out.print("1.(s1) sayiyi giriniz: ");
        s1 = scan.nextInt();
        
        System.out.print("2.(s2) sayiyi giriniz: ");
        s2 = scan.nextInt();
        
        System.out.print("3.(s3) sayiyi giriniz: ");
        s3 = scan.nextInt();
        
        if(s1 < s2 && s1 < s3){
            if(s2 < s3) {
                System.out.println("s1 < s2 < s3 = " + s1 + " < " + s2 + " < " + s3);
            }
            else if(s3 < s2){
                System.out.println("s1 < s3 < s2 = " + s1 + " < " + s3 + " < " + s2);
            }
        }
        else if(s2 < s1 && s2 < s3){
            if(s1 < s3) {
                System.out.println("s2 < s1 < s3 = " + s2 + " < " + s1 + " < " + s3);
            }
            else if(s3 < s1){
                System.out.println("s2 < s3 < s1 = " + s2 + " < " + s3 + " < " + s1);
            }
        }else if(s3 < s1 && s3 < s2){
            if(s1 < s2){
                System.out.println("s3 < s1 < s2 = " + s3 + " < " + s1 + " < " + s2);
            }
            else if(s2 < s1) {
                System.out.println("s3 < s2 < s1 = " + s3 + " < " + s2 + " < " + s1);
            }
        }
    }
}