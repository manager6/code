package Study;
//计算票价
import java.util.Scanner;

public class day_05_1 {
    public static void main(String[] args) {
        //旺季5-10月 头等舱9折 经济舱 8.5折 淡季 11-4月 头等舱7折 经济舱 6.5折
        while (true){
            Scanner s =new Scanner(System.in);
            System.out.println("月份:");
            int month =s.nextInt();
            System.out.println("区间:");
            String interval=s.next();
            System.out.println("原票价:");
            int fare =s.nextInt();
            if (month >5 && month <10){
                peaksasonfare(interval,fare);
            }else {
                offseasonfare(interval,fare);
            }

        }
    }
    public static void peaksasonfare(String interval,int fare){

        if(interval.equals("头等舱")){
            double Firstclass =fare*0.9;
            System.out.println("票价是:"+Firstclass);
        }
        if (interval.equals("经济舱")){
            double Economyclass =fare*0.85;
            System.out.println("票价是:"+Economyclass);
        }

    }
    public static void offseasonfare(String interval,int fare){
        if (interval.equals("头等舱")){
            double Firstclass =fare*0.7;
            System.out.println("票价是:"+Firstclass);
        }
        if (interval.equals("经济舱")){
            double Economyclass =fare*0.65;
            System.out.println("票价是:"+Economyclass);
        }

    }

}
