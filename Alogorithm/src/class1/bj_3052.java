package class1;
/* 
 * 2022/03/28
 * ���� : �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
 * 		 ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
 * 		 �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
 * 		 �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;

public class bj_3052 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		int cnt = 0;
		int tmp = 0;
		
		for(int i=0; i<arr.length; i++) {
			tmp = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					tmp++;
				} 
			} if (tmp==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
