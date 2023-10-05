package org.walid.hash_maps;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[]nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int @NotNull [] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                return false;
            }
            else{
                map.put(num,num);
            }
        }
        return true;
    }
}