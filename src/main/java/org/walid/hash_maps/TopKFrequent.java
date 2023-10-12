package org.walid.hash_maps;

import java.util.*;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        k = Math.min(k, entryList.size());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        int k = 2;
        int[] topK = topKFrequent(nums, k);
        System.out.println(Arrays.toString(topK));
    }
}
