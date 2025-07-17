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
}

