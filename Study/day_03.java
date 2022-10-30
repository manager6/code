package Study;

public class day_03 {
    public static void main(String[] args) {
        double mianji1=gitmianji(4.1,2.2);
        double mianji2=gitmianji(3.1,3.2);

        if (mianji1>mianji2){
            System.out.print("第一个长方形大");
        }else {
            System.out.print("第二个长方形大");
        }


    }
    public static double gitmianji(double a,double b){
        double mianji =a*b;
        return mianji;

    }
}
