package com.company;

import java.math.BigInteger;
import java.security.MessageDigest;

public class JavaSHA256 {
    public static String GenerateHash(String input) {
        MessageDigest objSHA = MessageDigest.getInstance("SHA-256");
        byte[] bytSHA = objSHA.digest(input.getBytes());
        BigInteger intNumber = new BigInteger(1, bytSHA);
        String strHashCode = intNumber.toString(16);

        // pad with 0 if the hexa digits are less then 64.
        while (strHashCode.length() < 64) {
            strHashCode = "0" + strHashCode;
        }
        return strHashCode;
    }
}