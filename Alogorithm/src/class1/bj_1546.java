package class1;
/* 
 * 2022/03/29
 * ���� : ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
 * 		�� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * 		��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 */
import java.util.Scanner;

public class bj_1546 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double [] arr = new double [N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i]/max*100;
		}
		
		System.out.println(sum/N);
	}
}
;