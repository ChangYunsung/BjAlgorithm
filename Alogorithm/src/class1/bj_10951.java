package class1;
/* 
 * 2022/03/23
 * ���� : �� ���� A�� B�� �Է¹��� ����,
		A+B�� ����ϴ� ���α׷��� �ۼ� �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 */
import java.util.Scanner;

public class bj_10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}

