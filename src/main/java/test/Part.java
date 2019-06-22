package test;

/**
 * @author junhi
 * @date 2019/6/21 14:55
 */
public class Part implements Runnable {

    private int i = 0;

    @Override
    public void run() {
        int m = 0;
        while (i < 98) {
            m++;
            sell();
        }
        System.out.println(Thread.currentThread().getName() + "通过了：" + m + "人");
    }

    public synchronized void sell() {
        i++;
        System.out.println(Thread.currentThread().getName() + "通过第" + i + "个人");

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        Part part = new Part();
        Thread thread1 = new Thread(part, "正门");
        Thread thread2 = new Thread(part, "侧门");
        Thread thread3 = new Thread(part, "后门");
        thread1.start();
        thread2.start();
        thread3.start();
    }


}

