package Study;

public class day_04_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        copyfRANGE(arr, 2, 8);
        int[] arr1 = copyfRANGE(arr, 2, 8);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    //将数组从from开始到to结束的元素复制到新的数组中
    public static int[] copyfRANGE(int[] arr, int form, int to) {
        int[] arr1 = new int[to-form];
        int index=0;
        for (int i = form; i <to; i++) {
            arr1[index] = arr[i];
            index++;
        }
        return arr1;
    }
}
