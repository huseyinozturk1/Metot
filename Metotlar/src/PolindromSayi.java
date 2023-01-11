import java.util.Scanner;
public class PolindromSayi {
    static int isPolidnrom (int number){
    int temp = number,reverseNumber =0,lastNumber;
    while (temp != 0) {
        lastNumber = temp%10;

        reverseNumber = (reverseNumber * 10) + lastNumber;

        temp /=10;
    }
        if (reverseNumber==number){
            System.out.print( number + " Sayısı bir Polindromdur. ");

        }else {
            System.out.print(number+ " Sayısı bir polindrom değildir.");
        }
    return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = input.nextInt();
        isPolidnrom(n);

    }
}
