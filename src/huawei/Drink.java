package huawei;

import java.util.Scanner;

public class Drink{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int empty = scanner.nextInt();
            if(empty == 0) break;
            int totaldrink = 0;
            int drinkable = empty/3;
            
            while(drinkable > 0){
                totaldrink = totaldrink + drinkable;
                empty = drinkable + empty%3;
                drinkable = empty/3;
                if(empty == 2) totaldrink ++;
            }
            System.out.println(totaldrink);
        }
        
        scanner.close();
    }
}