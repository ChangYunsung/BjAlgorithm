package class2;
/* 
 * 2022/04/01
 * 문제 : 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 
 * 		 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분
 *    	 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력
 */
import java.util.Scanner;
import java.util.Arrays;

public class bj_4153 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0&&b==0&&c==0) {
				break;
			}
			
			if((c*c)==(a*a)+(b*b)) {
				System.out.println("right");
			} else if((a*a)==(b*b)+(c*c)) {
				System.out.println("right");
			} else if((b*b)==(a*a)+(c*c)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		}
	}
}
