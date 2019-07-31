/*
 * Recursive calculation of approximation to e using a formula proposed by the Ramanujan Machine
 * see https://arxiv.org/abs/1907.00205
 */

package com.djptek;

public class Main {

    static double e (int depth, int maxDepth) {
        if (depth++ == maxDepth) return 1;
        else return depth + 2 + (( 0 - depth ) / e(depth, maxDepth));
    }

    static double e(int maxDepth) {
        return e (0, maxDepth);
    }

    public static void main(String[] args) {
        System.out.printf("Math.E ");
        System.out.println(Math.E);
        for (int maxDepth = 1; maxDepth < 20; maxDepth++ ) {
            System.out.printf("e(%d)  ", maxDepth);
            System.out.println(e(maxDepth));
        }
    }
}
