package com.charl;

import java.util.concurrent.Semaphore;

/**
 * Create by charl
 * Date 2020/7/21 13:21
 */
public class ThreadLocalDemo {

    private static ThreadLocal<Integer> localInt = new ThreadLocal<>();

    private static Semaphore semaphore = new Semaphore(1);

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
//        new Thread(() -> {
//            localInt.set(1);
//            Integer integer = localInt.get();
//            System.out.println(integer);
//            localInt.set(5);
//            Integer integer1 = localInt.get();
//            System.out.println(integer1);
//        }).start();
//        new Thread(() -> {
//            localInt.set(2);
//            Integer integer = localInt.get();
//            System.out.println(integer);
//        }).start();
//        new Thread(() -> {
//            localInt.set(3);
//            Integer integer = localInt.get();
//            System.out.println(integer);
//        }).start();
//
//        System.out.println(111);
//

        Thread thread1 = new Thread(() -> {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count += 1;
            System.out.println(Thread.currentThread().getName() + ",数量：" + count);
            semaphore.release();
        });


        Thread thread2 = new Thread(() -> {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count += 1;
            System.out.println(Thread.currentThread().getName() + ",数量：" + count);
            semaphore.release();
        });

        while (count <= 10) {
            thread1.start();
            thread2.start();
        }


    }

}
