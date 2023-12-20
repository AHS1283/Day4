package oopsconcept.com;

public class VowelConsonant {

        public static void main(String[] args) {

            char ch = 'a';


            if (isVowel(ch)) {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }


        public static boolean isVowel(char ch) {

            ch = Character.toLowerCase(ch);

            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }


