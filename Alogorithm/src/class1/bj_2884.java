package class1;
/* 
 * 2022/03/22
 * ���� : 45�� ���� �˶� �����ϱ�
 * 		ù° �ٿ� �� ���� H�� M�� �־�����. 
 * 		(0 �� H �� 23, 0 �� M �� 59) 
 * 		�׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
		�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, 
		���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
 */
import java.util.Scanner;

public class bj_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H==0 && M<45) {
			System.out.println(23 + " " + (M+15));
		} else if (M<45) {
			System.out.println((H-1) + " " + (M+15));
		} else {
			System.out.println(H + (M-45));
		}
		
	}
}

