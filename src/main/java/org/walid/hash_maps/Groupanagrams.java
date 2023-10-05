package org.walid.hash_maps;

import java.util.*;

public class Groupanagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] wordsSorted=new String[strs.length];
        for (int i = 0; i < strs.length ; i++) {
            char[] wordAsArr=strs[i].toCharArray();
            Arrays.sort(wordAsArr);
            String sorted=new String(wordAsArr);
            wordsSorted[i]=sorted;
        }
        List<List<String>> sorted=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for (int i = 0; i < wordsSorted.length ; i++) {
            if(map.containsKey(wordsSorted[i])){
                map.get(wordsSorted[i]).add(strs[i]);
            }else{
                List<String> anagramList = new ArrayList<>();
                anagramList.add(strs[i]);
                map.put(wordsSorted[i],anagramList);
            }
        }
        List<List<String>> result=new ArrayList<>(map.values());
        return result;
    }
    public static void main(String[] args) {
        String []l={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(l));;
    }
}
