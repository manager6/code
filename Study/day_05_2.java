package Study;
//反转数字
import java.util.Scanner;

public class day_05_2 {
    public static void main(String[] args) {
        while (true){
            Scanner s=new Scanner(System.in);
            System.out.println("输入测试值:");
            int n=s.nextInt();
            int a = fanzhuan(n);
            System.out.println(a);
        }

    }

    public static int fanzhuan(int x) {
        int res = 0;
        while (x != 0) {
            int temp = x % 10;
            if (res > 214748364 || (temp > 7 && res == 214748364)) {
                return 0;

            }
            if (res < -214748364 || (temp < -8 && res == -214748364)) {
                return 0;
            }
            res = res * 10 + temp;
            x=x/10;
        }

        return res;
    }
}
