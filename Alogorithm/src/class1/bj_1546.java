package class1;
/* 
 * 2022/03/29
 * 문제 : 알파벳 대소문자로 된 단어가 주어지면, 
 * 		이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 		단, 대문자와 소문자를 구분하지 않는다.
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