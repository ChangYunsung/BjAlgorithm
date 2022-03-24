package class1;
/* 
 * 2022/03/24
 * 문제 : 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
 * 		 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 		 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 * 		 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */
import java.util.Scanner;

public class bj_2577 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int x = A*B*C;
		String s = Integer.toString(x);
		
		for(int i=0; i<10; i++) {
			int cnt = 0;
			for(int j=0; j<s.length(); j++) {
				if((s.charAt(j)-'0')==i) {
					cnt++;
				}
			} 
			System.out.println(cnt);
		}
		
	}
}
