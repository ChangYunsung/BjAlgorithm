package class1;
/* 
 * 2022/03/22
 * ���� : N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;

public class bj_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr= new int [N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[N-1];
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min+" "+max);
	}
}

