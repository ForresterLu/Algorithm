package huawei;

public class Paixu {
	public static void main(String[] args) {
		int a[];
	}

}



//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
// 
//public class Main {     public static void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag){
//        //降序
//        if(iSortFlag == 1){
//            Arrays.sort(pIntegerArray, new Comparator<Integer>(){                 <a href="/profile/992988" data-card-uid="992988" class="js-nc-card" target="_blank">@Override                 public int compare(Integer o1, Integer o2) {                     return o2 - o1;                 }
//                 
//            });
//        }
//        //默认是升序
//        else{
//            Arrays.sort(pIntegerArray);
//        }
//         
//        for(int i = 0; i < pIntegerArray.length; i++){
//            if(i == pIntegerArray.length - 1){
//                //最后一个空格不能加
//                System.out.print(pIntegerArray[i]);
//            }else{
//                System.out.print(pIntegerArray[i]+" ");
//            }
//        }
//        //没有换行会报错
//         System.out.println();
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        //不能缺少while(sc.hasNext())
//        while(sc.hasNext()){
//            int times = sc.nextInt();
//            Integer[] arr = new Integer[times];
//            for(int i = 0; i < times; i++){
//                arr[i] = sc.nextInt();
//                }
//            int flag = sc.nextInt();
//            sortIntegerArray(arr, flag);
//        }
//    }
//}

/***
 * 解法1：时间效率160ms，空间效率：15500k
 */
//import java.util.Scanner;
//import java.lang.Integer;
//public class Main{
//    public static void main(String []args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            int n = in.nextInt();
//            Integer a[] = new Integer[n];
//            for(int i = 0; i < n; i++){
//                a[i] = in.nextInt();
//            }
//            int iSortFlag = in.nextInt();
//            
//            sortIntegerArray(a, iSortFlag);
//        }
//    }
//    
//    private static void sortIntegerArray(Integer[]array, int iSortFlag){
//        if(iSortFlag == 0){
//            int min = array[0];
//            int key = 0;
//            for(int i = 0; i < array.length - 1; i++){
//                min = array[i];
//                key = i;
//                for(int j = i+ 1; j < array.length; j++){
//                    if(array[j] < min){
//                        min = array[j];
//                        key = j;
//                    }
//                }
//                int temp = array[i];
//                array[i] = min;
//                array[key] = temp;
//            }
//        }else if(iSortFlag == 1){
//            int max = array[0];
//            int key = 0;
//            for(int i = 0; i < array.length - 1; i++){
//                max = array[i];
//                key = i;
//                for(int j = i + 1; j < array.length; j++){
//                    if(array[j] > max){
//                        max = array[j];
//                        key = j;
//                    }
//                }
//                int temp = array[i];
//                array[i] = max;
//                array[key] = temp;
//            }
//        }
//        
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }
//}