import java.util.Scanner;
public class HesapMakinesi {
    static int mod (int a ,int b) {

        System.out.println("Sayıların Çarpımının Modu : " + ((a % 10) * (b % 10)) % 10 + "\n") ;

        return 1;
    }
    static int alan (int a, int b){

        System.out.println("Dikdörtgenin Alanı: "+ a*b );
        System.out.println("Dikdörtgenin Çevresi: "+ (2*(a+b)) + "\n " );


     return 1;
    }

    public static void main(String[] args) {
        int select;
        Scanner input = new Scanner(System.in);
        String menu = "1- Mod Alma\n"
                + "2- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış" ;

        System.out.print("ilk Sayıyı Giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinici Sayıyı Giriniz: ");
        int b = input.nextInt();

        while (true){
            System.out.println("----------------------------------");
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz: ");
            select = input.nextInt();
            System.out.println(" ");

            if (select == 0){
                break;
            }
            switch (select){

                case 1:
                    mod(a,b);
            break;
                case 2:
                    alan(a,b);
            break;

            }

        }
        System.out.println("Güle Güle!!");

    }
}
