import java.util.Scanner;

public class palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, last;
        while (temp != 0) {
            last = temp % 10;
            reverseNumber = (reverseNumber * 10) + last;
            temp /= 10;
        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        if (isPalindrom(sayi) == true) {
            System.out.println(sayi + " Sayısı palindrom sayıdır.");
        } else {
            System.out.println(sayi + " Sayısı palindrom sayı değildir.");
        }
    }
}

