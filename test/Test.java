package ui.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        //打乱15个数字，并放到二维数组中

        int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //打乱一维数组
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            int index = random.nextInt(num.length);
            int temp = num[index];
            num[index] = num[i];
            num[i] = temp;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        //放到二维数组中
        int[][] data = new int[4][4];
        for (int i = 0; i < num.length; i++) {
            data[i / 4][i % 4] = num[i];
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
