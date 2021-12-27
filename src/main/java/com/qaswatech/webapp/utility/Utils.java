/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.webapp.utility;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Vipul Jambhulkar
 */
public class Utils {

    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    
    public String generateEmployeeID(int length)
    {
        return generateRandomString(length);
    }
    
    private String generateRandomString(int length)
    {
        
        StringBuilder returnValue = new StringBuilder(length);
        for(int i = 0; i < length; i++)
        {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
            
        }
        return new String(returnValue);
        
    }
    
    public static <T> T requireNotNull(T obj,String message)
    {
        if(obj.equals(null) || obj.equals("null") || obj.equals("") || obj.equals(" "))
        {
            throw new RuntimeException(message);
        }
        return obj;
    }
    
    public static boolean empty(String s)
    {
        if(s == null || s.trim().equals("null") || s.trim().equals("") || s.trim().equals(" "))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
