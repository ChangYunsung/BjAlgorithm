package algorithm.class1;
/*
 * 2022.01.13
 * 백준 1008
 * 문제 :두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성
 */
import java.util.Scanner;

public class bj_1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		System.out.println(a/b);
	}
}