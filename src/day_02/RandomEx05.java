/*
 * # ������ ����[2�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �����ϰ� �����Ѵ�.
 * 2. ����� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */
//12:59-12:01:03

package day_02;

import java.util.Scanner;
import java.util.Random;

public class RandomEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int dan1 = ran.nextInt(9) +1;
		int dan2 = ran.nextInt(9) +1;
		int result = dan1 * dan2;
		
		System.out.print(dan1+"x"+dan2+"=");
		int my_result = sc.nextInt();
		
		if(result == my_result)
			System.out.println("����");
		else
			System.out.println("��");
		
	}
}
