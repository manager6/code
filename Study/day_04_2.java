package Study;

public class day_04_2 {
    public static void main(String[] args) {
        int[] arr={1,5,7,3,9,2};
        int max = max(arr);
        System.out.println(max);
    }

    //求数组最大值，并返回
    public static int max(int[] a){
        int temp=a[0];
        for (int i = 0; i < a.length; i++) {
            if (temp<a[i]){
                temp=a[i];
            }
        }
        return temp;
    }
}
