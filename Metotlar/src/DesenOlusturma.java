import java.util.Scanner;

public class DesenOlusturma {
    static int sayi(int a, int b) {

        if (a > 0) {
            System.out.print(a + " ");
            a -= 5;
            return sayi(a,b);
        }
        return sayi1(a, b);

    }
    static int sayi1(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            a += 5;
            return sayi1(a, b);
        }

        return b;
    }
    public static void main(String[] args) {
        int b,a;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        b = input.nextInt();
        a = b ;
        sayi(a,b);
    }
}
