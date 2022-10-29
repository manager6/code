public class day_02 {
    //方法
    public static void main(String[] args) {
        qiuhe(2,3);
        chengfa(2,3);
        chufa(2,3);
    }
    public static void qiuhe(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void chengfa(int a,int b){
        int sum=a*b;
        System.out.println(sum);
    }
    public static void chufa(float a,float b){
        double sum=a/b;
        System.out.println(sum);
    }
}
