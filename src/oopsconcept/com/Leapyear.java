package oopsconcept.com;
import java.util.Scanner;
public class Leapyear {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a year (4 digits): ");
            int year = scanner.nextInt();


            if (year < 1000 || year > 9999) {
                System.out.println("Please enter a 4-digit year.");
            } else {

                if (isLeapYear(year)) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            }

            scanner.close();
        }


        public static boolean isLeapYear(int year) {

            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }


