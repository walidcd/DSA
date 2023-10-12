package org.walid.cses;
import java.math.BigInteger;
import java.util.Scanner;

public class BitStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        final double MOD=Math.pow(10,9)+7;
        double product =1;
        for (int i = 0; i < n; i++) {
            product*=2%MOD;
        }
        product%=MOD;
        long answer= (long) Math.pow(2,n);
        System.out.println(answer);
    }
}
