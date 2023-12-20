package oopsconcept.com;

public class Powerof2 {

        public static void main(String[] args) {

            int N = 5;


            if (N < 0 || N >= 31) {
                System.out.println("N should be in the range 0 <= N < 31.");
                return;
            }

            System.out.println("Powers of 2 table for N = " + N);
            int result = 1;

            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + result);
                result *= 2;
            }
        }
    }


