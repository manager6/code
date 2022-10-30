package Study;

import java.util.Random;
import java.util.Scanner;

public class day_04_3 {
    public static void main(String[] args) {
        while (true){
            int[] arr=createArr(20,20);
            System.out.print("输入你要查找的数:"+" ");
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            exist(arr,n);
            boolean flag=exist(arr,20);
            System.out.println(flag);
            iterate(arr);

        }


    }
    //判断数组中某一个数是否存，将结果返回给调用出
    public static boolean exist(int[] a,int b){

        for (int i=0; i < a.length; i++) {
            if (a[i]==b){
                int e=a[i];
                return true;

            }
        }
        return false;
    }
    public static int[] createArr(int a,int b) {
        Random r = new Random();
        int[] arr = new int[b];
        int m;
        for (int i = 0; i < arr.length; i++) {
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
