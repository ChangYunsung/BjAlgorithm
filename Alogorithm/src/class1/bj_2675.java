package class1;
/* 
 * 2022/03/25
 * ���� : ���ڿ� S�� �Է¹��� �Ŀ�, 
 * 		 �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		 ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. 
 * 		 S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
 */
import java.util.Scanner;

public class bj_2675 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int R = sc.nextInt();
			String s = sc.nextLine();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}	
	}
}
