package class1;
/* 
 * 2022/03/23
 * ���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		 �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 �Է��� ���������� 0 �� ���� ���´�.
 */
import java.util.Scanner;

public class bj_10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
		}
	}
}

