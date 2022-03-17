package class1;
/* 
 * 2022/03/17
 * 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성
 */

import java.util.Scanner;

public class bj_1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a-b);
		
	}
}