package day_02;

import java.util.Scanner;

class IfEx06 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�");
		int fnum = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�");
		int snum = sc.nextInt();
		
		int result1 = fnum*snum;
		System.out.print("��� ���� �Է��Ͻÿ�:");
		int result2 = sc.nextInt();
		
		if(result1 == result2)
			System.out.println("�����Դϴ�.");
		else 
			System.out.println("�����Դϴ�");
	}
}

