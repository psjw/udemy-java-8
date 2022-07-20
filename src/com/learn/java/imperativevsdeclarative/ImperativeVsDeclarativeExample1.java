package com.learn.java.imperativevsdeclarative;

import java.util.stream.IntStream;

/**
 * packageName : com.learn.java.imperativevsdeclarative
 * fileName : ImperativeVsDeclarativeExample1
 * author : psjw
 * date : 2022-07-20
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-20        psjw         최초 생성
 */
public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         * Imperative - how style of Programming (명령형)
         */
        //MutiThread에서 많은 문제 발생 -> Immutable 하지 않음
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum using Imperative Approach : " + sum);
        /**
         * Declarative Style of Programming - What style of Programming(선언적)
         */
        int sum1 = IntStream.rangeClosed(0, 100) // it splits the values
                .parallel()
                .sum();
        System.out.println("Sum using Imperative Approach : " + sum1);

    }
}
