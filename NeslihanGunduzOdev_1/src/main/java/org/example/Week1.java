package org.example;
import java.util.Scanner;
import java.util.Random;
public class Week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        int userNum = 0;
        int counter = 0;
        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz!");

        while(randomNum != userNum){
            System.out.print("Lütfen 1 ve 100 arasında bir sayı seçiniz: ");
            userNum = scanner.nextInt();
            counter++;
            if (randomNum == userNum){
                System.out.println("Tebrikler! Doğru tahmin.");
            }else if (randomNum > userNum){
                System.out.println("Daha büyük bir sayı girin.");
            }else{
                System.out.println("Daha küçük bir sayı girin.");
            }
        }
        System.out.println("Deneme sayısı:"+ " " + counter);
        System.out.println("Oyun Bitti!" );
        scanner.close();

    }
}
