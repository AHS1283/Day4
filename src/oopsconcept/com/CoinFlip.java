package oopsconcept.com;
import java.util.Scanner;
public class CoinFlip {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the number of times to flip the coin: ");
            int numFlips = scanner.nextInt();

            if (numFlips <= 0) {
                System.out.println("Please enter a positive integer for the number of flips.");
                return;
            }

            int headsCount = 0;
            int tailsCount = 0;


            for (int i = 0; i < numFlips; i++) {
                if (Math.random() < 0.5) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
            }


            double percentageHeads = (headsCount * 100.0) / numFlips;
            double percentageTails = (tailsCount * 100.0) / numFlips;


            System.out.println("Number of flips: " + numFlips);
            System.out.println("Percentage of Heads: " + percentageHeads + "%");
            System.out.println("Percentage of Tails: " + percentageTails + "%");


            scanner.close();
        }
    }


