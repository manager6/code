import java.util.Random;
// 打乱数组
public class day_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }


    }
}
