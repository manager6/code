package Study;
//产生验证码
import java.util.Random;

public class day_07_1 {
    public static void main(String[] args) {
        char[] majuscule = new char[52];
        for (int i = 0; i < majuscule.length; i++) {
            if (i <= 25) {
                majuscule[i] = (char) (97 + i);
            } else {
                majuscule[i] = (char) (65 + i - 26);
            }
        }
        String res="";
        Random r = new Random();
        int number = r.nextInt(10);
        for (int i = 0; i < 4; i++) {
            int a=r.nextInt(majuscule.length);
            res=res+majuscule[a];
        }
        System.out.println(res+number);


    }
}
