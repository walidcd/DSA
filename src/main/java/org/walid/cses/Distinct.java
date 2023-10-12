package org.walid.cses;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distinct {
    public static void main(String[] args) {
        System.out.println(unique());
    }

    public static int unique() {
        Set<Integer> unique = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            unique.add(t); // Using a HashSet to automatically ensure uniqueness
        }


        return unique.size();
    }
}
