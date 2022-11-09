package Study;
//复制数组
public class day_07_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] newarr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i]=arr[i];
            System.out.print(newarr[i]+" ");
        }

    }
}
