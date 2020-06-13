package huawei;

import java.util.Scanner;

public class Zishoushu {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			int count = 0;
			for(int i = 0; i <= n; i++) {
				if(String.valueOf(i * i).endsWith(String.valueOf(i))) count ++;
			}
			System.out.println(count);
		}
		in.close();
	}
}


/**
 * 原始做法：时间效率，空间效率都高于现在的做法
 */
//import java.util.Scanner;
//import java.lang.Math;
//import java.lang.Integer;
//public class Main{
//    
//    public static void main(String []args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            int n = in.nextInt();
//            int num = CalcAutomorphicNumbers(n);
//            System.out.println(num);
//        }
//    }
//    
//    public static int CalcAutomorphicNumbers( int n){
//        int count = 0;
//        for(int i = 1; i <= n; i++){
//            int weishu = CalcWeishu(i);
//            int sqar = i * i;
//            int temp = sqar;
//            int wei = 0;
//            for(int j = 0; j < weishu; j++){
//                wei = wei + (temp % 10) * sqar(j);
//                temp = temp / 10;
//            }
//            if(wei == i) count ++;
//        }
//        return count+1;
//    }
//    
//    private static int CalcWeishu(int number){
//        int temp = number / 10;
//        int count = 1;
//        while(temp != 0){
//            number = temp;
//            temp = number / 10;
//            count ++;
//        }
//        return count;
//    }
//    
//    private static int sqar(int b){
//        int value = 1;
//        if(b == 0) return value;
//        else{
//            for(int i = 0; i < b; i++){
//                value = value * 10;
//            }
//        }
//        return value;
//    }
//}