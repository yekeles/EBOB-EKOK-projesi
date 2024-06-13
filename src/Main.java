import java.util.Scanner;
public class Main {
    //EBOB ve EKOK DEĞERİNİ ÖĞRENMEK İSTEDİĞİNİZ SAYILARI YAZIN.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("************************");

        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int EBOB = 1, EKOK ;
        int i = 1, k = 1;

        System.out.println("************************");

        if (n2 > n1) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    EBOB = i;
                }
                i++;
            }
            System.out.println("SAYILARIN EBOB DEĞERİ : " + EBOB);
        } else {
            while (k <= n2) {
                if (n1 % k == 0 && n2 % k == 0) {
                    EBOB = k;
                }
                k++;
            }
            System.out.println("SAYILARIN EBOB DEĞERİ : " + EBOB);
        }
        EKOK = (n1 * n2) / EBOB;
        System.out.println("SAYILARIN EKOK DEĞERİ : " + EKOK);
    }
}