package class1;
/* 
 * 2022/03/24
 * ���� : 9���� ���� �ٸ� �ڿ����� �־��� ��,
 * 		�̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		���� ���, ���� �ٸ� 9���� �ڿ��� 3, 29, 38, 12, 57, 74, 40, 85, 61�� �־�����, 
 * 		�̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
 */
import java.util.Scanner;

public class bj_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				cnt = i+1;
			}
		}
		System.out.println(max);
		if(cnt==0) {
			System.out.println(cnt+1);
		} else {
			System.out.println(cnt);
		}
	}
}
