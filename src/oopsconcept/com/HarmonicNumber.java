package oopsconcept.com;
import java.util.Scanner;
public class HarmonicNumber {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the Harmonic Value N (N != 0): ");
            int N = scanner.nextInt();


            if (N == 0) {
                System.out.println("N should not be zero.");
            } else {

                double harmonicValue = calculateHarmonicValue(N);

                System.out.println("The Nth Harmonic Value: " + harmonicValue);
            }


            scanner.close();
        }


        public static double calculateHarmonicValue(int N) {
            double harmonicValue = 0.0;

            for (int i = 1; i <= N; i++) {
                harmonicValue += 1.0 / i;
            }

            return harmonicValue;
        }
    }


