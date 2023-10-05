package org.walid.hash_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[]solution=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
                continue;
            }
            solution[0]=map.get(target-nums[i]);
            solution[1]=i;
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
