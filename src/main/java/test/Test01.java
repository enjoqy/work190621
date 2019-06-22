package test;

/**
 * @author junhi
 * @date 2019/6/21 14:15
 */
public class Test01 {

        private static int num = 100;
//        private final Object lockObj = new Object();

    Thread threadA = new Thread(new Runnable() {
        @Override
        public void run() {
            while (num>0) {
//                    synchronized (lockObj) {
//                        lockObj.notifyAll();
                System.out.println(Thread.currentThread().getName() + "->" + num);
                num--;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//                        try {
//                            lockObj.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
            }
        }
    });


        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (num >0) {
//                    synchronized (lockObj) {
//                        lockObj.notifyAll();
                        System.out.println(Thread.currentThread().getName() + "->" + num);
                        num--;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
//                        try {
//                            lockObj.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
                }
            }
        });



    Thread threadC = new Thread(new Runnable() {
        @Override
        public void run() {
            while (num>0) {
//                    synchronized (lockObj) {
//                        lockObj.notifyAll();
                System.out.println(Thread.currentThread().getName() + "->" + num);
                num--;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//                        try {
//                            lockObj.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
            }
        }
    });

        public static void main(String[] args) {
            Test01 CP = new Test01();
            CP.threadA.setName("Thread_A");
            CP.threadB.setName("Thread_B");
            CP.threadC.setName("Thread_C");
            CP.threadA.start();
            CP.threadB.start();
            CP.threadC.start();

    }

}
