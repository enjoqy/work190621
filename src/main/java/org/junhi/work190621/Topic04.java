package org.junhi.work190621;

/**
 * 4. 有一个长阶梯，每一步上2阶，最后剩1阶；若每一步上3阶；最后剩2阶；若每一步上5阶；最后剩4阶；若每一步上6阶；
 * 最后剩5阶；只有每步上7阶，最后一阶也不剩。请问该阶梯至少有多少阶？
 * 编写一个Java程序解决该问题
 * @author junhi
 * @date 2019/6/21 11:56
 */
public class Topic04 {

    private static int count;

    public static void main(String[] args) {
        get();
    }

    public static void get(){
        for(;;){
            count++;
            if(count % 2 == 1 && count % 3 == 2 && count % 5 == 4 && count % 6 == 5 && count % 7 == 0){
                System.out.println(count);
                break;
            }
        }
    }
}
