//Jose Giovanni Tapia Lopez
//07/17/2025
//Recursion and Junit Test assignment

//make sure it has java standards

public class Main{

    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10;
        int nextDigit = (n / 10) % 10;
        if (lastDigit == 8) {
            if (nextDigit == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }
    //for the second Junit test
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }
    //for the third Junit test
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        } else if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            // Skip the 'x' and 'hi'
            return countHi2(str.substring(3));
        } else {
            return countHi2(str.substring(1));
        }
    }
    //for the fourth Junit test
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }
    //for the fifth Junit test
    public static String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }
}

