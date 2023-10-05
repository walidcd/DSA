package org.walid.hash_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() !=t.length()){
            return false;
        }
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String sSorted=new String(sArr);
        String tSorted=new String(tArr);
        return sSorted.equals(tSorted);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("",""));
    }
}
