package class1;
/* 
 * 2022/03/28
 * ���� : N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 */
import java.util.Scanner;

public class bj_11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String s = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum = s.charAt(i)-'0'+sum;
		}
		
		System.out.println(sum);
	}
}
