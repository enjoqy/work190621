package org.junhi.work190621;

import java.util.Random;
import java.util.Scanner;

/**
 * 2.编写一个猜数字游戏，随机给出一个0~99的数字，然后让玩家猜测是什么数字，玩家输入猜测的具体数字之后，
 * 游戏会提示太大还是太小，在玩家猜测的同时记录玩家猜测的次数，直到玩家猜测正确，循环结束，
 * 控制台打印游戏结束提示并且显示玩家一共猜测了多少次
 *
 * @author junhi
 * @date 2019/6/21 10:54
 */
public class Topic02 {

    private static int count = 0;

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println(randomInt);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要猜的数字！");


        for (;;){
            int tmp = scanner.nextInt();
            count++;
            if (tmp == randomInt){
                System.out.println("恭喜你猜中了！\n" + "答案是：\t" + randomInt + "\n共猜了\t" + count + "\t次");
                break;
            }
            if(tmp > randomInt){
                System.out.println("可以猜小一点！");
            }
            if(tmp < randomInt){
                System.out.println("可以猜大一点！");
            }
        }


    }
}
