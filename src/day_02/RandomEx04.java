/*
 * # Ȧ¦ ����
 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
 * 2. ����� ���� ���ڸ� �����ְ�,
 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
 */
//12:49-12:55

package day_02;

import java.util.Scanner;
import java.util.Random;

public class RandomEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int num = ran.nextInt(100)+1;
		System.out.println("����� ���� ���� = " + num);
		
		if((num%2) == 0){
			System.out.println("���ڰ� ¦��(1), Ȧ��(0)");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("¦�� ���� �Դϴ�.");
			}
			else if(select == 0) {
				System.out.println("Ȧ�� ���� �Դϴ�");
			}
		}
		else if((num%2) != 0){
			System.out.println("���ڰ� ¦��(1), Ȧ��(0)");
			int select = sc.nextInt();
			if(select == 0) {
				System.out.println("Ȧ�� ���� �Դϴ�.");
			}
			else if(select == 1) {
				System.out.println("¦�� ���� �Դϴ�");
			}
		}
	}
}
