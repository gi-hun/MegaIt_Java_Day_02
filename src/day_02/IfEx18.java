/*
 * # ����ö ��� ���
 * 1. �̿��� ������ ���� �Է¹޴´�.
 * 2. ������ ���� ������ ���� ���� ����� ����ȴ�.
 * 3. ���ǥ
 * 1) 1~5	: 500��
 * 2) 6~10	: 600��
 * 3) 11,12 : 650��
 * 4) 13,14 : 700��
 * 5) 15,16 : 750��
 * ... 
 */
//02:19-02:24

package day_02;


import java.util.Scanner;

public class IfEx18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �������� �̿��� �� �ΰ�?");
		int user = sc.nextInt();
		
		if(user >= 15)
			System.out.println("750��");
		else if(user >= 13)
			System.out.println("700��");
		else if(user >= 11)
			System.out.println("650��");
		else if(user >= 6)
			System.out.println("600��");
		else if(user >= 1)
			System.out.println("550��");
	}
}
