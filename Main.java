//Jose Giovanni Tapia Lopez
//07/17/2025
//Recursion and Junit Test assignment


public class Main{

    //First Junit test
    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10; //check if he last digit is divisable by 10 
        int nextDigit = (n / 10) % 10; //divides by 10 to get the next digit if it's divisible by 10
        if (lastDigit == 8) {
            if (nextDigit == 8) {
                return 2 + count8(n / 10); //if the next digit is also 8, we count it as 2
            } else {
                return 1 + count8(n / 10); //if the next digit is not 8, we count it as 1
            }
        } else {
            return count8(n / 10); //if the last digit is not 8, we just continue with the next digit
        }
    }
    //Second Junit test
    public static int countHi(String str) {
        if (str.length() < 2) { //if the string is less than 2 characters, we can't find "hi"
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2)); //if the characters are 'h', 'i' count as hi
        } else {
            return countHi(str.substring(1)); //if the characters are not 'h', 'i' continue next character

        }
    }
    //Third Junit test
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0; //if the string is less than 2 characters, we can't find "hi"
        }
        if (str.substring(0, 2).equals("hi")) { 
            return 1 + countHi2(str.substring(2)); //if the characters are 'h', 'i' count as hi
        } else if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            // Skip the 'x' and 'hi'
            return countHi2(str.substring(3)); //skip if the value is 'xhi'
        } else {
            return countHi2(str.substring(1)); //if the characters are not 'h', 'i' continue next character
        }
    }
    //Fourth Junit test
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) { //if the string is shorter than the substring, we can't find it
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub); //`if the substring matches, count it and continue with the rest of the string
        } else {
            return strCount(str.substring(1), sub); //if the substring does not match, continue with the next character
        }
    }
    //Fifth Junit test
    public static String stringClean(String str) {
        if (str.length() <= 1) { //if the string is 1 character or less, return it as is
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) { //if the first character is the same as the second, skip the first character
            return stringClean(str.substring(1)); 
        } else {
            return str.charAt(0) + stringClean(str.substring(1)); //if the first char is different from the second, keep e.g (Kep = Keep)
        }
    }
}

