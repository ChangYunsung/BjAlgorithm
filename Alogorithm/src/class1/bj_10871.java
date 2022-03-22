package class1;
/* 
 * 2022/03/22
 * 문제 :정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, 
 * 		A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성
 */
import java.util.Scanner;

public class bj_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int [] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<X) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

