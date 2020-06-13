package huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> inputArrayList = new ArrayList<Integer>();
		ArrayList<Integer> minlist = new ArrayList<Integer>();
		while(scanner.hasNext()) {
			int num = scanner.nextInt();
			for(int i = 0; i < num; i++) {
				inputArrayList.add(scanner.nextInt());
			}
			
			for(int i = 0; i < inputArrayList.size() - 1; i++) {
				int min = inputArrayList.get(i);
				int position = i;
				//System.out.println("pos: " + position);
				for(int j = i+1; j < inputArrayList.size(); j++) {
					if(inputArrayList.get(j) < min) {
						min = inputArrayList.get(j);
						position = j;
					}
				}
				if(minlist.size() == 0) minlist.add(min);
				if(minlist.size() > 0 && min != minlist.get(minlist.size() -1 )) 
					minlist.add(min);
				
				int temp = inputArrayList.get(i);
				inputArrayList.set(i, min);
				inputArrayList.set(position, temp);
			}
			if(inputArrayList.get(inputArrayList.size() - 1) != minlist.get(minlist.size() -1))
				minlist.add(inputArrayList.get(inputArrayList.size() - 1));
			
			for(int i = 0; i < minlist.size(); i++) System.out.println(minlist.get(i));
			
			
			inputArrayList.clear();
			minlist.clear();
		}
		scanner.close();

	}
}
