package org.junhi.work190621;

/**
 * @author junhi
 * @date 2019/6/21 15:59
 */
public class Topic03 implements Runnable {

    static int count = 0;

    @Override
    public void run() {
        int num = Topic003.num;
        while (true) {
            synchronized (this){
                if(num > 0){
                    count += 100;
                    num--;
                    System.out.println(Thread.currentThread().getName() + "\t转了100元，现在总计：" + count);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }


    public static void main(String[] args) {

        Topic03 topic03 = new Topic03();
        Thread thread1 = new Thread(topic03, "顾客1");
        Thread thread2 = new Thread(topic03, "顾客2");
        thread1.start();
        thread2.start();

    }


}
