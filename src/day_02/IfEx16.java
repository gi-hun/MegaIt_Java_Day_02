/*
 * # ��� ���� ���߱� ����
 * 1. 150~250 ������ ���� ���� ����
 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
 * ��)
 * 		249		: 4
 */
//01:46-01:56

package day_02;

import java.util.Scanner;
import java.util.Random;

public class IfEx16 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = ran.nextInt(101) + 150;
		System.out.println("���� ���� ����");
		System.out.println(num);
		
		System.out.println("��� ���ڸ� ���Ͻÿ�:");
		int select = sc.nextInt();
		int result = num/10%10;
		
		if(select == result)
		{
			System.out.println(num+"    :    "+select);
			System.out.println("����!");
		}
		else if(select != result)
		{
			System.out.println(num+"    :    "+select);
			System.out.println("����!");
		}
	}
}
