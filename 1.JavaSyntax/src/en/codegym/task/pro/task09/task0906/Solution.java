package en.codegym.task.pro.task09.task0906;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        int decimalNumber = Integer.parseInt(binaryNumber,2);
        String hexStr = "";
        while(decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            switch(remainder) {
                case 15: hexStr = "f" + hexStr; break;
                case 14: hexStr = "e" + hexStr; break;
                case 13: hexStr = "d" + hexStr; break;
                case 12: hexStr = "c" + hexStr; break;
                case 11: hexStr = "b" + hexStr; break;
                case 10: hexStr = "a" + hexStr; break;
                default: hexStr = remainder + hexStr;
            }
            decimalNumber /= 16;
        }
        return hexStr;
    }

    public static String toBinary(String hexNumber) {
        // https://stackoverflow.com/a/9246349
        return new BigInteger(hexNumber, 16).toString(2);
    }

    public static String toBinary(int decimalNumber) {
        // https://stackoverflow.com/a/17284958
//        return Integer.toBinaryString(decimalNumber);
        String binaryStr = "";
        while(decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryStr = remainder + binaryStr;
            decimalNumber /= 2;
        }
        return binaryStr;
    }

    public static int toDecimal(String binaryNumber) {
        // https://stackoverflow.com/a/21797463
//        return Integer.parseInt(binaryNumber, 2);
        int decimalVal = 0;
        int place = 1;
        for(int i = binaryNumber.length() - 1; i >= 0; i--) {
            char c = binaryNumber.charAt(i);
            int val = Character.getNumericValue(c);
            decimalVal += val * place;
            place *= 2;
        }
        return decimalVal;
    }
}
