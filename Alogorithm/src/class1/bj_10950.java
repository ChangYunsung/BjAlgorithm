package class1;
/* 
 * 2022/03/23
 * ���� :�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, 
		�� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 */
import java.util.Scanner;

public class bj_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int [] arr = new int [T];
		
		for(int i=0; i<arr.length; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b;
		}
		
		for (int i : arr) {
			System.out.println();
		}
	}
}

