package com.learn.java.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName : com.learn.java.imperativevsdeclarative
 * fileName : ImperativeVsDeclarativeExample2
 * author : psjw
 * date : 2022-07-20
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-20        psjw         최초 생성
 */
public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
        /**
         * Imperative
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }

        System.out.println("uniqueList : "+uniqueList);
        /**
         * declarative
         */

        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueList1 : "+uniqueList1);

    }
}
