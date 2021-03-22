package com.login;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {

    public static byte[] getSHA(String password) throws  NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(password.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash){
//        BigInteger number = new BigInteger(1,hash);
//
//        StringBuilder hexString = new StringBuilder(number.toString(16));
//
//        while(hexString.length() < 32){
//            hexString.insert(0,"0");
//        }
//
//        return hexString.toString();

        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
