package class1;
/* 
 * 2022/03/25
 * ���� : 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 
 * 		 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
 * 		 ������ ������ �־����� ��, �̰��� ascending����, descending����, 
 * 		 �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ�
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
