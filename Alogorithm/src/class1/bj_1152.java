package class1;
/* 
 * 2022/03/24
 * ���� : ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? 
 * 		 �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * 		 ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 */

import java.util.Scanner;

public class bj_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		s=s.trim();
		String[] arr = s.split(" ");
		if(s.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(arr.length);
		}
	}
}