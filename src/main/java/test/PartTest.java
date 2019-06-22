package test;

/**
 * @author junhi
 * @date 2019/6/21 14:56
 */
public class PartTest {

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
