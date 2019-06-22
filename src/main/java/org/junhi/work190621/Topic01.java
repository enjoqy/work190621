package org.junhi.work190621;

/**
 * 1.某公司有100名员工，每天上班时随机从正门，侧门，后门进入公司，利用多线程模拟入场过程，
 * 并分别统计每个入口入场的人数
 *
 * @author junhi
 * @date 2019/6/21 10:15
 */
public class Topic01 implements Runnable {


    private static int i = 0;

    @Override
    public void run() {
        int m = 0;
        while (i < 98) {
            m++;
            sell();
        }
        System.out.println(Thread.currentThread().getName() + "通过了：" + m + "人");
    }

    public static synchronized void sell() {
        i++;
        System.out.println(Thread.currentThread().getName() + "通过第" + i + "个人");

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Topic01 topic01 = new Topic01();
        Thread thread1 = new Thread(topic01, "正门");
        Thread thread2 = new Thread(topic01, "侧门");
        Thread thread3 = new Thread(topic01, "后门");
        thread1.start();
        thread2.start();
        thread3.start();

    }

}
