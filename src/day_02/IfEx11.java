/*
 * # ������ ���[1�ܰ�]
 * 1. �޴����� ����Ѵ�.
 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
 * 3. ������ �Է¹޴´�.
 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
 */
//12:16-12:24
package day_02;

import java.util.Scanner;

public class IfEx11 {
	public static void main(String[] args) {
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �������ּ���");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("������ �Է����ּ��� ");
			int cash = sc.nextInt();
			System.out.println("==������==");
			System.out.println("�Ұ�����");
			System.out.println("�ܵ�:"+ (cash-price1));
			if((cash < price1) || (cash < 0))
				System.out.println("������ �����մϴ�.");
		}
		else if(select == 2) {
			System.out.println("������ �Է����ּ��� ");
			int cash = sc.nextInt();
			System.out.println("==������==");
			System.out.println("���� ����");
			System.out.println("�ܵ�:"+ (cash-price2));
			if((cash < price2) || (cash < 0))
				System.out.println("������ �����մϴ�.");
		}
		else if(select == 3) {
			System.out.println("������ �Է����ּ��� ");
			int cash = sc.nextInt();
			System.out.println("==������==");
			System.out.println("��    ��");
			System.out.println("�ܵ�:"+ (cash-price3));
			if((cash < price3) || (cash < 0))
				System.out.println("������ �����մϴ�.");
		}
	}
}
