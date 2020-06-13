package huawei;

import java.util.Scanner;
// https://blog.csdn.net/huyr_123/article/details/81670972
public class Zuixiaogongbeishu {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int beishu = A * B;
        
        // 辗转相除法求最大公约数
        int c = A % B;
        while(c != 0){
            A = B;
            B = c;
            c = A % B;
        }
        int minbeishu = beishu / c;
        System.out.println(minbeishu);
        
        in.close();
    }
}
