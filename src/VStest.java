
import java.util.Scanner;

public class VStest {
//Hej fra konflikt
    public static void main(String[] args) {
        boolean X = true;
        while (X) {
            Scanner input = new Scanner(System.in);
            System.out.println("Vælg et menupunkt.");
            System.out.println("1. Læg to tal sammen.");
            System.out.println("2. Træk to tal fra hinanden");
            System.out.println("3. Beregn produktet af to tal.");
            System.out.println("4. Divider to tal.");
            System.out.println("5. Forlad programmet.");
            int menuPunkt = input.nextInt();


            switch (menuPunkt) {
                case 1:
                    System.out.println("Programmet vil beregne en sum, a+b. Indtast a.");
                    double a1 = input.nextDouble();

                    System.out.println("Indtast b.");
                    double b1 = input.nextDouble();

                    System.out.println("Svaret er: " + (a1 + b1));

                    break;
                case 2:
                    System.out.println("Programmet vil beregne en differens, a-b. Indtast a.");
                    double a2 = input.nextDouble();

                    System.out.println("Indtast b.");
                    double b2 = input.nextDouble();

                    System.out.println("Svaret er: " + (a2 - b2));
                    break;
                case 3:
                    System.out.println("Programmet vil beregne et produkt, ab. Indtast a.");
                    double a3 = input.nextDouble();

                    System.out.println("Indtast b.");
                    double b3 = input.nextDouble();
                    System.out.println("Svaret er: " + a3 * b3);
                    break;
                case 4:
                    System.out.println("Programmet vil beregne en kvotient, a/b. Indtast a.");
                    double a4 = input.nextDouble();

                    System.out.println("Indtast b.");
                    double b4 = input.nextDouble();
                    System.out.println("Svaret er: " + a4 / b4);

                    break;
                case 5:
                    System.out.println("Terminerer.");
                    X = false;
                    break;


            }


        }


    }
}
