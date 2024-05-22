package com.company;

import java.util.HashSet;

public class j_98_hash_set {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(9,0.9f);
        hashSet.add(9);
        hashSet.add(87);
        hashSet.add(12);
        hashSet.add(8);
        hashSet.add(34);
        hashSet.add(22);
        hashSet.add(9); // Same value count only once
        System.out.print(hashSet + ",");
    }
}
