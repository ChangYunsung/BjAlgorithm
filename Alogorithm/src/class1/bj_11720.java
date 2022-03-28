package class1;
/* 
 * 2022/03/28
 * 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 		첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 */
import java.util.Scanner;

public class bj_11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String s = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum = s.charAt(i)-'0'+sum;
		}
		
		System.out.println(sum);
	}
}
