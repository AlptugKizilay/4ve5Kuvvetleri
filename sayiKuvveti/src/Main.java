import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        j= inp.nextInt();

        System.out.print("4'un kuvvetleri: ");
        for (i=1; i<=j; i*=4){
            System.out.print(i + " , " );
        }

        System.out.print("\n5'un kuvvetleri: ");
        for (i=1; i<=j; i*=5){
            System.out.print(i + " , " );
        }

    }
}