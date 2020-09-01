package com.company;

import java.util.HashMap;

public class Main {
    static private boolean isPermu(String s1, String s2) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if (hmap.get(arr1[i]) == null) {
                hmap.put(arr1[i], 1);
            } else {
                hmap.put(arr1[i], hmap.get(arr1[i]) + 1);
            }
        }
        for (int j = 0; j < s2.length(); j++) {
            if (hmap.get(arr2[j]) == null) {
                hmap.put(arr2[j], -1);
            } else {
                hmap.put(arr2[j], hmap.get(arr2[j]) - 1);
            }
        }
        boolean ispermu = true;
        for (Integer v : hmap.values()) {
            if (v != 0) {
                ispermu = false;
            }
        }

        return ispermu;

    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPermu("apple", "pleap"));
        System.out.println(isPermu("Angela", "Bruce"));
    }
}
