/*
 * # ��÷����[1�ܰ�] 30%�� ��÷Ȯ��
 */
//12:46-12:48

package day_02;

import java.util.Random;

public class RandomEx03 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int rotto = ran.nextInt(10);
		
		if(rotto < 3)
			System.out.println("��÷!");
		else
			System.out.println("��!");
	}
}
