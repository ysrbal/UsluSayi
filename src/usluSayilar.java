import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i, k, total = 1;

        System.out.print("Ussu Alinacak Sayi : ");
        i = inp.nextInt();
        System.out.print("Us Sayisi : ");
        k = inp.nextInt();

        for (int n1 = 1; n1 <= k; n1++) {
            total *= i;
        }

        System.out.println("Sonuc : "+ total);
    }
}
