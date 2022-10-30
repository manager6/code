package Study;

import java.util.Random;
import java.util.Scanner;

public class day_04_3 {
    public static void main(String[] args) {
        while (true){
            System.out.println("输入你要查找的数:"+" ");
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            exist(createArr(20,20),n);
            iterate(createArr(20,20));
        }


    }
    //判断数组中某一个数是否存，将结果返回给调用出
    public static int exist(int[] a,int b){
        int e=0;
        for (int i=0; i < a.length; i++) {
            if (a[i]==b){
                e=a[i];
                System.out.print("存在"+" "+e);

            }
        }
        if (e!=b){
            System.out.print("不存在");
        }
        return e;
    }
    public static int[] createArr(int a,int b) {
        Random r = new Random();
        int[] arr = new int[b];
        int m=1;
        for (int i = 1; i < arr.length; i++) {
                m = r.nextInt(a) + 1;
                arr[i] = m;
        }
        return arr;
    }

    public static void iterate(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i]+","+" ");
            }

        }
        System.out.print("]");

    }

}
