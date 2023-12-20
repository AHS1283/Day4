package oopsconcept.com;

public class FibonacciSeries {

        public static void main(String[] args) {

            int n = 10;


            System.out.println("Fibonacci Series with " + n + " terms:");
            printFibonacciSeries(n);
        }

        public static void printFibonacciSeries(int n) {
            int firstTerm = 0, secondTerm = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(firstTerm + " ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }


