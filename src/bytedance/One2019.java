package bytedance;

import java.util.Scanner;

public class One2019 {
	public static void main(String[] args) {
		
		//method one: use regx
//		Scanner scanner = new Scanner(System.in);
//		int line = scanner.nextInt();
//		scanner.nextLine();
//		for(int i = 0; i < line; i++) {
//			System.out.println(scanner.nextLine().replaceAll("(.)\\1+", "$1$1").replaceAll("(.)\\1(.)\\2", "$1$1$2"));
//		}
//		scanner.close();
		
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		String []s = new String[N];
		input.nextLine();
		for(int i = 0; i < N; i++) {
			s[i] = input.nextLine();
		}
		input.close();

		
		for (int i = 0; i < s.length; i++) {
			int k = 0;
			StringBuffer sb = new StringBuffer();
			char []temp = new char[s[i].length()];
			for(int j = 0; j < s[i].length(); j++) {
				temp[k] = s[i].charAt(j);
				if(k >= 2 && temp[k] == temp[k-1] && temp[k-1] == temp[k-2]) k--;
				if(k >=3 && temp[k] == temp[k-1] && temp[k-2] ==temp[k-3]) k--;
				k++;
			}
			
			for(int m = 0; m < k; m++) sb.append(temp[m]);
			s[i] = sb.toString();
		}
		
		
		
		for(int k = 0; k < N; k++) {
			System.out.println(s[k]);
		}
	}
}
