package day_02;

import java.util.Scanner;

public class day0403 {
	public static void main(String[] args) {
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ		
		int cash = 20000;  // �Աݽ� ����  , ��ݽ� ����
		int balance = 30000; // �Աݽ� ���� , ��ݽ� ���� 
		int account  = 11111; // �α��ν� ���
		int password  = 1234; // �α��ν� ��� 
		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.�α��� 2.����");
		int select = scan.nextInt();
		if(select == 1) {
			System.out.println("���¿� ��й�ȣ�� �Է��ϼ��� ");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			if(acc == account && password == pw) {
				System.out.println("1.�Ա� 2.��� 3.��ȸ");
				select = scan.nextInt();
				if(select == 1) {
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
					int deposit = scan.nextInt();
					cash = cash - deposit;
					balance = balance + deposit;
				}else if(select == 2) {
					System.out.println("����� �ݾ��� �Է��ϼ���");
					int withdraw = scan.nextInt();
					cash = cash + withdraw;
					balance = balance - withdraw;
				}else if(select == 3) {
					System.out.println("��ȸ : " + balance + "��");
				}
			}
			else {
				System.out.println("���̵�� �н����带 Ȯ�����ּ���.");
			}
		}
		else if(select == 2) {
			System.out.println("����");
		}	
	}
}

