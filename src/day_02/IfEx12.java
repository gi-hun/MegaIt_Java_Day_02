/*
 * # �ִ밪 ���ϱ�[1�ܰ�]
 * 1. ���� 3���� �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� ���Ͽ�,
 * 3. ���� ū ��(MAX)�� ����Ѵ�.
 */
//12:26-12:32

package day_02;

import java.util.Scanner;

public class IfEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� A�� �Է����ּ���");
		int A = sc.nextInt();
		System.out.println("���� B�� �Է����ּ���");
		int B = sc.nextInt();
		System.out.println("���� C�� �Է����ּ���");
		int C = sc.nextInt();
		
		int max = A;
		
		if(max < B) {
			max =B;
		}
		if(max < C) {
			max = C;
		}
		
		System.out.println("�ִ�:" + max);
	}
}
