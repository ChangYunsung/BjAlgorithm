package class1;
/* 
 * 2022/03/24
 * ���� : �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 
 * 		 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		 ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
 * 		 ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 */
import java.util.Scanner;

public class bj_2577 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int x = A*B*C;
		String s = Integer.toString(x);
		
		for(int i=0; i<10; i++) {
			int cnt = 0;
			for(int j=0; j<s.length(); j++) {
				if((s.charAt(j)-'0')==i) {
					cnt++;
				}
			} 
			System.out.println(cnt);
		}
		
	}
}
