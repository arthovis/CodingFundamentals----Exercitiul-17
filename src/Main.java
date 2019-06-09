import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int numberToguess = new Random().nextInt(1000);
        int count=0;

        do {
            System.out.println("Introduceti un numar intre 1 si 1000:");
            guess=scanner.nextInt();
            count++;
             if (guess<numberToguess){
                System.out.println("Numarul este prea mic! Mai incearca!");
            } else if (guess>numberToguess){
                System.out.println("Numarul este prea mare! Mai incearca");
            }

        }while (guess!=numberToguess);


        System.out.println("Ai ghicit! Numarul pe care trebuia sa il ghicesti este: "+numberToguess+". Ai ghicit din "+count+" incercari.");

    }
}
