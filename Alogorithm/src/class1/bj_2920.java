package class1;
/* 
 * 2022/03/25
 * 문제 : 1부터 8까지 차례대로 연주한다면 ascending, 
 * 		 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 		 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 
 * 		 아니면 mixed인지 판별하는 프로그램을 작성
 */
import java.util.Scanner;

public class bj_2920 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [8];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		String result = " ";
		
		for(int i=0; i<arr.length-1; i++) {
			if (arr[i]+1==arr[i+1]) {
				result = "ascending";
			} else if (arr[i]-1==arr[i+1]) {
				result = "descending";
			} else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}
}
