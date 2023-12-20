package oopsconcept.com;

public class LargestAmongThree {

        public static void main(String[] args) {

            int num1 = 25;
            int num2 = 12;
            int num3 = 36;


            int largest = findLargest(num1, num2, num3);


            System.out.println("The largest among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
        }

        public static int findLargest(int a, int b, int c) {
            int max = a;

            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }

            return max;
        }
    }


