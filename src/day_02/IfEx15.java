/*
 * # ATM[1�ܰ�] : ��ü�ϱ�
 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
 * 2. ���¹�ȣ�� ��ġ�ϸ�,
 * 3. ��ü�� �ݾ��� �Է¹޴´�.
 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
 * 			myMoney   - ��ü�� �ݾ�
 * 			yourMoney + ��ü�� �ݾ�
 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
 */
//01:23-01:33
package day_02;

import java.util.Scanner;

public class IfEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");
		
		System.out.println("��ü�� ���¹�ȣ�� �Է����ּ���");
		int your_input = sc.nextInt();
		
		if(your_input == yourAcc) {
			System.out.println("��ü�� �ݾ��� �Է� ���ּ���");
			int money = sc.nextInt();
			if(money > myMoney) {
				System.out.println("�ѵ� �ʰ�");
			}
			else {
				myMoney = myMoney- money;
				yourMoney = yourMoney + money;
				System.out.println("�� �ܾ�: " + myMoney);
				System.out.println("��ü�� ���� �ܾ�" + yourMoney);
			}
		}
		
		else
			System.out.println("���� ��ȣ�� Ȯ�����ּ���");
		
	}
}
