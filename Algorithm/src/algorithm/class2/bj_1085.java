package algorithm.class2;
/*
 * 2022.01.16
 * ���� 1085
 * ���� : �Ѽ��� ���� (x, y)�� �ִ�. ���簢���� �� ���� ��ǥ�࿡ �����ϰ�, ���� �Ʒ� �������� (0, 0), 
         ������ �� �������� (w, h)�� �ִ�. 
         ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;
import java.util.Arrays;
public class bj_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		/*int[] arr = {x, y, h-y, w-x};
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);*/
		
		int b = Math.min(x, w-x);
		int c = Math.min(y, h-y);
		
		System.out.println(Math.min(b, c));
	}
}