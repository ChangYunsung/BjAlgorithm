package class1;
/* 
 * 2022/03/21
 * 문제 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class bj_2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=N; i>=1; i--) {
			System.out.println(i);
		}
	}

}
