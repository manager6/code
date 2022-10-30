package Study;
//打印数组
public class day_04_1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        iterate(arr);
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
