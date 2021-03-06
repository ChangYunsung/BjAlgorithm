package class2;
/* 
 * 2022/03/31
 * 문제 : 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
 * 		 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
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
		
		int [] arr = {x, y, w-x, h-y};

		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		
	}
}
