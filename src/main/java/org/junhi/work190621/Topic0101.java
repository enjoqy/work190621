package org.junhi.work190621;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author junhi
 * @date 2019/6/21 15:56
 */
public class Topic0101 {

    static int count = 0;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int j = 0; j < 100; j++) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    count++;
                    System.out.println(Thread.currentThread().getName() + "通过了：" + count + "人");
                }
            });
        }

    }
}
