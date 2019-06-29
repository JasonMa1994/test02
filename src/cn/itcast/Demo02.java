package cn.itcast;

/**
 * Author: 骑猪撞地球QAQ
 * Date: 2019/6/29 19:52
 * Content:
 */
public class Demo02 {
    static {
        int i = 5;
    }

    static int i, y;

    public static void main(String[] args) {
        for (int l = 0; l < 10; l++) {
            i++;
            y++;
        }
        System.out.println( i + y);
    }
}
