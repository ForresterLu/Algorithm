package bytedance;

import java.util.Scanner;

//�ҽ����󴸣���һ�ҳ�����ı༭���Ҹ���У��Ͷ������Ӣ�ĸ������ݹ����ǳ����ˣ���Ϊÿ�춼Ҫȥ����������ƴд���󡣵��ǣ��������������ƽ���Ĺ����з��������ҷ���һ������ƴд����Ľݾ���
//
//1. ����ͬ������ĸ����һ��һ����ƴд����ȥ��һ���ľͺ��������� helllo -> hello
//2. ����һ������ĸ��AABB�ͣ�����һ��һ����ƴд����ȥ���ڶ��Ե�һ����ĸ�ͺ��������� helloo -> hello
//3. ����Ĺ������ȡ������ҡ�ƥ�䣬�������AABBCC����ȻAABB��BBCC���Ǵ���ƴд��Ӧ�����ȿ����޸�AABB�����ΪAABCC
//
//�������Ǹ���ţ���������ѧ���ھ���ͳ�����ƣ��������ԭ��д��һ���Զ�У����������Ч�ʴӴ���ɡ��ò��˶�ã��Ҿͻ����CEO�����϶��³���ӭȢ�׸��������������۷壬���붼�е�С�����أ�
//����
//����û�뵽���ұ������ˣ�����ʱ�ϰ����˵�� ����������Ҫ����ҵҵ�����ڿҿҡ������ַ֣���Ҫ���У���һ����һ�С�һ���������У�Ҫ�ǲ��У���һ�в���һ�У�һ�в������в��С��� �����������˺����л��㱵ġ���
//
//�����⣺��ʵ�ִ󴸵��Զ�У�Գ���
//
//��������:
//��һ�а���һ������N����ʾ���������������ٸ���У����ַ�����
//
//�������N�У�ÿ��Ϊһ����У����ַ�����
//
//�������:
//N�У�ÿ�а���һ�����޸�����ַ�����
//
//��������1:
//2
//helloo
//wooooooow
//
//�������1:
//hello
//woow

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
