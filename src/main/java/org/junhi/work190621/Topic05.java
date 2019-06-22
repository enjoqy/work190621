package org.junhi.work190621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * 5.文件a.txt中内容为afdgfsdfsdfwedsfsdfsf,编写程序读取该文件内容，去掉重复字符后按自然排序输出到控制台
 *
 * @author junhi
 * @date 2019/6/21 11:09
 */
public class Topic05 {

    public static void main(String[] args) throws IOException {
        sort("a.txt");
    }

    public static void sort(String fileName) throws IOException {

        //读取文本内容
        InputStream resourceAsStream = Topic05.class.getClassLoader().getResourceAsStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        while ((str = bufferedReader.readLine()) != null){
            stringBuilder.append(str);
        }
        System.out.println(stringBuilder.toString());

        //自然排序
        char[] strArr = stringBuilder.toString().toCharArray();
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = 0; j < strArr.length - i - 1; j++) {
                if(strArr[j] > strArr[j + 1]){
                    char tmp = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = tmp;
                }
            }
        }

        //使用linkedList的特性去重
        LinkedList<String> strLink = new LinkedList<>();
        StringBuilder strTmp = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if(strLink.contains(String.valueOf(strArr[i]))){
                continue;
            }else {
                strLink.add(String.valueOf(strArr[i]));
                strTmp.append(strArr[i]);
            }
        }

        System.out.println(strTmp.toString());
        strLink.forEach(i -> System.out.println(i));
    }
}
