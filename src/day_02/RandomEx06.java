/*
 * # ����(0)����(1)��(2) ����[2�ܰ�]
 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
 * 3. com�� me�� ����,
 * 		1) ����.
 * 		2) ���� �̰��.
 * 		3) ���� ����.			�� ����Ѵ�.
 */
//01:07-01:17

package day_02;

import java.util.Scanner;
import java.util.Random;

public class RandomEx06 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		
		System.out.println("��ǻ�ʹ� " + com);
		System.out.println("���ڸ� �Է����ּ���");
		System.out.println("����(0), ����(1), ��(2)");
		int me = sc.nextInt();
		
		if(com == me)
		{
			System.out.println("�����ϴ�.");
		}
		else if(me == 0) {
			if( com == 2)
				System.out.println("�̰���ϴ�");
			else
				System.out.println("�����ϴ�");
		}
		else if(me == 1) {
			if( com == 0)
				System.out.println("�̰���ϴ�");
			else
				System.out.println("�����ϴ�");
		}
		else if(me == 2) {
			if( com == 1)
				System.out.println("�̰���ϴ�");
			else
				System.out.println("�����ϴ�");
		}
	}
}


// ���� �˰����� ����ص� ��Ÿ���� ���� �ٸ��� ����������?