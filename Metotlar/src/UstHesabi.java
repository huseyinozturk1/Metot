import java.util.Scanner;

public class UstHesabi {
    static int hesap (int a, int b){
    int total=1;
        for (int i =1 ; i<=b; i++)
        total*=a;
        System.out.println(a+"^"+b+"= "+ total );

        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Üstü Alınacak Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("Üst Sayısını Giriniz: ");
        b = input.nextInt();

        hesap(a,b);
    }
}
