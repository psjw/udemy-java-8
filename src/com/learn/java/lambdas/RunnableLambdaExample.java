package com.learn.java.lambdas;

/**
 * packageName : com.learn.java.lambdas
 * fileName : RunnableLambdaExample
 * author : psjw
 * date : 2022-07-20
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-20        psjw         최초 생성
 */
public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        /**
         *
         */
        new Thread(runnable).start();

        /**
         * java 8 lambda
         */
        //()->{};
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };
        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnableLambda).start();

        new Thread(runnableLambda1).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable3.1");
            }
        });
        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}
