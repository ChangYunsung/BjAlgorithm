package class2;
/* 
 * 2022/04/01
 * ���� : ���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. 
 * 		 �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� ����
 *    	 �� �Է¿� ���� ���� �ﰢ���� �´ٸ� "right", �ƴ϶�� "wrong"�� ���
 */
import java.util.Scanner;
import java.util.Arrays;

public class bj_4153 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0&&b==0&&c==0) {
				break;
			}
			
			if((c*c)==(a*a)+(b*b)) {
				System.out.println("right");
			} else if((a*a)==(b*b)+(c*c)) {
				System.out.println("right");
			} else if((b*b)==(a*a)+(c*c)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		}
	}
}
