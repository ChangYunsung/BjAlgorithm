package class1;
/* 
 * 2022/03/22
 * ���� :���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, 
 * 		A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;

public class bj_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int [] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<X) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

