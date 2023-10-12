/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ingale.r
 */
public class Validations {
    
    public static boolean isNumeric(String str) { 
        try {  
          Integer.parseInt(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    }
    
    public static boolean isDouble(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    }
    
    public static boolean isLong(String str) { 
        try {  
          Long.parseLong(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    }
    
    public static boolean isEmailValid(String email){
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
public static boolean isStringValid(String str) {
    // Check if the string is null or empty
    if (str == null || str.isEmpty()) {
        return false;
    }

    return true;
}


    public static boolean isPhoneNumberValid(String phoneNumber) {
        String regex = "^(\\d{10}|\\d{3}-\\d{3}-\\d{4}|\\(\\d{3}\\)\\s?\\d{3}-\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }


    
}
