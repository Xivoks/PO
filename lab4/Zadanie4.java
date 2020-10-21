package com.company;
import java.math.BigInteger;

public class Zadanie4 {
    public static BigInteger duzaliczba(int n){

        BigInteger sum=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger end=b;
        BigInteger c=new BigInteger("0");
        for (int i = 0; i <Math.pow(n,2)-1; i++)
        {
            c=b;
//            System.out.println(c);
            b=b.add(b);
//            System.out.println(b);
            sum=sum.add(b);
//            System.out.println(sum);

        }
        sum=sum.add(end);
        return sum;
    }
}
