package com.learn.java.lambdas;

import java.util.Comparator;

/**
 * packageName : com.learn.java.lambdas
 * fileName : ComparatorLambdaExample
 * author : psjw
 * date : 2022-07-20
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-20        psjw         최초 생성
 */
public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * prior java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 0 -> o1==02
                // 1 -> o1>o2
                // -1 -> o1<02
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of the comparator is : " + comparator.compare(3, 2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> { return a.compareTo(b);};
        Comparator<Integer> comparatorLambda1 = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda is : "+comparatorLambda.compare(3,2));
        System.out.println("Result of the comparator using Lambda is : "+comparatorLambda1.compare(3,2));

        Comparator<Integer> comparatorLambda2 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda is : "+comparatorLambda2.compare(3,2));
    }
}
