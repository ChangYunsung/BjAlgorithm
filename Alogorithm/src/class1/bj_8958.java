package class1;
/* 
 * 2022/03/28
 * ���� : "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
 * 		 ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
 * 		 ���� ���, 10�� ������ ������ 3�� �ȴ�.
 * 		 "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
 * 		 OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class bj_8958 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		String [] arr = new String [T];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			for (int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					cnt++;
				} else {
					cnt=0;
				}
				sum = sum+cnt;
			}
			System.out.println(sum);
		}
	}
}
