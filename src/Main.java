import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input= new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        n= input.nextInt();

        for (int i = 1; i<=n; i*=4){
            System.out.println("4'in Kuvvetleri = " + i);
        }
        for(int i = 1; i <=n; i*=5){
            System.out.println("5'in Kuvvetleri = " + i);
        }

    }
}