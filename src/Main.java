import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,sonuc = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        a = scan.nextInt();

        while (a!=0){
            b = a % 10;
            sonuc += b;
            a = a /10;
        }

        System.out.println("Basamaklar Toplamı : " + sonuc);



    }
}