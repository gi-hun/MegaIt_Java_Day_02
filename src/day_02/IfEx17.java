/*
 * # 369����[1�ܰ�]
 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
 * 2. �� ���� 369�� ������
 * 	1) 2���̸�, ¦¦�� ���
 *  2) 1���̸�, ¦�� ���
 *  3) 0���̸�, �ش� ���ڸ� ���
 * ��)
 * 		33	 : ¦¦
 * 		16	 : ¦
 * 		 7	 : 7
 */
//01:59-02:09
package day_02;

import java.util.Scanner;
import java.util.Random;

public class IfEx17 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = ran.nextInt(50) + 1;
		
		if((num/10)%3 == 0) {
			if((num%10)%3 == 0)
			{
				System.out.println(num+"  :  ¦¦");
			}
			else
			{
				System.out.println(num+"  :   ¦");
			}
		}
		else if((num%10)%3 == 0) {
			if((num/10)%3 == 0)
			{
				System.out.println(num+"  :  ¦¦");
			}
			else
			{
				System.out.println(num+"  :   ¦");
			}
		}
		else
			System.out.println(num+"  :  "+num
					);
	}
}
