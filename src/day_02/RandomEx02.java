/*
 * # ���� ����
 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
 * 3. ������ �յ޸��� ���ߴ� �����̴�.
 */
//12:40-12:43
package day_02;


import java.util.Scanner;
import java.util.Random;

public class RandomEx02 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.println("��(1), ��(0)���� �����Ͻÿ�");
		int select = sc.nextInt();
		
		if(coin == select)
			System.out.println("����");
		else if(coin != select)
			System.out.println("��");
	}
}

//���� Ǭ���̶� �����̶� �ٸ��� �����?
// �ִ� Ǯ �� ���� ���� ������ �ƴϸ� if�� ��ø���� Ǯ���µ� ������ �޶��� -> ���� �˰����� ���Ƽ� �ܿ�
//������ ������ �˰����� ���� �������
