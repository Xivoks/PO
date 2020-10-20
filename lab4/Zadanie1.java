package com.company;
import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;
import java.lang.*;
public class Zadanie1 {
    public static int countChar(String str, char c){
        int count = 0;
        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }
        return count;
    }
//    public static boolean countSubStr(String str, String subStr) {
//        boolean check = str.contains(subStr); // true
//        return check;
//    }
    public static int countSubStr(String str, String subStr){
        int stringlen=str.length();
        int subStrlen=subStr.length();
        if(str.isEmpty()||subStr.isEmpty()||subStrlen>stringlen){
            return 0;
        }
        int index=0;
        int count=0;
        String temp;
        while(count-index>=subStrlen){
            temp=str.substring(index,index+(subStrlen));
            if(temp.equals(subStr)) count++;
            index++;
        }
        return count;
    }
    public static String middle(String str) {

        int count = str.length();
        float count1 = str.length();
        if (count % 2 == 0) {
            int kappa = count / 2;
            char value = str.charAt(kappa);
            char value1 = str.charAt(kappa + 1);
            String result = String.valueOf(value) + String.valueOf(value1);
            System.out.println(result);
        } else {
            float kappa = (float) Math.ceil(count1 / 2);
            int intRate = (int) kappa;
            char value = str.charAt(intRate);
            String result = String.valueOf(value);
            System.out.println(result);
        }
        return "0";
    }
    public static int[] where(String str, String subStr){
        int[] temp= new int[Zadanie1.countSubStr(str,subStr)];
        if(temp.length>0){
            String kappa= str;
            temp[0]=kappa.indexOf(subStr);
            for(int i=1;i<temp.length;i++){
                kappa=str.substring(temp[i-1]+1);
                temp[i]=kappa.indexOf(subStr)+temp[i-1]+1;
            }
        }
        return temp;
    }
    public static String change(String str) {
        String modstr="";
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                modstr=modstr+String.valueOf(Character.toLowerCase(ch));
            }
            else
            {
                modstr=modstr+String.valueOf(Character.toUpperCase(ch));
            }
        }
        return modstr;
    }
    public static String nice(String str){
        StringBuffer dec= new StringBuffer();
        int inkr=1;
        for(int i=(str.length()-1);i>=0;i--){
            dec.append(str.charAt(i));
            if(inkr%3==0 && i!=0) {
                dec.append("'");
            }
            inkr++;
        }
        String temp= dec.toString();
        dec=new StringBuffer();
        for(int i=temp.length()-1;i>=0;i--){
            dec.append(temp.charAt(i));
        }
        return dec.toString();
    }
    public static String nice1(String str,char x, int n){
        StringBuffer dec= new StringBuffer();
        int inkr=1;
        for(int i=(str.length()-1);i>=0;i--){
            dec.append(str.charAt(i));
            if(inkr%n==0 && i!=0) {
                dec.append(x);
            }
            inkr++;
        }
        String temp= dec.toString();
        dec=new StringBuffer();
        for(int i=temp.length()-1;i>=0;i--){
            dec.append(temp.charAt(i));
        }
        return dec.toString();
    }

}

